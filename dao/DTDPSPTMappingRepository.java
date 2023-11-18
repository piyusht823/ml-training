package com.team4.catalogbackend.dao;
 
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
 
import com.team4.catalogbackend.model.DTDPSPTMapping;
import com.team4.catalogbackend.model.Task;
import com.team4.catalogbackend.model.DTDPMapping;
import com.team4.catalogbackend.model.DTDPSPMapping;
 
@Repository
public interface DTDPSPTMappingRepository extends JpaRepository<DTDPSPTMapping, Long> {
	List<DTDPSPTMapping> findByDtdpspMapping(DTDPSPMapping dtdpspMapping);
	
	@Query("select d from DTDPSPTMapping d where d.task = :task AND d.dtdpspMapping = :dtdpspMapping")
	List<DTDPSPTMapping> findbyTaskAnddtdpsp(Task task, DTDPSPMapping dtdpspMapping);
}