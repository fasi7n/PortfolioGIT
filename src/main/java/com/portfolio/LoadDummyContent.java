package com.portfolio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


import com.portfolio.commons.SimpleSHADigest;
import com.portfolio.model.UserCredentials;
import com.portfolio.service.UserCredentialsService;

@Component
public class LoadDummyContent {
	
	@Autowired
	private UserCredentials userCredentials;
	
	@Autowired
	private UserCredentialsService userCredServObj;
	
	
	public void loadDummyData(){
		
		
		userCredentials.setEmail_ID("fasi@fasi.com");
		userCredentials.setPassword(SimpleSHADigest.mySha1("Fasi123@$"));
		
		String actionResult = userCredServObj.createUserByEmail(userCredentials);
		
		if(actionResult.equalsIgnoreCase("success"))
		System.out.println("Dummy user created with email = " + userCredentials.getEmail_ID() + " and password = Fasi123@$");

		
		
	}

}
