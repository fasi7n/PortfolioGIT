package com.portfolio.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.portfolio.commons.SimpleSHADigest;
import com.portfolio.model.LoginCredentials;
import com.portfolio.model.UserCredentials;
import com.portfolio.service.UserCredentialsService;

@Controller
@RequestMapping("/registrationAction")
public class RegistrationActionController {
	
	@Autowired
	private UserCredentials userCredentials;
	
	@Autowired
	private UserCredentialsService userCredServObj;
	
	@Value("${email.taken.msg}")
	private String emailTaken;
	
	@PostMapping
	public String registrationAction(@ModelAttribute LoginCredentials loginCredentials,  Model model)
	{
		
		userCredentials.setEmail_ID(loginCredentials.getEmail_ID());
		userCredentials.setPassword(SimpleSHADigest.mySha1(loginCredentials.getPassword()));
		
		String actionResult = userCredServObj.createUserByEmail(userCredentials);
		
		if(actionResult.equalsIgnoreCase("success"))
		{
			model.addAttribute("loginCredentials", userCredentials);
			return "index";
		}
		
		else
		{
		model.addAttribute("error", emailTaken);
		return "register";
		}
		
		
	}
	

}
