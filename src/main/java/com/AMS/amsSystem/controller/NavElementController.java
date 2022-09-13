package com.AMS.amsSystem.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.AMS.amsSystem.Model.NavElementData;
import com.AMS.amsSystem.Repository.NavElementRepository;

@CrossOrigin(origins ="*")
@RestController
@RequestMapping("audit/")
public class NavElementController {

	
	
	@Autowired
	private NavElementRepository navElemetRepository;
	
	
	@GetMapping("FetchNavElement")
	public List<NavElementData> getData() {
		return this.navElemetRepository.findAll();
	}
	
}
