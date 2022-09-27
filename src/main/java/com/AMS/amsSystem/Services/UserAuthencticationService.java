package com.AMS.amsSystem.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.AMS.amsSystem.Model.UserAuthentication;
import com.AMS.amsSystem.Repository.UserAuthenticationRepository;

@Service
public class UserAuthencticationService
 {

	@Autowired
	private UserAuthenticationRepository userAuthenticationRepository;
	
	 PasswordEncoder passwordEncode;
	
	public void UserAuthenticationService (UserAuthenticationRepository userAuthenticationRepository) {
		this.userAuthenticationRepository = userAuthenticationRepository;
		this.passwordEncode = new BCryptPasswordEncoder();
	}
	
	public UserAuthentication save( UserAuthentication userAuthentication) {
		String encodedPassword = this.passwordEncode.encode(userAuthentication.getPassword());
		userAuthentication.setPassword(encodedPassword);
		return this.userAuthenticationRepository.save(userAuthentication);
	}
	
	
}
