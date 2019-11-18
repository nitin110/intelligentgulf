package com.unikove.questmotor.service.sftpadapter.model;

public class PolicyholderEndorsementsForCreatePolicy {

	private String code;
	private String date;

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	@Override
	public String toString() {
		return String.format("PolicyholderEndorsementsForCreatePolicy [code=%s, date=%s]", code, date);
	}

}
