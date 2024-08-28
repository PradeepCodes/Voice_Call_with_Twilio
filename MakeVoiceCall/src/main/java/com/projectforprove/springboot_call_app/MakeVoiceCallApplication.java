package com.projectforprove.springboot_call_app;

import java.net.URI;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.twilio.Twilio;
import com.twilio.rest.api.v2010.account.Call;
import com.twilio.type.PhoneNumber;

@SpringBootApplication
public class MakeVoiceCallApplication implements ApplicationRunner {

	  public static final String ACCOUNT_SID = "AccountId";
	    public static final String AUTH_TOKEN = "Auth Token is here";
	    public static final String FROM_NUMBER = "From Number";
	    public static final String TO_NUMBER = "To Number";

	    static {
	    	Twilio.init(ACCOUNT_SID, AUTH_TOKEN);
	    }
	    
	    public static void main(String[] args) {
		SpringApplication.run(MakeVoiceCallApplication.class, args);
	}
	    @Override
	    public void run(ApplicationArguments args) throws Exception {
	    	Call.creator(new PhoneNumber(TO_NUMBER),new PhoneNumber(FROM_NUMBER),
	    	new URI("http://demo.twilio.com/docs/voice.xml")).create();
	    }
	    

}
