package com.AMS.amsSystem.controller;

import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.AMS.amsSystem.Model.ProcessMultirow;
import com.AMS.amsSystem.Model.RiskMultirow;
import com.AMS.amsSystem.Repository.RiskMultirowRepository;

@CrossOrigin(origins ="*")
@RestController
@RequestMapping("audit/")
public class RiskMultirowController {
	
	final org.slf4j.Logger logger = LoggerFactory.getLogger(RiskMultirowController.class);
	
	@Autowired
	private RiskMultirowRepository riskMultorowRepository;
	
	@PutMapping("SubmitRiskMultirow")
	public RiskMultirow addData(@RequestBody RiskMultirow newData)
	{
		logger.error("newData Multirow  = " + newData.toString());

		RiskMultirow data = riskMultorowRepository.saveAndFlush(newData);
		return data;
		
		
	}

}
