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

import com.AMS.amsSystem.Model.AuditPlanData;
import com.AMS.amsSystem.Repository.AuditPlanDataRepository;

@CrossOrigin(origins ="*")
@RestController
@RequestMapping("audit/")
public class AuditPlanDataController {
	
	
    @Autowired
	private AuditPlanDataRepository auditPlanDataRepository;
    
    
    @GetMapping("AuditPlan")
   	public List<AuditPlanData> getAllData(){
   		return this.auditPlanDataRepository.findAll();
   	}
    

    
	@PostMapping(path ="auditPlan",
			consumes = MediaType.APPLICATION_JSON_VALUE,
			produces = MediaType.APPLICATION_JSON_VALUE)
	public void createProcess(@RequestBody AuditPlanData newData) {
		AuditPlanData auditPlanData = auditPlanDataRepository.save(newData);	
				
		
		
	}

}
