package com.AMS.amsSystem.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.AMS.amsSystem.Model.FormInfoData;


@Repository
public interface FormInfoRepository extends JpaRepository<FormInfoData, Integer> {

}
