package com.unikove.questmotor.service.sftpadapter.model;

public class Vehicle extends PolicyHolderCommon {

	/*
	 * private String registrationNumber; private String make; private String model;
	 * private String modificationCodes; private String requestedDeviceTypeCode;
	 */
	private String installationNotes;

	/*
	 * public String getRegistrationNumber() { return registrationNumber; }
	 * 
	 * public void setRegistrationNumber(String registrationNumber) {
	 * this.registrationNumber = registrationNumber; }
	 * 
	 * public String getMake() { return make; }
	 * 
	 * public void setMake(String make) { this.make = make; }
	 * 
	 * public String getModel() { return model; }
	 * 
	 * public void setModel(String model) { this.model = model; }
	 * 
	 * public String getModificationCodes() { return modificationCodes; }
	 * 
	 * public void setModificationCodes(String modificationCodes) {
	 * this.modificationCodes = modificationCodes; }
	 * 
	 * public String getRequestedDeviceTypeCode() { return requestedDeviceTypeCode;
	 * }
	 * 
	 * public void setRequestedDeviceTypeCode(String requestedDeviceTypeCode) {
	 * this.requestedDeviceTypeCode = requestedDeviceTypeCode; }
	 */
	public String getInstallationNotes() {
		return installationNotes;
	}

	public void setInstallationNotes(String installationNotes) {
		this.installationNotes = installationNotes;
	}

}
