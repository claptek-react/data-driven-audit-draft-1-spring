package com.AMS.amsSystem.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.AMS.amsSystem.Model.UserData;
import com.AMS.amsSystem.Repository.UserDataRepository;

@CrossOrigin(origins ="*")

@RestController
@RequestMapping("audit/")
public class UserDataController {

	
	@Autowired
	private UserDataRepository userDataRepository;
	
	
	@GetMapping("User")
	public List<UserData> getAllData(){
		return this.userDataRepository.findAll();
	}
	
	@PostMapping(path ="user",
			consumes = MediaType.APPLICATION_JSON_VALUE,
			produces =MediaType.APPLICATION_JSON_VALUE)
	public void create(@RequestBody UserData newData) {
		UserData userData = userDataRepository.save(newData);		
	}	
}
