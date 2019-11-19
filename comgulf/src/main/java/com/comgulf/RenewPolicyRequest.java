package com.unikove.questmotor.service.sftpadapter.model;

public class RenewPolicyRequest {

	private String policyTypeCode;
	private String policyNumber;
	private String startDate;
	private String endDate;
	private double distanceLimit;
	private DistanceLimitUnitEnum distanceLimitUnitEnum;
	private Policyholder policyholder;

	public Policyholder getPolicyholder() {
		return policyholder;
	}

	public void setPolicyholder(Policyholder policyholder) {
		this.policyholder = policyholder;
	}

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

	public double getDistanceLimit() {
		return distanceLimit;
	}

	public void setDistanceLimit(double distanceLimit) {
		this.distanceLimit = distanceLimit;
	}

	public DistanceLimitUnitEnum getDistanceLimitUnitEnum() {
		return distanceLimitUnitEnum;
	}

	public void setDistanceLimitUnitEnum(DistanceLimitUnitEnum distanceLimitUnitEnum) {
		this.distanceLimitUnitEnum = distanceLimitUnitEnum;
	}
}
