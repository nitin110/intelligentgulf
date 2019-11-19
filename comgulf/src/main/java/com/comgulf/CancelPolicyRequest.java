package com.unikove.questmotor.service.sftpadapter.model;

public class CancelPolicyRequest {

	private String cancellationReasonCode;
	private String cancellationComment;

	public String getCancellationReasonCode() {
		return cancellationReasonCode;
	}

	public void setCancellationReasonCode(String cancellationReasonCode) {
		this.cancellationReasonCode = cancellationReasonCode;
	}

	
	public String getCancellationComment() {
		return cancellationComment;
	}

	public void setCancellationComment(String cancellationComment) {
		this.cancellationComment = cancellationComment;
	}
}
