package com.AMS.amsSystem.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.AMS.amsSystem.Model.ApiRepoManagemet;

public interface ApiRepoManagementRepository  extends JpaRepository<ApiRepoManagemet, String>{


	List<ApiRepoManagemet> findByObjectId(String objectId);

}
