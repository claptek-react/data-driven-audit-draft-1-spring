package com.AMS.amsSystem.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.AMS.amsSystem.Model.ApiRepoManagemet;
import com.AMS.amsSystem.Model.FieldDropdownData;
import com.AMS.amsSystem.Repository.ApiRepoManagementRepository;

@CrossOrigin(origins ="*")
@RestController
@RequestMapping("audit/")
public class ApiRepoManagementController {
	
	@Autowired
	private ApiRepoManagementRepository apiRepoManagemetRepository;
	
	
	@GetMapping("ApiManagement")
    public List<ApiRepoManagemet> getData() {
		return this.apiRepoManagemetRepository.findAll();
	}
	
	@GetMapping("apiManagement/{objectId}")
	public List<ApiRepoManagemet> getData(@PathVariable String objectId) {
//		logger.error("Inside controler");
		return apiRepoManagemetRepository.findByObjectId(objectId);
	}
	
	
	
	
}
