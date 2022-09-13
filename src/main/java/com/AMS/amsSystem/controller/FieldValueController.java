package com.AMS.amsSystem.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.AMS.amsSystem.Model.FieldValueData;
import com.AMS.amsSystem.Repository.FieldValueRepository;

@CrossOrigin(origins ="*")
@RestController
@RequestMapping("audit/")
public class FieldValueController {
	
	
//	final org.slf4j.Logger logger = LoggerFactory.getLogger(FormSectionController.class);

	
	@Autowired
	private FieldValueRepository fieldValueRepository;
	                                        
	@GetMapping("FieldValue")
	public List<FieldValueData> getData() {
		return this.fieldValueRepository.findAll();
	}
	
	@GetMapping("FieldValue/{formId}")
	public List<FieldValueData> getData(@PathVariable String formId) {
//		logger.error("Inside controler");
		return fieldValueRepository.findByFormId(formId);
	}
	
	
	

}
