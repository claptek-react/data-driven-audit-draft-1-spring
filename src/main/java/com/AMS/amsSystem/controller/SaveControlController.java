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

import com.AMS.amsSystem.Model.SaveControlData;
import com.AMS.amsSystem.Model.SaveRiskData;
import com.AMS.amsSystem.Repository.SaveControlRepository;

@CrossOrigin(origins ="*")
@RestController
@RequestMapping("audit/")
public class SaveControlController {

	@Autowired 
	private SaveControlRepository saveControlRepository;
	
	 final org.slf4j.Logger logger = LoggerFactory.getLogger(SaveControlController.class);

		
		@PutMapping("SaveControl")
		public SaveControlData updateSaveControl(@RequestBody SaveControlData newData)
		{
			
			logger.error("newData = " + newData.toString());
			SaveControlData data = saveControlRepository.saveAndFlush(newData);
			return data;
		}
}
