package com.unikove.questmotor.service.sftpadapter.model;

import java.io.IOException;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class PolicyCommon {

	public static String getCancelPolicyRequestJson(CancelPolicyRequest cancelPolicyRequest) {
		ObjectMapper mapper = new ObjectMapper();
		String jsonInString = null;
		try {
			jsonInString = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(cancelPolicyRequest);
			System.out.println(jsonInString);
		} catch (JsonGenerationException e) {
			e.printStackTrace();
		} catch (JsonMappingException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return jsonInString;
	}

	public static String getMidTermChangeRequestJson(MidTermChangeRequest midTermChangeRequest) {
		ObjectMapper mapper = new ObjectMapper();
		String jsonInString = null;
		try {
			jsonInString = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(midTermChangeRequest);
			System.out.println(jsonInString);
		} catch (JsonGenerationException e) {
			e.printStackTrace();
		} catch (JsonMappingException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return jsonInString;
	}

	public static String getChangeVehicleRequestJson(ChangeVehicleRequest changeVehicleRequest) {
		ObjectMapper mapper = new ObjectMapper();
		String jsonInString = null;
		try {
			jsonInString = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(changeVehicleRequest);
			System.out.println(jsonInString);
		} catch (JsonGenerationException e) {
			e.printStackTrace();
		} catch (JsonMappingException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return jsonInString;
	}

	public static String getCreatePolicyRequestJson(CreatePolicyRequest createPolicyRequest) {
		ObjectMapper mapper = new ObjectMapper();
		String jsonInString = null;
		try {
			jsonInString = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(createPolicyRequest);
			System.out.println(jsonInString);
		} catch (JsonGenerationException e) {
			e.printStackTrace();
		} catch (JsonMappingException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return jsonInString;
	}

	public static String getEditPolicyRequestJson(EditPolicyRequest editPolicyRequest) {
		ObjectMapper mapper = new ObjectMapper();
		String jsonInString = null;
		try {
			jsonInString = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(editPolicyRequest);
			System.out.println(jsonInString);
		} catch (JsonGenerationException e) {
			e.printStackTrace();
		} catch (JsonMappingException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return jsonInString;
	}
}
