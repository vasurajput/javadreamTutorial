package com.javadream.SpringbootWithTwillio.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.javadream.SpringbootWithTwillio.model.SMSDeliveryStatus;
import com.twilio.rest.api.v2010.account.Message;
import com.twilio.type.PhoneNumber;

@Service
public class TwillioSMSService {

	public static final Logger logger = LoggerFactory.getLogger(TwillioSMSService.class);

	@Value("${twilio.phone.number}")
	private String twilioPhoneNumber;

	public String sendSMS(String toMobileNumber, String messageToSend) {
		String sid;
		try {
			logger.info("Sending SMS to mobileNumber {}", toMobileNumber);
			Message message = Message
					.creator(new PhoneNumber(toMobileNumber), new PhoneNumber(twilioPhoneNumber), messageToSend)
					.create();
			sid = message.getSid();
		} catch (Exception e) {
			logger.error("Exception while sending SMS to mobileNumber: {} {}", toMobileNumber, e);
			throw new RuntimeException("Failed to send SMS to mobileNumber: " + toMobileNumber);
		}
		return "SMS Send succesfully & sid is: " + sid;
	}

	public SMSDeliveryStatus getSendSMSStatus(String sid) {
		Message messageStatus = Message.fetcher(sid).fetch();
		String price = messageStatus.getPrice();
		String currencyCode = messageStatus.getPriceUnit().getCurrencyCode();
		String currencyName = messageStatus.getPriceUnit().getDisplayName();
		String status = messageStatus.getStatus().name();
		String toMobileNumber = messageStatus.getTo();
		PhoneNumber twillioMobileNo = messageStatus.getFrom();
		String sendSMSText = messageStatus.getBody();
		
		SMSDeliveryStatus deliveryStatus = new SMSDeliveryStatus();
		deliveryStatus.setCostToDeliver(price);
		deliveryStatus.setCurrencyCodeOfDeliveryCost(currencyCode);
		deliveryStatus.setCurrencyNameOfDeliveryCost(currencyName);
		deliveryStatus.setStatus(status);
		deliveryStatus.setToMobileNumber(toMobileNumber);
		deliveryStatus.setTwillioNumberToSendSMS(twillioMobileNo.toString());
		deliveryStatus.setMessageBody(sendSMSText);

		return deliveryStatus;
	}
}
