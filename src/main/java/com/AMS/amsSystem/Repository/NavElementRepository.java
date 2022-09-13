package com.AMS.amsSystem.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.AMS.amsSystem.Model.NavElementData;

public interface NavElementRepository extends JpaRepository<NavElementData, String> {

}
