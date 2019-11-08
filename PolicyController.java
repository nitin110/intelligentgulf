package com.unikove.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.unikove.service.GraphQLService;

import graphql.ExecutionResult;

@RestController
public class PolicyController {
	private static Logger logger = LoggerFactory.getLogger(PolicyController.class);
	private GraphQLService graphQLService;

	@Autowired
	public PolicyController(GraphQLService graphQLService) {
		this.graphQLService = graphQLService;
	}

	@PostMapping
	public ResponseEntity<Object> getAllPolicy(@RequestBody String query) {
		logger.info("Entering getAllPolicy@PolicyController");
		ExecutionResult execute = graphQLService.getGraphQL().execute(query);
		return new ResponseEntity<>(execute, HttpStatus.OK);
	}

}
