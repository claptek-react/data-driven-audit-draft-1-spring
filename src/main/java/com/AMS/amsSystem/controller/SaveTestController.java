package com.AMS.amsSystem.controller;

import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.AMS.amsSystem.Model.SaveRiskData;
import com.AMS.amsSystem.Model.SaveTestData;
import com.AMS.amsSystem.Repository.SaveRsikRepository;
import com.AMS.amsSystem.Repository.SaveTestRepository;

@CrossOrigin(origins ="*")
@RestController
@RequestMapping("audit/")
public class SaveTestController {
	
	@Autowired
	private SaveTestRepository saveTestRepository;
	
	 final org.slf4j.Logger logger = LoggerFactory.getLogger(SaveTestController.class);

		
		@PutMapping("SaveTest")
		public SaveTestData updateSaveTest(@RequestBody SaveTestData newData)
		{
			
			logger.error("newData = " + newData.toString());
			SaveTestData data = saveTestRepository.saveAndFlush(newData);
			return data;
		}
}
	