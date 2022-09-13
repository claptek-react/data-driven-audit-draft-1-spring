package com.AMS.amsSystem.Repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.AMS.amsSystem.Model.FormSectionData;


@Repository
public interface FormSectionRepository extends JpaRepository<FormSectionData, String> {



	List<FormSectionData> findByFormId(String formId);

//	List<FormSectionData> findBy(int formId, int sectionId);

//	List<FormSectionData> findAllById();

}
