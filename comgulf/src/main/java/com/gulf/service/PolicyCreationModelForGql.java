package com.unikove.questmotor.service.sftpadapter.model;

import java.util.List;

public class PolicyCreationModelForGql {

	private String policyTypeCode;
	private String policyNumber;
	private String startDate;
	private String endDate;
	private String distanceLimit;
	private String title;
	private String firstName;
	private String surname;
	private String birthDate;
	private String email;
	private String noClaimDiscount;
	private String drivingTestPassed;
	private String postcode;
	private String phone;
	private List<PolicyholderEndorsementsForCreatePolicy> policyholderEndorsements;
	private String registrationNumber;
	private String make;
	private String model;
	private List<String> modificationCodes;
	private String requestedDeviceTypeCode;
	private String installationNotes;

	public String getPolicyTypeCode() {
		return policyTypeCode;
	}

	public void setPolicyTypeCode(String policyTypeCode) {
		this.policyTypeCode = policyTypeCode;
	}

	public String getPolicyNumber() {
		return policyNumber;
	}

	public void setPolicyNumber(String policyNumber) {
		this.policyNumber = policyNumber;
	}

	public String getStartDate() {
		return startDate;
	}

	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}

	public String getEndDate() {
		return endDate;
	}

	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}

	public String getDistanceLimit() {
		return distanceLimit;
	}

	public void setDistanceLimit(String distanceLimit) {
		this.distanceLimit = distanceLimit;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(String birthDate) {
		this.birthDate = birthDate;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getNoClaimDiscount() {
		return noClaimDiscount;
	}

	public void setNoClaimDiscount(String noClaimDiscount) {
		this.noClaimDiscount = noClaimDiscount;
	}

	public String getDrivingTestPassed() {
		return drivingTestPassed;
	}

	public void setDrivingTestPassed(String drivingTestPassed) {
		this.drivingTestPassed = drivingTestPassed;
	}

	public String getPostcode() {
		return postcode;
	}

	public void setPostcode(String postcode) {
		this.postcode = postcode;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public List<PolicyholderEndorsementsForCreatePolicy> getPolicyholderEndorsements() {
		return policyholderEndorsements;
	}

	public void setPolicyholderEndorsements(List<PolicyholderEndorsementsForCreatePolicy> policyholderEndorsements) {
		this.policyholderEndorsements = policyholderEndorsements;
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

	public List<String> getModificationCodes() {
		return modificationCodes;
	}

	public void setModificationCodes(List<String> modificationCodes) {
		this.modificationCodes = modificationCodes;
	}

	public String getRequestedDeviceTypeCode() {
		return requestedDeviceTypeCode;
	}

	public void setRequestedDeviceTypeCode(String requestedDeviceTypeCode) {
		this.requestedDeviceTypeCode = requestedDeviceTypeCode;
	}

	public String getInstallationNotes() {
		return installationNotes;
	}

	public void setInstallationNotes(String installationNotes) {
		this.installationNotes = installationNotes;
	}

	@Override
	public String toString() {
		return String.format(
				"PolicyCreationModelForGql [policyTypeCode=%s, policyNumber=%s, startDate=%s, endDate=%s, distanceLimit=%s, title=%s, firstName=%s, surname=%s, birthDate=%s, email=%s, noClaimDiscount=%s, drivingTestPassed=%s, postcode=%s, phone=%s, policyholderEndorsements=%s, registrationNumber=%s, make=%s, model=%s, modificationCodes=%s, requestedDeviceTypeCode=%s, installationNotes=%s]",
				policyTypeCode, policyNumber, startDate, endDate, distanceLimit, title, firstName, surname, birthDate,
				email, noClaimDiscount, drivingTestPassed, postcode, phone, policyholderEndorsements,
				registrationNumber, make, model, modificationCodes, requestedDeviceTypeCode, installationNotes);
	}

}
