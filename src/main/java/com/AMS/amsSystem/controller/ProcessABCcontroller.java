package com.AMS.amsSystem.controller;

import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.AMS.amsSystem.Model.ProcessABC;
import com.AMS.amsSystem.Model.ProcessData;
import com.AMS.amsSystem.Repository.ProcessABCRepository;


@CrossOrigin(origins ="*")
@RestController
@RequestMapping("audit/")

public class ProcessABCcontroller {
	
	final org.slf4j.Logger logger = LoggerFactory.getLogger(ProcessABCcontroller.class);

	
	@Autowired
	private ProcessABCRepository processABCRepository;
	
	
	
	@PutMapping("ABCProcess")
	public ProcessABC addData(@RequestBody ProcessABC newData)
	{
		logger.error("newData = " + newData.toString());

		ProcessABC data = processABCRepository.saveAndFlush(newData);
		return data;
		
		
	}
	

}
