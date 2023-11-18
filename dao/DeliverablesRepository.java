package com.team4.catalogbackend.dao;

import com.team4.catalogbackend.model.Deliverables;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface DeliverablesRepository extends JpaRepository<Deliverables, Long> {
    // Custom query to retrieve only deliverablesId and deliverablesName
    @Query("SELECT d.deliverablesId, d.deliverablesName FROM Deliverables d where d.isEnabled = true")
    List<Object[]> findAllActiveDeliverables();
    
}
