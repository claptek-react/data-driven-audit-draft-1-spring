package com.AMS.amsSystem.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.AMS.amsSystem.Model.SaveRiskData;


@Repository
public interface SaveRsikRepository extends JpaRepository<SaveRiskData, String> {

}
