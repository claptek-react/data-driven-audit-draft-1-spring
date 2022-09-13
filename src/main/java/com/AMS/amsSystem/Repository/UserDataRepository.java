package com.AMS.amsSystem.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.AMS.amsSystem.Model.UserData;

@Repository
public interface UserDataRepository extends JpaRepository<UserData, String> {

}
