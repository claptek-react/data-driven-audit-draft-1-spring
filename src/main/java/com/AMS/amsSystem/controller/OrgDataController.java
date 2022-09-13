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

import com.AMS.amsSystem.Model.OrgData;
import com.AMS.amsSystem.Repository.OrgDataRepository;

@CrossOrigin(origins ="*")

@RestController
@RequestMapping("audit/")
public class OrgDataController {

	
	
	@Autowired
	private OrgDataRepository orgDataRepository;
	
	@GetMapping("Org")
	public List<OrgData> getAllData(){
		return this.orgDataRepository.findAll();
		
	}
	
	@PostMapping(path ="org",
			produces = MediaType.APPLICATION_JSON_VALUE,
			consumes = MediaType.APPLICATION_JSON_VALUE)
	public void create(@RequestBody OrgData newData) {
		OrgData orgData = orgDataRepository.save(newData);
	}
}
