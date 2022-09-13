package com.AMS.amsSystem.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.AMS.amsSystem.Model.FormInfoData;
import com.AMS.amsSystem.Repository.FormInfoRepository;

@CrossOrigin(origins ="*")
@RestController
@RequestMapping("audit/")
public class FormInfoController {

	
	@Autowired
	private FormInfoRepository formInfoRepository;
	
	@GetMapping("FormInfo")
	public List<FormInfoData> getData() {
		return this.formInfoRepository.findAll();
	}
}
