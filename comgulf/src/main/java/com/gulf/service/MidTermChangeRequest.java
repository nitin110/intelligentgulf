package com.unikove.questmotor.service.sftpadapter.model;

public class MidTermChangeRequest {

	private double distanceLimit;

	private MidTermChangeRequestEnum midTermChangeRequestEnum;
	
	
	
	
	

	public MidTermChangeRequestEnum getMidTermChangeRequestEnum() {
		return midTermChangeRequestEnum;
	}

	public void setMidTermChangeRequestEnum(MidTermChangeRequestEnum midTermChangeRequestEnum) {
		this.midTermChangeRequestEnum = midTermChangeRequestEnum;
	}

	public double getDistanceLimit() {
		return distanceLimit;
	}

	public void setDistanceLimit(double distanceLimit) {
		this.distanceLimit = distanceLimit;
	}

	/*
	 * public double getDistanceLimitUnit() { return distanceLimitUnit; }
	 * 
	 * public void setDistanceLimitUnit(double distanceLimitUnit) {
	 * this.distanceLimitUnit = distanceLimitUnit; }
	 */

}
