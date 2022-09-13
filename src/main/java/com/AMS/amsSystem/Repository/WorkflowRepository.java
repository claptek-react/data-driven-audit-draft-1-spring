package com.AMS.amsSystem.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.AMS.amsSystem.Model.Workflow;

public interface WorkflowRepository extends JpaRepository<Workflow, String> {
	
	List<Workflow> findByFormId(String formId);

}
