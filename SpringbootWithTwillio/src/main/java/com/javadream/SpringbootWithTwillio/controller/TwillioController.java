package com.javadream.SpringbootWithTwillio.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.javadream.SpringbootWithTwillio.model.SMSDeliveryStatus;
import com.javadream.SpringbootWithTwillio.model.TwillioSMSRequest;
import com.javadream.SpringbootWithTwillio.service.TwillioSMSService;

@RestController
public class TwillioController {

	@Autowired
	private TwillioSMSService twillioSMSService;

	@PostMapping("/sendSMSMessage")
	public String sendSMS(@RequestBody TwillioSMSRequest twillioSMSRequest) {
		String sendSMSResponse = twillioSMSService.sendSMS(twillioSMSRequest.getToMobileNumber(),
				twillioSMSRequest.getSmsBody());
		return sendSMSResponse;
	}
	
	@GetMapping("/getSMSStatus/{sid}")
	public SMSDeliveryStatus getSMSStatus(@PathVariable String sid) {
		SMSDeliveryStatus sendSMSStatus = twillioSMSService.getSendSMSStatus(sid);
		return sendSMSStatus;
	}
}
