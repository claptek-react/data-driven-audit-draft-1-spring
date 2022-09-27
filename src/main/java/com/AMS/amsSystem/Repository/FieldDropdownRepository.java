package com.AMS.amsSystem.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.AMS.amsSystem.Model.FieldDropdownData;

@Repository
public interface FieldDropdownRepository extends JpaRepository<FieldDropdownData, Integer> {


//	List<FieldValueData> findByfieldValueId(String fieldValueId);

	List<FieldDropdownData> findByFormId(String formId);
	

	
}
