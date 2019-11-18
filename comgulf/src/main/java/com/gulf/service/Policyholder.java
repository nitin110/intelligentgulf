package com.unikove.questmotor.service.sftpadapter.model;

public class Policyholder {

	protected String title;
	protected String firstName;
	protected String surname;
	protected String birthDate;
	private PolicyholderDetails policyholderDetails;
	private PolicyholderEndorsements policyholderEndorsements;

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

	public PolicyholderEndorsements getPolicyholderEndorsements() {
		return policyholderEndorsements;
	}

	public void setPolicyholderEndorsements(PolicyholderEndorsements policyholderEndorsements) {
		this.policyholderEndorsements = policyholderEndorsements;
	}

	public PolicyholderDetails getPolicyholderDetails() {
		return policyholderDetails;
	}

	public void setPolicyholderDetails(PolicyholderDetails policyholderDetails) {
		this.policyholderDetails = policyholderDetails;
	}
}
