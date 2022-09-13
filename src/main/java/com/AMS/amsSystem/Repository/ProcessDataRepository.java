package com.AMS.amsSystem.Repository;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.AMS.amsSystem.Model.ProcessData;

@Repository
public interface ProcessDataRepository  extends JpaRepository<ProcessData, Integer>{
	
	@Transactional
	@Modifying
	@Query(value = "SET NOCOUNT ON EXEC :workflowProc @FormId=:formId, @PID=:pid, @InstanceId =:instanceId,\r\n" + 
			"@ObjectId =:objectId, @stage = :stage, @status = :status", nativeQuery = true)
	public void pushDataToWorkflow(@Param("pid") int  pid,@Param("instanceId") String  instanceId
			,@Param("objectId") String  objectId,
			@Param("stage") String  stage,@Param("status") String  status,
			@Param("workflowProc") String  workflowProc,@Param("formId") String  formId);
}
