package com.AMS.amsSystem.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.AMS.amsSystem.Model.FormConfig;
import com.AMS.amsSystem.Repository.FormConfigRepository;

@CrossOrigin(origins ="*")
@RestController
@RequestMapping("audit/")
public class FormConfigController {
	
	@Autowired
	private FormConfigRepository formConfigRepository;
	                                        
	@GetMapping("FormConfig")
	public List<FormConfig> getData() {
		return this.formConfigRepository.findAll();
	}
	
	@GetMapping("FormConfig/{formId}")
	public List<FormConfig> getData(@PathVariable String formId) {
//		logger.error("Inside controler");
		return formConfigRepository.findByFormId(formId);
	}

	

}
