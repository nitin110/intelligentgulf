package com.unikove.questmotor.service.sftpadapter.model;

import java.util.List;

public class ChangeVehicleRequest {

	private String registrationNumber;
	private String make;
	private String model;
	private String modificationCodes;
	private List<String> 

	public String getRegistrationNumber() {
		return registrationNumber;
	}

	public void setRegistrationNumber(String registrationNumber) {
		this.registrationNumber = registrationNumber;
	}

	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getModificationCodes() {
		return modificationCodes;
	}

	public void setModificationCodes(String modificationCodes) {
		this.modificationCodes = modificationCodes;
	}

	private String requestedDeviceTypeCode;

	public String getRequestedDeviceTypeCode() {
		return requestedDeviceTypeCode;
	}

	public void setRequestedDeviceTypeCode(String requestedDeviceTypeCode) {
		this.requestedDeviceTypeCode = requestedDeviceTypeCode;
	}

	public void setMessages(List<String> msg) {
		// TODO Auto-generated method stub

	}

}
