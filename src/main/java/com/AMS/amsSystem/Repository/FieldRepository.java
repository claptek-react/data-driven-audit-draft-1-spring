package com.AMS.amsSystem.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


import com.AMS.amsSystem.Model.FieldsData;

@Repository
public interface FieldRepository  extends JpaRepository<FieldsData, String>{
	
	List<FieldsData> findByFormId(String formId);


}
