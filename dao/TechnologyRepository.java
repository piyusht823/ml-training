package com.team4.catalogbackend.dao;

import com.team4.catalogbackend.model.Technology;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface TechnologyRepository extends JpaRepository<Technology, Long> {
    // Custom query to retrieve only technologyId and technologyName
    @Query("SELECT t.technologyId, t.technologyName FROM Technology t where t.isEnabled = true")
    List<Object[]> findAllActiveTechnology();
}