package com.team4.catalogbackend.dao;

import com.team4.catalogbackend.model.SubProcess;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface SubProcessRepository extends JpaRepository<SubProcess, Long> {
	
	@Query("SELECT s.subProcessId, s.subProcessName FROM SubProcess s where s.isEnabled = true")
    List<Object[]> findAllActiveSubProcess();
}
