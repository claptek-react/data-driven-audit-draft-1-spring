package com.AMS.amsSystem.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.AMS.amsSystem.Model.Workflow;
import com.AMS.amsSystem.Repository.WorkflowRepository;

@CrossOrigin(origins ="*")
@RestController
@RequestMapping("workflow/")
public class WorkflowController {
	
	@Autowired
	private WorkflowRepository workflowRepository;
	
	@GetMapping("getworkflow")
   	public List<Workflow> getAllData(){
   		return this.workflowRepository.findAll();
   	}
	
	@GetMapping("getworkflowbyformid")
   	public List<Workflow> getWorkflowByFormId(@RequestParam String formId){
   		return this.workflowRepository.findByFormId(formId);
   	}

}
