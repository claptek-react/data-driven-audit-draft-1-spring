package com.AMS.amsSystem.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.AMS.amsSystem.Model.SaveProcessData;

@Repository
public interface SaveProcessRepository  extends JpaRepository<SaveProcessData, String>{

}
