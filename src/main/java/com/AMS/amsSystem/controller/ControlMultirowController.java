package com.AMS.amsSystem.controller;

import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.AMS.amsSystem.Model.ControlMultirow;
import com.AMS.amsSystem.Model.ProcessMultirow;
import com.AMS.amsSystem.Repository.ControlMultirowRepository;

@CrossOrigin(origins ="*")
@RestController
@RequestMapping("audit/")
public class ControlMultirowController {
	
	final org.slf4j.Logger logger = LoggerFactory.getLogger(ControlMultirowController.class);
	
	
	
	@Autowired
	private ControlMultirowRepository controlMultirowRepository;
	
	@PutMapping("SubmitControlMultirow")
	public ControlMultirow addData(@RequestBody ControlMultirow newData)
	{
		logger.error("newData  multirow = " + newData.toString());

		ControlMultirow data = controlMultirowRepository.saveAndFlush(newData);
		return data;
		
		
	}
	
	
	

}
