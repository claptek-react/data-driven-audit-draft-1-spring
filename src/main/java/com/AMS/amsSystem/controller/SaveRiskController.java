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

import com.AMS.amsSystem.Model.SaveProcessData;
import com.AMS.amsSystem.Model.SaveRiskData;
import com.AMS.amsSystem.Repository.SaveRsikRepository;

@CrossOrigin(origins ="*"
		+ "")
@RestController
@RequestMapping("audit/")
public class SaveRiskController {
	
	@Autowired
	private SaveRsikRepository saveRiskRepository;
	
	
    final org.slf4j.Logger logger = LoggerFactory.getLogger(SaveRiskController.class);

	
	@PutMapping("SaveRisk")
	public SaveRiskData updateSaveRisk(@RequestBody SaveRiskData newData)
	{
		
		logger.error("newData = " + newData.toString());
		SaveRiskData data = saveRiskRepository.saveAndFlush(newData);
		return data;
	}
	
}
