package com.aws.athena;

import org.slf4j.Logger;

//import java.util.logging.Logger;

import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import software.amazon.awssdk.services.athena.AthenaClient;
import software.amazon.awssdk.services.athena.model.QueryExecutionContext;
import software.amazon.awssdk.services.athena.model.ResultConfiguration;
import software.amazon.awssdk.services.athena.model.StartQueryExecutionRequest;
import software.amazon.awssdk.services.athena.model.StartQueryExecutionResponse;

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

		QueryExecutionContext queryExecutionContext = QueryExecutionContext.builder().database(ATHENA_DATABASE).build();

		ResultConfiguration resultConfiguration = ResultConfiguration.builder()
				.outputLocation(ATHENA_OUTPUT_S3_FOLDER_PATH).build();

		StartQueryExecutionRequest startQueryExecutionRequest = StartQueryExecutionRequest.builder()
				.queryString(SIMPLE_ATHENA_QUERY).queryExecutionContext(queryExecutionContext)
				.resultConfiguration(resultConfiguration).build();

		StartQueryExecutionResponse startQueryExecutionResponse = athenaClient
				.startQueryExecution(startQueryExecutionRequest);

		return startQueryExecutionResponse.queryExecutionId();
	}

}