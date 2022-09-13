package com.AMS.amsSystem.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.AMS.amsSystem.Model.DashboardData;
import com.AMS.amsSystem.Repository.DashboardRepository;

@CrossOrigin(origins ="*")
@RestController
@RequestMapping("audit/")
public class DashboardController {

	

    @Autowired
	private DashboardRepository dashboardRepository;    
    
    @GetMapping("Dashboard")
   	public List<DashboardData> getAllData(){
   		return this.dashboardRepository.findAll();
   	}
	
}
