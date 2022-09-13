package com.AMS.amsSystem.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.AMS.amsSystem.Model.UserData;

@Repository
public interface UserDataRepository extends JpaRepository<UserData, String> {

	List<UserData> findByUserName(String userName);

//	List<UserData> findByUseNameAndUserId(String userName, String id);

}
