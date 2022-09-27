package com.AMS.amsSystem.controller;

import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.AMS.amsSystem.Model.ProcessMultirow;
import com.AMS.amsSystem.Model.ProcessData;
import com.AMS.amsSystem.Repository.ProcessMutirowRepository;

@CrossOrigin(origins ="*")
@RestController
@RequestMapping("audit/")
public class ProcessMultirowcontroller {
	
	final org.slf4j.Logger logger = LoggerFactory.getLogger(ProcessMultirowcontroller.class);

	
	@Autowired
	private ProcessMutirowRepository processABCRepository;
	
	
	
	@PutMapping("SubmitProcessMultirow")
	public ProcessMultirow addData(@RequestBody ProcessMultirow newData)
	{
		logger.error("newData  multirow = " + newData.toString());

		ProcessMultirow data = processABCRepository.saveAndFlush(newData);
		return data;
		
		
	}
	

}
