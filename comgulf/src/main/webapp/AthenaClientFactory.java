package com.aws.athena;

import com.amazonaws.services.s3.AmazonS3Client;
import com.simba.athena.amazonaws.services.athena.AmazonAthenaClientBuilder;

import software.amazon.awssdk.auth.credentials.EnvironmentVariableCredentialsProvider;
import software.amazon.awssdk.regions.Region;
import software.amazon.awssdk.services.athena.AthenaClient;
import software.amazon.awssdk.services.athena.AthenaClientBuilder;
import software.amazon.awssdk.utils.builder.SdkBuilder;

public class AthenaClientFactory {
	/*
	 * private final AthenaClientBuilder builder =
	 * AthenaClient.builder().region(Region.US_EAST_1)
	 * .credentialsProvider(EnvironmentVariableCredentialsProvider.create());
	 */
	public AthenaClient createClient() {
		SdkBuilder<AthenaClientBuilder, AthenaClient> builder = null;
		return builder.build();
	}
	
	public static AmazonAthenaClientBuilder builder() {
		  return AmazonAthenaClientBuilder.standard();
		}

	
	AthenaClientBuilder builder = AmazonS3Client.builder().withRegion("Mu").withCredentials(EnvironmentVariableCredentialsProvider.create())
			AmazonS3 s3Client = AmazonS3ClientBuilder.standard().withCredentials(new ProfileCredentialsProvider()).withRegion(Regions.AP_SOUTH_1).build();    
		   // .withCredentials(new AWSStaticCredentialsProvider(creds))
		    .build();
	
}
