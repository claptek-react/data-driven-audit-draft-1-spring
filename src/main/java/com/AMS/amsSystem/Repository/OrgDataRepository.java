package com.AMS.amsSystem.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.AMS.amsSystem.Model.OrgData;

@Repository
public interface OrgDataRepository extends JpaRepository<OrgData, String> {
	

}
