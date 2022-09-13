package com.AMS.amsSystem.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.AMS.amsSystem.Model.DashboardData;

public interface DashboardRepository extends JpaRepository<DashboardData, String> {

}
