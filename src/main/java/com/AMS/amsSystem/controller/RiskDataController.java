package com.AMS.amsSystem.controller;

import java.io.IOException;


import java.sql.SQLException;
import java.util.List;

import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.AMS.amsSystem.Download.RiskDataExcelSheet;
import com.AMS.amsSystem.Model.ProcessData;
import com.AMS.amsSystem.Model.RiskData;
import com.AMS.amsSystem.Repository.RiskDataRepository;

@CrossOrigin(origins ="*")
@RestController
@RequestMapping("audit/")
public class RiskDataController {
	
	final org.slf4j.Logger logger = LoggerFactory.getLogger(RiskDataController.class);

	
	@Autowired
	private RiskDataRepository riskDataRepository;
	
	@GetMapping("Risk")
	public List<RiskData> getAllData(){
		return this.riskDataRepository.findAll();
	}
	
//	@PostMapping(path ="risk",
//			consumes = MediaType.APPLICATION_JSON_VALUE,
//			produces =MediaType.APPLICATION_JSON_VALUE)
//	public void create(@RequestBody RiskData newData) {
//		RiskData riskData = riskDataRepository.save(newData);
//		
//	}
	
	@PutMapping("risk")
	public RiskData updateRisk(@RequestBody RiskData newData)
	{
		
		logger.error("newData = " + newData.toString());
		RiskData data = riskDataRepository.saveAndFlush(newData);
		return data;
	}
	
	@GetMapping("RiskDataForExcel")
	public void getData() throws SQLException, IOException {
		List<RiskData> list = riskDataRepository.findAll();
		RiskDataExcelSheet.RiskExcel(list, "RiskData" + ".xlsx");
	}
	

	
	

}
