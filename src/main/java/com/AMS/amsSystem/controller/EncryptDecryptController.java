package com.AMS.amsSystem.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.AMS.amsSystem.Services.EncryptDecryptService;

@RestController
public class EncryptDecryptController {
	
	@Autowired
	EncryptDecryptService encryptDecryptService;
	
	 @GetMapping("/createKeys")
	  public void createPrivatePublickey() {
	    encryptDecryptService.createKeys();
	  }
	 
	

	  @PostMapping("/encrpyt")
	  public String encryptMessage(@RequestBody String plainString) {
	    return encryptDecryptService.encryptMessage(plainString);
	  }


	  @PostMapping("/decrpyt")
	  public String decryptMessage(@RequestBody String encryptString) {
	    return encryptDecryptService.decryptMessage(encryptString);
	  }
	  
}

	
	
	
	


