package com.AMS.amsSystem.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.AMS.amsSystem.Model.SaveControlData;


@Repository
public interface SaveControlRepository extends JpaRepository<SaveControlData, String>{

}
