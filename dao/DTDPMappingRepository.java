package com.team4.catalogbackend.dao;
 
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.team4.catalogbackend.model.DTDMapping;
import com.team4.catalogbackend.model.DTDPMapping;
import com.team4.catalogbackend.model.Process;
 
@Repository
public interface DTDPMappingRepository extends JpaRepository<DTDPMapping, Long> {

	List<DTDPMapping> findByDtdMapping(DTDMapping dtdMapping);
	
	@Query("select d from DTDPMapping d where d.process = :process AND d.dtdMapping = :dtdMapping")
	List<DTDPMapping> findbyDTDAndProcess(Process process, DTDMapping dtdMapping);
 
    // You can add custom queries if needed
}