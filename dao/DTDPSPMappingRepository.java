package com.team4.catalogbackend.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.team4.catalogbackend.model.DTDPMapping;
import com.team4.catalogbackend.model.DTDPSPMapping;
import com.team4.catalogbackend.model.SubProcess;

@Repository
public interface DTDPSPMappingRepository extends JpaRepository<DTDPSPMapping, Long> {
	
	List<DTDPSPMapping> findByDtdpMapping(DTDPMapping dtdpMapping);
	
	@Query("select d from DTDPSPMapping d where d.dtdpMapping = :dtdpMapping AND d.subProcess = :subProcess")
	List<DTDPSPMapping> findbyDTDPAndSubProcess(SubProcess subProcess, DTDPMapping dtdpMapping);
}

