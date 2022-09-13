package com.AMS.amsSystem.controller;

import java.util.List;

import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.AMS.amsSystem.Model.FieldsData;
import com.AMS.amsSystem.Repository.FieldRepository;

@CrossOrigin(origins ="*")
@RestController
@RequestMapping("audit/")
public class FieldController {
	
	final org.slf4j.Logger logger = LoggerFactory.getLogger(FieldController.class);

	
	 @Autowired
		private FieldRepository fieldRepository;
	    
	    
	    @GetMapping("FetchField")
	   	public List<FieldsData> getAllData(){
	   		return this.fieldRepository.findAll();
	   	}
	    
	    @GetMapping("FetchField/{formId}")
		public List<FieldsData> getData(@PathVariable String formId) {
			logger.error("Inside controler");
			return fieldRepository.findByFormId(formId);
		}

		

}
