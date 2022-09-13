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

import com.AMS.amsSystem.Download.ControlDataExcelSheet;
import com.AMS.amsSystem.Model.ControlData;
import com.AMS.amsSystem.Model.RiskData;
import com.AMS.amsSystem.Repository.ControlDataRepository;

@CrossOrigin(origins ="*")
@RequestMapping("audit/")
@RestController
public class ControlDataController {

	
	final org.slf4j.Logger logger = LoggerFactory.getLogger(ControlDataController.class);

	
	@Autowired
	private ControlDataRepository controlDataRepository;
	
	@GetMapping("Control")
	public List<ControlData> getAllData(){
		return this.controlDataRepository.findAll();
	}
	
//
//	@PostMapping(path ="control",
//			consumes = MediaType.APPLICATION_JSON_VALUE,
//			produces =MediaType.APPLICATION_JSON_VALUE)
//	public void create(@RequestBody ControlData newData) {
//		ControlData controlData = controlDataRepository.save(newData);
//		
//	}
	
	@PutMapping("control")
	public ControlData updateControl(@RequestBody ControlData newData)
	{
		
		logger.error("newData = " + newData.toString());
		ControlData data = controlDataRepository.saveAndFlush(newData);
		return data;
	}
	
	@GetMapping("ControlDataForExcel")
	public void getData() throws SQLException, IOException{
		
		List<ControlData> list = controlDataRepository.findAll();
		ControlDataExcelSheet.ControlExcel(list, "ControlData" + ".xlsx");
	}
}
