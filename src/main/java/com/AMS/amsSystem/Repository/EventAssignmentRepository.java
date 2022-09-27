package com.AMS.amsSystem.Repository;

import org.hibernate.metamodel.model.convert.spi.JpaAttributeConverter;
import org.springframework.data.jpa.repository.JpaRepository;

import com.AMS.amsSystem.Model.EventAssignmentData;

public interface EventAssignmentRepository extends JpaRepository<EventAssignmentData, String> {

}
