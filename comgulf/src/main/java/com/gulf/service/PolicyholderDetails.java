package com.unikove.questmotor.service.sftpadapter.model;

public class PolicyholderDetails {

	private Integer noClaimDiscount;
	private String drivingTestPassed;
	private String postcode;
	private String phone;
	private String email;

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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
}
