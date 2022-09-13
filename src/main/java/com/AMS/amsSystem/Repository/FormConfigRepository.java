package com.AMS.amsSystem.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.AMS.amsSystem.Model.FormConfig;

@Repository
public interface FormConfigRepository extends JpaRepository<FormConfig, String> {

	List<FormConfig> findByFormId(String formId);

}
