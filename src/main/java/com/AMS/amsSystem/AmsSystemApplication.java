package com.AMS.amsSystem;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.jdbc.core.JdbcTemplate;

import com.AMS.amsSystem.Model.ProcessData;
import com.AMS.amsSystem.Repository.ProcessDataRepository;

@SpringBootApplication(exclude = SecurityAutoConfiguration.class)
public class AmsSystemApplication implements CommandLineRunner{
	
	@Autowired
	private JdbcTemplate jdbcTemplate;

	public static void main(String[] args) {
		SpringApplication.run(AmsSystemApplication.class, args);
		
		
		
	}

	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
	
	
	
//		for (int i = 0; i < 11; i++) {
//			ProcessData student = new ProcessData();
//			student.setId("Student " + i);
//			ProcessDataRepository.save(ProcessData);
//		}

	}
}
