package com.aws.athena;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;

//import java.util.logging.Logger;

import org.slf4j.LoggerFactory;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.amazonaws.services.athena.model.QueryExecutionState;

import software.amazon.awssdk.services.athena.AthenaClient;
import software.amazon.awssdk.services.athena.model.ColumnInfo;
import software.amazon.awssdk.services.athena.model.Datum;
import software.amazon.awssdk.services.athena.model.GetQueryExecutionRequest;
import software.amazon.awssdk.services.athena.model.GetQueryExecutionResponse;
import software.amazon.awssdk.services.athena.model.GetQueryResultsRequest;
import software.amazon.awssdk.services.athena.model.GetQueryResultsResponse;
import software.amazon.awssdk.services.athena.model.QueryExecutionContext;
import software.amazon.awssdk.services.athena.model.ResultConfiguration;
import software.amazon.awssdk.services.athena.model.Row;
import software.amazon.awssdk.services.athena.model.StartQueryExecutionRequest;
import software.amazon.awssdk.services.athena.model.StartQueryExecutionResponse;
import software.amazon.awssdk.services.athena.paginators.GetQueryResultsIterable;

@SpringBootApplication
public class App {
	public static void main(String[] args) {
		SpringApplication.run(App.class, args);

	}

	private static final Logger logger = LoggerFactory.getLogger(App.class);

	private static final String ATHENA_DATABASE = "antilio";

	private static final String ATHENA_OUTPUT_S3_FOLDER_PATH = "s3://unikovecsv/outputQuerys/";

	private static final String SIMPLE_ATHENA_QUERY = "select * from unikovenew where renewaldate\r\n"
			+ " >('27/03/2016')";
	private static final long SLEEP_AMOUNT_IN_MS = 1000;

	public void run(String... args) throws Exception {

		AthenaClientFactory factory = new AthenaClientFactory();
		AthenaClient athenaClient = factory.createClient();

		logger.info("Query submitted: " + System.currentTimeMillis());
	}

	private static String submitAthenaQuery(AthenaClient athenaClient) {

		QueryExecutionContext queryExecutionContext = QueryExecutionContext.builder().database("antilio").build();

		ResultConfiguration resultConfiguration = ResultConfiguration.builder()
				.outputLocation("s3://unikovecsv/outputQuerys/").build();

		StartQueryExecutionRequest startQueryExecutionRequest = StartQueryExecutionRequest.builder()
				.queryString("select * from unikovenew where renewaldate\r\n" + " >('27/03/2016')")
				.queryExecutionContext(queryExecutionContext).resultConfiguration(resultConfiguration).build();

		StartQueryExecutionResponse startQueryExecutionResponse = athenaClient
				.startQueryExecution(startQueryExecutionRequest);

		return startQueryExecutionResponse.queryExecutionId();
	}

	private static void waitForQueryToComplete(AthenaClient athenaClient, String queryExecutionId)
			throws InterruptedException {

		GetQueryExecutionRequest getQueryExecutionRequest = GetQueryExecutionRequest.builder()
				.queryExecutionId(queryExecutionId).build();

		GetQueryExecutionResponse getQueryExecutionResponse;

		boolean isQueryStillRunning = true;

		while (isQueryStillRunning) {
			getQueryExecutionResponse = athenaClient.getQueryExecution(getQueryExecutionRequest);
			String queryState = getQueryExecutionResponse.queryExecution().status().state().toString();

			if (queryState.equals(QueryExecutionState.FAILED.toString())) {
				throw new RuntimeException("Query Failed to run with Error Message: "
						+ getQueryExecutionResponse.queryExecution().status().stateChangeReason());
			} else if (queryState.equals(QueryExecutionState.CANCELLED.toString())) {
				throw new RuntimeException("Query was cancelled.");
			} else if (queryState.equals(QueryExecutionState.SUCCEEDED.toString())) {
				isQueryStillRunning = false;
			} else {
				Thread.sleep(SLEEP_AMOUNT_IN_MS);
			}

			logger.info("Current Status is: " + queryState);
		}
	}

	private static void processResultRows(AthenaClient athenaClient, String queryExecutionId) {

		GetQueryResultsRequest getQueryResultsRequest = GetQueryResultsRequest.builder()
				.queryExecutionId(queryExecutionId).build();

		GetQueryResultsIterable getQueryResultsResults = athenaClient.getQueryResultsPaginator(getQueryResultsRequest);

		for (GetQueryResultsResponse Resultresult : getQueryResultsResults) {
			List<ColumnInfo> columnInfoList = Resultresult.resultSet().resultSetMetadata().columnInfo();

			int resultSize = Resultresult.resultSet().rows().size();
			logger.info("Result size: " + resultSize);

			List<Row> results = Resultresult.resultSet().rows();
			processRow(results, columnInfoList);
		}
	}

	private static void processRow(List<Row> rowList, List<ColumnInfo> columnInfoList) {

		List<String> columns = new ArrayList<String>();

		for (ColumnInfo columnInfo : columnInfoList) {
			columns.add(columnInfo.name());
		}

		for (Row row : rowList) {
			int index = 0;

			for (Datum datum : row.data()) {
				logger.info(columns.get(index) + ": " + datum.varCharValue());
				index++;
			}

			logger.info("=============");
		}
	}
}