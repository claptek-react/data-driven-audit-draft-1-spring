package com.AMS.amsSystem.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.AMS.amsSystem.Model.ControlData;
import com.AMS.amsSystem.Model.TestData;

@Repository
public interface TestDataRepository extends JpaRepository<TestData, String>{
	


}
