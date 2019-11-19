package com.unikove.questmotor.service.sftpadapter.model;

public class EditPolicyRequest {

	private String policyNumber;
	private String startDate;
	private String endDate;

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

}
