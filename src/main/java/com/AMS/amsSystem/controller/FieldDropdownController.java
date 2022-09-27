package com.AMS.amsSystem.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.AMS.amsSystem.Model.FieldDropdownData;
import com.AMS.amsSystem.Repository.FieldDropdownRepository;

@CrossOrigin(origins ="*")
@RestController
@RequestMapping("audit/")
public class FieldDropdownController {
	
	
//	final org.slf4j.Logger logger = LoggerFactory.getLogger(FormSectionController.class);

	
	@Autowired
	private FieldDropdownRepository fieldValueRepository;
	                                        
	@GetMapping("FieldValue")
	public List<FieldDropdownData> getData() {
		return this.fieldValueRepository.findAll();
	}
	
	@GetMapping("FieldValue/{formId}")
	public List<FieldDropdownData> getData(@PathVariable String formId) {
//		logger.error("Inside controler");
		return fieldValueRepository.findByFormId(formId);
	}
	
	
	

}
