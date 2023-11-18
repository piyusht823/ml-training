package com.team4.catalogbackend.dao;

import com.team4.catalogbackend.model.Process;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface ProcessRepository extends JpaRepository<Process, Long> {
	
	@Query("SELECT p.processId, p.processName FROM Process p where p.isEnabled = true")
    List<Object[]> findAllActiveProcess();
}
