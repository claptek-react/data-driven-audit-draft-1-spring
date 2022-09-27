package com.AMS.amsSystem.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.AMS.amsSystem.Model.ProcessData;

@Repository
public interface ProcessDataRepository  extends JpaRepository<ProcessData, Integer>{
	
	@Query(value = "EXEC ?1 @FormId = ?2,@PID = ?3,@InstanceId = ?4,@ObjectId = ?5,@stage = ?6,@status = ?7", nativeQuery = true)
	void runWorkflow(@Param("workflowProcedure") String workflowProcedure,@Param("formId") String formId,@Param("pid") int pid,
			@Param("instanceId") String instanceId,@Param("objectId") String objectId,@Param("stage") String stage,
			@Param("status") String status);
}
