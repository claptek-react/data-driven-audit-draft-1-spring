package com.AMS.amsSystem.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.AMS.amsSystem.Model.ColumnHeader;
import com.AMS.amsSystem.Repository.ColumnHeaderRepository;

@CrossOrigin(origins ="*")
@RestController
@RequestMapping("audit/")
public class ColumnHeaderController {
	
	@Autowired
	private ColumnHeaderRepository formConfigRepository;
	                                        
	@GetMapping("FormConfig")
	public List<ColumnHeader> getData() {
		return this.formConfigRepository.findAll();
	}
	
	@GetMapping("FormConfig/{formId}")
	public List<ColumnHeader> getData(@PathVariable String formId) {
//		logger.error("Inside controler");
		return formConfigRepository.findByFormId(formId);
	}

	

}
