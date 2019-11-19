package com.unikove.questmotor.service.sftpadapter.model;

public class MidTermChangeRequest {

	private double distanceLimit;

	private DistanceLimitUnitEnum distanceLimitUnitEnum;

	public DistanceLimitUnitEnum getMidTermChangeRequestEnum() {
		return distanceLimitUnitEnum;
	}

	public void setMidTermChangeRequestEnum(DistanceLimitUnitEnum distanceLimitUnitEnum) {
		this.distanceLimitUnitEnum = distanceLimitUnitEnum;
	}

	public double getDistanceLimit() {
		return distanceLimit;
	}

	public void setDistanceLimit(double distanceLimit) {
		this.distanceLimit = distanceLimit;
	}

	
}
