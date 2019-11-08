package com.unikove.model;

import javax.persistence.Entity;

@Entity
public class PcVehicle {

	private String registrationNumber;
	private String make;
	private String model;
	private String vin;
	private String requestedDeviceTypeCode;
	private String modificationCodes;
	private String installationNotes;

	public PcVehicle() {

	}

	public PcVehicle(String registrationNumber, String make, String model, String vin, String requestedDeviceTypeCode,
			String modificationcodes, String installationNotes) {
		super();
		this.registrationNumber = registrationNumber;
		this.make = make;
		this.model = model;
		this.vin = vin;
		this.requestedDeviceTypeCode = requestedDeviceTypeCode;
		this.modificationCodes = modificationcodes;
		this.installationNotes = installationNotes;
	}

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

	public String getVin() {
		return vin;
	}

	public void setVin(String vin) {
		this.vin = vin;
	}

	public String getRequestedDeviceTypeCode() {
		return requestedDeviceTypeCode;
	}

	public void setRequestedDeviceTypeCode(String requestedDeviceTypeCode) {
		this.requestedDeviceTypeCode = requestedDeviceTypeCode;
	}

	public String getModificationcodes() {
		return modificationCodes;
	}

	public void setModificationcodes(String modificationcodes) {
		this.modificationCodes = modificationcodes;
	}

	public String getInstallationNotes() {
		return installationNotes;
	}

	public void setInstallationNotes(String installationNotes) {
		this.installationNotes = installationNotes;
	}
}
