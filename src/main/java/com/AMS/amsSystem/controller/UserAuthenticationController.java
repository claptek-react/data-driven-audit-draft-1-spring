package com.AMS.amsSystem.controller;

import java.io.UnsupportedEncodingException;
import java.util.Base64;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.AMS.amsSystem.Model.UserAuthentication;
import com.AMS.amsSystem.Repository.UserAuthenticationRepository;
import com.AMS.amsSystem.Services.UserAuthencticationService;

@CrossOrigin(origins ="*")
@RestController
@RequestMapping("audit/")
public class UserAuthenticationController {

	
	@Autowired
	private UserAuthencticationService userAuthenticationService;
	
	@PostMapping("UserPassword")
	public UserAuthentication createUser (@RequestBody UserAuthentication userAuthentication) {
		return this.userAuthenticationService.save(userAuthentication);
	}
	
//	@PostMapping("decode")
//	public String decodeJwt(@RequestBody String token) throws UnsupportedEncodingException {
//		String payload = token.split("\\.")[1];
//		return new String(Base64.decodeBase64(payload), "UTF-8");
//	}
}


