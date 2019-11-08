package com.unikove.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.unikove.dao.PolicyRepository;
import com.unikove.model.PcVehicle;

import graphql.schema.DataFetcher;
import graphql.schema.DataFetchingEnvironment;

public class PcVehicleDataFetcher implements DataFetcher<PcVehicle> {

	private PolicyRepository policyRepository;

	@Autowired
	public PcVehicleDataFetcher(PolicyRepository policyRepository) {
		this.policyRepository = policyRepository;
	}

	@Override
	public PcVehicle get(DataFetchingEnvironment dataFetchingEnvironment) {
		String isn = dataFetchingEnvironment.getArgument("id");
		return policyRepository.findByregistrationNumber(isn).orElse(null);
	}

}
