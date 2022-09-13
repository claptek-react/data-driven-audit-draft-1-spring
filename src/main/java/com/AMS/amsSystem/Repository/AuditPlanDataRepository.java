package com.AMS.amsSystem.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.AMS.amsSystem.Model.AuditPlanData;

@Repository
public interface AuditPlanDataRepository extends JpaRepository<AuditPlanData, String> {
	
}
