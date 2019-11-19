package com.unikove.questmotor.service.sftpadapter.model;

import java.util.List;

import org.springframework.data.mongodb.core.mapping.Document;

@Document("changevehiclerequest")
public class ChangeVehicleRequest {

	private String registrationNumber;
	private String make;
	private String model;
	private List<String> modificationCodes;

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

	public String getRegistrationNumber() {
		return registrationNumber;
	}

	public void setRegistrationNumber(String registrationNumber) {
		this.registrationNumber = registrationNumber;
	}

	public List<String> getModificationCodes() {
		return modificationCodes;
	}

	public void setModificationCodes(List<String> modificationCodes) {
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
