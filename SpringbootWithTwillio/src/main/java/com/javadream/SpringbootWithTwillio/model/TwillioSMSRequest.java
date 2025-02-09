package com.javadream.SpringbootWithTwillio.model;

public class TwillioSMSRequest {

	private String toMobileNumber;
	private String smsBody;

	public String getToMobileNumber() {
		return toMobileNumber;
	}

	public void setToMobileNumber(String toMobileNumber) {
		this.toMobileNumber = toMobileNumber;
	}

	public String getSmsBody() {
		return smsBody;
	}

	public void setSmsBody(String smsBody) {
		this.smsBody = smsBody;
	}

}
