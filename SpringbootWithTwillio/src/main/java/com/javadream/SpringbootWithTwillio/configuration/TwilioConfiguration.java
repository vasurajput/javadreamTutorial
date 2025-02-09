package com.javadream.SpringbootWithTwillio.configuration;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

import com.twilio.Twilio;

import jakarta.annotation.PostConstruct;

@Configuration
public class TwilioConfiguration {
	private static final Logger logger = LoggerFactory.getLogger(TwilioConfiguration.class);

	@Value("${twilio.account.sid}")
	private String twillioAccountSID;

	@Value("${twilio.auth.token}")
	private String twillioAuthToken;

	@PostConstruct
	public void initializeTwillio() {
		logger.info("Twillio intialization ...");
		Twilio.init(twillioAccountSID, twillioAuthToken);
	}
}
