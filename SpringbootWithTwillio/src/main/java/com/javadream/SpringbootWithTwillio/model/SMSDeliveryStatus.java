package com.javadream.SpringbootWithTwillio.model;

public class SMSDeliveryStatus {

	private String costToDeliver;
	private String currencyCodeOfDeliveryCost;
	private String currencyNameOfDeliveryCost;
	private String status;
	private String toMobileNumber;
	private String twillioNumberToSendSMS;
	private String messageBody;

	public String getCostToDeliver() {
		return costToDeliver;
	}

	public void setCostToDeliver(String costToDeliver) {
		this.costToDeliver = costToDeliver;
	}

	public String getCurrencyCodeOfDeliveryCost() {
		return currencyCodeOfDeliveryCost;
	}

	public void setCurrencyCodeOfDeliveryCost(String currencyCodeOfDeliveryCost) {
		this.currencyCodeOfDeliveryCost = currencyCodeOfDeliveryCost;
	}

	public String getCurrencyNameOfDeliveryCost() {
		return currencyNameOfDeliveryCost;
	}

	public void setCurrencyNameOfDeliveryCost(String currencyNameOfDeliveryCost) {
		this.currencyNameOfDeliveryCost = currencyNameOfDeliveryCost;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getToMobileNumber() {
		return toMobileNumber;
	}

	public void setToMobileNumber(String toMobileNumber) {
		this.toMobileNumber = toMobileNumber;
	}

	public String getTwillioNumberToSendSMS() {
		return twillioNumberToSendSMS;
	}

	public void setTwillioNumberToSendSMS(String twillioNumberToSendSMS) {
		this.twillioNumberToSendSMS = twillioNumberToSendSMS;
	}

	public String getMessageBody() {
		return messageBody;
	}

	public void setMessageBody(String messageBody) {
		this.messageBody = messageBody;
	}

}
