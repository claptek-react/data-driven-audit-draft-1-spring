package com.AMS.amsSystem.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.AMS.amsSystem.Model.SaveTestData;

public interface SaveTestRepository extends JpaRepository<SaveTestData, String> {

}
