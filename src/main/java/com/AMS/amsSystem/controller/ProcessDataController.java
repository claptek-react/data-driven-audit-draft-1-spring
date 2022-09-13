package com.AMS.amsSystem.controller;

import java.io.IOException;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.AMS.amsSystem.Download.DownloadPDF;
import com.AMS.amsSystem.Download.ProcessDataExcelSheet;
import com.AMS.amsSystem.Model.ProcessData;
import com.AMS.amsSystem.Repository.ProcessDataRepository;
import com.lowagie.text.DocumentException;



@CrossOrigin(origins ="*")
@RestController
@RequestMapping("audit/")
public class ProcessDataController {
	
	final org.slf4j.Logger logger = LoggerFactory.getLogger(ProcessDataController.class);
	
	
    @Autowired
	private ProcessDataRepository processDataRepository;    
    
    @GetMapping("FetchProcess")
   	public List<ProcessData> getAllData(){
   		return this.processDataRepository.findAll();
   	}
	

	
	
//	@PostMapping(path ="process",
//			consumes = MediaType.APPLICATION_JSON_VALUE,
//			produces =MediaType.APPLICATION_JSON_VALUE)
//	public void createProcess(@RequestBody ProcessData newData) {
//		logger.error("Inside createProcess newData = " + newData.toString());
//		ProcessData processData = processDataRepository.saveAndFlush(newData);		
//	}
	
	@PutMapping("SubmitProcess")
	public ProcessData updateProcess(@RequestBody ProcessData newData)
	{
		
		logger.error("newData = " + newData.toString());
		
		ProcessData data = processDataRepository.saveAndFlush(newData);
		return data;
	}
	
	@GetMapping("ProcessDataForExcel")
	public void getAllData1() throws SQLException, IOException {
	    
	    List<ProcessData> list =  processDataRepository.findAll();
	    ProcessDataExcelSheet.writeToExcel(list,"ProcessData" + ".xlsx");
	  }
	
//	
//    @GetMapping("pdf/Process")
//	public void generatePdf(HttpServletResponse response) throws DocumentException, IOException {
//
//		response.setContentType("application/pdf");
//		DateFormat dateFormat = new SimpleDateFormat("YYYY-MM-DD:HH:MM:SS");
//		String currentDateTime = dateFormat.format(new Date());
//		String headerkey = "Content-Disposition";
//		String headervalue = "attachment; filename=pdf_" + currentDateTime + ".pdf";
//		response.setHeader(headerkey, headervalue);
//    
//		List<ProcessData> processData = processDataRepository.findAll();
//		
//		DownloadPDF generator = new DownloadPDF();
//		generator.setProcessData(processData);
//		generator.generate(response);
//
//
//    }
//    
    
    	
}
	
	
	

