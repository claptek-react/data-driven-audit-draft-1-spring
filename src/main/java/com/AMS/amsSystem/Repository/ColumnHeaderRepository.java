package com.AMS.amsSystem.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.AMS.amsSystem.Model.ColumnHeader;

@Repository
public interface ColumnHeaderRepository extends JpaRepository<ColumnHeader, String> {

	List<ColumnHeader> findByFormId(String formId);

}
