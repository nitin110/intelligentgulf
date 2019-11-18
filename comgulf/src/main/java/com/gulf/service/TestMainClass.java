package com.unikove.questmotor.service.sftpadapter.model;

import java.util.ArrayList;
import java.util.List;

public class TestMainClass {

	public static void main(String[] args) {

		CancelPolicyRequest cancelPolicyRequest = createDummyUser();
		String jsonString = PolicyCommon.getCancelPolicyRequestJson(cancelPolicyRequest);
		CancelPolicyRequest cancelPolicyRequest1 = new CancelPolicyRequest();
		cancelPolicyRequest1.setCancellationComment("Speeding over the limit for the 2nd time");
		cancelPolicyRequest1.setCancellationReasonCode("EXCESIVE_SPEED");
		jsonString = PolicyCommon.getCancelPolicyRequestJson(cancelPolicyRequest1);

		/*
		 * MidTermChangeRequest midTermChangeRequest = createDummyUser1(); String
		 * jsonString1 = PolicyCommon.getMidTermChangeRequestJson(midTermChangeRequest);
		 */
		MidTermChangeRequest midTermChangeRequest1 = new MidTermChangeRequest();
		midTermChangeRequest1.setDistanceLimit(2000);
		midTermChangeRequest1.setMidTermChangeRequestEnum(MidTermChangeRequestEnum.MI);

		jsonString = PolicyCommon.getMidTermChangeRequestJson(midTermChangeRequest1);

		/*
		 * EditPolicyRequest editPolicyRequest = createDummyUser4(); String jsonString4
		 * = PolicyCommon.getEditPolicyRequestJson(editPolicyRequest);
		 */
		EditPolicyRequest editPolicyRequest1 = new EditPolicyRequest();
		editPolicyRequest1.setPolicyNumber("HAVLF123456");
		editPolicyRequest1.setStartDate("2019-08-13T00:00:00.000Z");
		editPolicyRequest1.setEndDate("2020-08-12T00:00:00.000Z");
		jsonString = PolicyCommon.getEditPolicyRequestJson(editPolicyRequest1);

		
		
		
		
		/*
		 * ChangeVehicleRequest changeVehicleRequest = createDummyUser2(); String
		 * jsonString2 = PolicyCommon.getChangeVehicleRequestJson(changeVehicleRequest);
		 */
		ChangeVehicleRequest changeVehicleRequest1 = new ChangeVehicleRequest();

		changeVehicleRequest1.setRegistrationNumber("EFG456");
		changeVehicleRequest1.setMake("Fiat");
		changeVehicleRequest1.setModel("500");
		changeVehicleRequest1.setRequestedDeviceTypeCode("HARDWIRED");
		changeVehicleRequest1.setModificationCodes(msg);
		
		List<String> msg = new ArrayList<>();
		msg.add("AMPLIFIER ");

		changeVehicleRequest1.setMessages(msg);
		jsonString = PolicyCommon.getChangeVehicleRequestJson(changeVehicleRequest1);

		
		
		
		
		
		
		/*
		 * CreatePolicyRequest createPolicyRequest = createDummyUser3(); String
		 * jsonString3 = PolicyCommon.getCreatePolicyRequestJson(createPolicyRequest);
		 */

		CreatePolicyRequest createPolicyRequest1 = new CreatePolicyRequest();
		Policyholder policyholder = new Policyholder();
		policyholder.setBirthDate("1987-11-07");
		policyholder.setFirstName("Alessandro");
		policyholder.setSurname("Catania");
		policyholder.setTitle("Mr");
		// policyholder.setPolicyholderDetails(policyholderDetails);
		// policyholder.setPolicyholderEndorsements(policyholderEndorsements);

		createPolicyRequest1.setPolicyTypeCode("LADIES_FIRST");
		createPolicyRequest1.setPolicyNumber("HAVLF12345");
		createPolicyRequest1.setStartDate("2019-11-11");
		createPolicyRequest1.setEndDate("2020-11-10");
		createPolicyRequest1.setDistanceLimit(1000);
		createPolicyRequest1.setPolicyholder(policyholder);

		// Policyholder policyholder = null;
		// createPolicyRequest1.setPolicyholder(policyholder);

		jsonString = PolicyCommon.getCreatePolicyRequestJson(createPolicyRequest1);
	}

	private static CreatePolicyRequest createDummyUser3() {
		CreatePolicyRequest createPolicyRequest1 = new CreatePolicyRequest();
		createPolicyRequest1.setPolicyTypeCode("LADIES_FIRST");
		createPolicyRequest1.setPolicyNumber("HAVLF12345");
		createPolicyRequest1.setStartDate("2019-11-11");
		createPolicyRequest1.setEndDate("2020-11-10");
		createPolicyRequest1.setDistanceLimit(1000);
		Policyholder policyholder = null;
		createPolicyRequest1.setPolicyholder(policyholder);
		return createPolicyRequest1;
	}

	private static ChangeVehicleRequest createDummyUser2() {
		/*
		 * ChangeVehicleRequest changeVehicleRequest = new ChangeVehicleRequest();
		 * changeVehicleRequest.setRequestedDeviceTypeCode("HARDWIRED");
		 */
		/*
		 * List<String> msg = new ArrayList<>(); msg.add("AMPLIFIER 1");
		 * 
		 * changeVehicleRequest.setMessages(msg);
		 */
		return null;
	}

	private static CancelPolicyRequest createDummyUser() {
		/*
		 * CancelPolicyRequest cancelPolicyRequest = new CancelPolicyRequest();
		 * cancelPolicyRequest.
		 * setCancellationComment("Speeding over the limit for the 2nd time");
		 * cancelPolicyRequest.setCancellationReasonCode("EXCESIVE_SPEED");
		 */
		return null;

	}

	private static MidTermChangeRequest createDummyUser1() {
		/*
		 * MidTermChangeRequest midTermChangeRequest = new MidTermChangeRequest();
		 * midTermChangeRequest.setDistanceLimit(2000);
		 */

		return null;

	}

	private static EditPolicyRequest createDummyUser4() {
		/*
		 * EditPolicyRequest editPolicyRequest = new EditPolicyRequest();
		 * editPolicyRequest.setPolicyNumber("HAVLF123456");
		 * editPolicyRequest.setStartDate("2019-08-13T00:00:00.000Z");
		 * editPolicyRequest.setEndDate("2020-08-12T00:00:00.000Z");
		 */
		return null;

	}
}
