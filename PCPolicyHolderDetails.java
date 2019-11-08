package com.unikove.model;

import javax.persistence.Entity;

@Entity
public class PCPolicyHolderDetails {

	private String email;
	private Integer noClaimDiscount;
	private String drivingTestPassed;
	private String postcode;
	private String phone;
	private PCEndorsement policyHolderEndorsements;

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Integer getNoClaimDiscount() {
		return noClaimDiscount;
	}

	public void setNoClaimDiscount(Integer noClaimDiscount) {
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

	public PCPolicyHolderDetails(String email, Integer noClaimDiscount, String drivingTestPassed, String postcode,
			String phone, PCEndorsement policyHolderEndorsements) {
		super();
		this.email = email;
		this.noClaimDiscount = noClaimDiscount;
		this.drivingTestPassed = drivingTestPassed;
		this.postcode = postcode;
		this.phone = phone;
		this.policyHolderEndorsements = policyHolderEndorsements;
	}

	public PCEndorsement getPolicyHolderEndorsements() {
		return policyHolderEndorsements;
	}

	public void setPolicyHolderEndorsements(PCEndorsement policyHolderEndorsements) {
		this.policyHolderEndorsements = policyHolderEndorsements;
	}

}
