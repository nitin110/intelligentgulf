package com.unikove.service;

import graphql.schema.idl.SchemaParser;
import graphql.schema.idl.TypeDefinitionRegistry;

import java.io.File;
import java.io.IOException;
import java.util.stream.Stream;

import javax.annotation.PostConstruct;
import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;

import com.unikove.dao.PolicyRepository;

import graphql.GraphQL;
import graphql.schema.GraphQLSchema;
import graphql.schema.idl.RuntimeWiring;
import graphql.schema.idl.SchemaGenerator;

public class GraphQLService {

	private static Logger logger = LoggerFactory.getLogger(GraphQLService.class);
	private PolicyRepository policyRepository;

	// private BookDataFetcher bookDataFetcher;
	@Value("classpath:books.graphql")
	Resource resource;
	private GraphQL graphQL;

	@Autowired
	public GraphQLService(PolicyRepository policyRepository, PcVehicleDataFetcher pcVehicleDataFetcher) {
		this.policyRepository = policyRepository;

		this.pcVehicleDataFetcher = pcVehicleDataFetcher;
	}

	@PostConstruct
	private void loadSchema() throws IOException {
		logger.info("Entering loadSchema@GraphQLService");
		loadDataIntoHSQL();
		// Get the graphql fil
		File file = resource.getFile();
		// Parse SchemaF
		TypeDefinitionRegistry typeDefinitionRegistry = new SchemaParser().parse(file);
		RuntimeWiring runtimeWiring = buildRuntimeWiring();
		GraphQLSchema graphQLSchema = new SchemaGenerator().makeExecutableSchema(typeDefinitionRegistry, runtimeWiring);
		graphQL = GraphQL.newGraphQL(graphQLSchema).build();
	}

	private void loadDataIntoHSQL() {
        Stream.of(
                new PcVehicle("1001", "The C Programming Language", "PHI Learning", "1978",
                        new String[] {
                                "Brian W. Kernighan (Contributor)",
                                "Dennis M. Ritchie"
                }),
                     })).forEach(PcVehicle->

	{
		policyRepository.save(PcVehicle);
	});
	}

	private RuntimeWiring buildRuntimeWiring() {
        return RuntimeWiring.newRuntimeWiring()
                .type("Query", typeWiring -> typeWiring
                .dataFetcher("allBooks", allBooksDataFetcher)
                .dataFetcher("book", bookDataFetcher))
                 build();
    }

	public GraphQL getGraphQL() {
		return graphQL;
	}

	

}
