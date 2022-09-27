package com.AMS.amsSystem.controller;

import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.AMS.amsSystem.Model.ProcessMultirow;
import com.AMS.amsSystem.Model.TestMultirow;
import com.AMS.amsSystem.Repository.TestMultirowRepository;

@CrossOrigin(origins ="*")
@RestController
@RequestMapping("audit/")
public class TestMultirowController {
	
	
	final org.slf4j.Logger logger = LoggerFactory.getLogger(TestMultirowController.class);

	
	@Autowired
	private TestMultirowRepository testMultorowRepository;
	
	@PutMapping("SubmitTestMultirow")
	public TestMultirow addData(@RequestBody TestMultirow newData) {
		
		logger.error("newData  multirow = " + newData.toString());

	
	TestMultirow data = testMultorowRepository.saveAndFlush(newData);
	return data;

	}
	

}
