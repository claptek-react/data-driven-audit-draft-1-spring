package com.AMS.amsSystem.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.AMS.amsSystem.Model.FormSectionData;
import com.AMS.amsSystem.Repository.FormSectionRepository;

@CrossOrigin(origins ="*")
@RestController
@RequestMapping("audit/")
public class FormSectionController {

//	final org.slf4j.Logger logger = LoggerFactory.getLogger(FormSectionController.class);
	
	@Autowired
	private FormSectionRepository formSectionRepository;
	
	@GetMapping("FormSection/{formId}")
	public List<FormSectionData> getData(@PathVariable String formId) {
//		logger.error("Inside controler");
		return formSectionRepository.findByFormId(formId);
	}
	
//	@GetMapping("FormIdAndSectionId")
//	List<FormSectionData> getFormByFormAndSectionId (@RequestParam int formId, @RequestParam int sectionId) {
//		return formSectionRepository.findBy(formId, sectionId);
//		
//	}
	
}
