package com.AMS.amsSystem.controller;

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
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.AMS.amsSystem.Model.ProcessData;
import com.AMS.amsSystem.Model.SaveProcessData;
import com.AMS.amsSystem.Repository.SaveProcessRepository;

@CrossOrigin(origins ="*")
@RestController
@RequestMapping("audit/")
public class SaveProcessController {
	

	
	@Autowired
    private SaveProcessRepository saveProcessRepository;
	
	final org.slf4j.Logger logger = LoggerFactory.getLogger(SaveProcessController.class);

	
	@PutMapping("SaveProcess")
	public SaveProcessData updateSaveProcess(@RequestBody SaveProcessData newData)
	{
		
		logger.error("newData = " + newData.toString());
		SaveProcessData data = saveProcessRepository.saveAndFlush(newData);
		return data;
	}
	
	
	@GetMapping("ProcessSave")
   	public List<SaveProcessData> getAllData11(){
   		return this.saveProcessRepository.findAll();
   	}
	
	
}
