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

import com.AMS.amsSystem.Download.TestDataExcelSheet;
import com.AMS.amsSystem.Model.ControlData;
import com.AMS.amsSystem.Model.TestData;
import com.AMS.amsSystem.Repository.TestDataRepository;

@CrossOrigin(origins ="*")

@RestController
@RequestMapping("audit/")
public class TestDataController {
	
	final org.slf4j.Logger logger = LoggerFactory.getLogger(TestDataController.class);

	
	@Autowired
	private TestDataRepository testDataRepository;
	
	@GetMapping("FetchTest")
	public List<TestData> getAllData(){
		return this.testDataRepository.findAll();
	}
	

//	@PostMapping(path ="test",
//			consumes = MediaType.APPLICATION_JSON_VALUE,
//			produces = MediaType.APPLICATION_JSON_VALUE)
//	public void create(@RequestBody TestData newData) {
//	TestData testData = testDataRepository.save(newData);
//	
//	}
	
	@PutMapping("SubmitTest")
	public TestData updateTest(@RequestBody TestData newData)
	{
		
		logger.error("newData = " + newData.toString());
		TestData data = testDataRepository.saveAndFlush(newData);
		return data;
	}
	
	@GetMapping("TestDataForExcel")
	public void getData() throws SQLException, IOException {
		List<TestData> list = testDataRepository.findAll();
		TestDataExcelSheet.TestExcel(list, "TestData" + ".xlsx");
	}


}
