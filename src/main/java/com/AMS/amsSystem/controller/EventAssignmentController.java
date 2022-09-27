package com.AMS.amsSystem.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.AMS.amsSystem.Model.EventAssignmentData;
import com.AMS.amsSystem.Repository.EventAssignmentRepository;
import java.util.List;

@CrossOrigin(origins ="*")
@RestController
@RequestMapping("audit/")
public class EventAssignmentController {
	
	@Autowired
	private EventAssignmentRepository eventAssignmentRepository;
	
	
	@GetMapping("FetchTaskData")
	public List<EventAssignmentData> getData(){
		return this.eventAssignmentRepository.findAll();
	}

}
