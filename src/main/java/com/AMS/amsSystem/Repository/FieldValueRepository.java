package com.AMS.amsSystem.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.AMS.amsSystem.Model.FieldValueData;

@Repository
public interface FieldValueRepository extends JpaRepository<FieldValueData, Integer> {


//	List<FieldValueData> findByfieldValueId(String fieldValueId);

	List<FieldValueData> findByFormId(String formId);
	

	
}
