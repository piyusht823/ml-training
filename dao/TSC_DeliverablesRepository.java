package com.team4.catalogbackend.dao;

import com.team4.catalogbackend.model.TSC_Deliverables;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TSC_DeliverablesRepository extends JpaRepository<TSC_Deliverables, Long> {
}
