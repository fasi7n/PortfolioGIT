package com.portfolio.commons;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

import org.springframework.stereotype.Controller;

@Controller
public class SimpleSHADigest {
	
	
	public static String mySha1(String passToHash)
	{
		MessageDigest m = null;
		try
		{
			m = MessageDigest.getInstance("SHA1");
		}
		catch (NoSuchAlgorithmException e)
		{		
			e.printStackTrace();
		}
		byte[] data = passToHash.getBytes(); 
		m.update(data,0,data.length);
		BigInteger i = new BigInteger(1,m.digest());
		return String.format("%1$040X", i);
	}

}
