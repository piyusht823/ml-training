package com.team4.catalogbackend.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import com.team4.catalogbackend.model.DTDMapping;
import com.team4.catalogbackend.model.DTMapping;
import com.team4.catalogbackend.model.Deliverables;

@Repository
public interface DTDMappingRepository extends JpaRepository<DTDMapping, Long> {

	List<DTDMapping> findByDtMapping(DTMapping dtMapping);
	
	@Query("select d from DTDMapping d where d.deliverables = :deliverable AND d.dtMapping = :dtmapping")
	List<DTDMapping> findbyDTAndDeliverable(Deliverables deliverable, DTMapping dtmapping);
}

