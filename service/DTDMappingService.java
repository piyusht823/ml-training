package com.team4.catalogbackend.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.team4.catalogbackend.dao.DTDMappingRepository;
import com.team4.catalogbackend.dao.DTMappingRepository;
import com.team4.catalogbackend.dao.DeliverablesRepository;
import com.team4.catalogbackend.model.DTDMapping;
import com.team4.catalogbackend.model.DTMapping;
import com.team4.catalogbackend.model.Deliverables;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Optional;

@Service
public class DTDMappingService {
    
    @Autowired
    private DTDMappingRepository dtdMappingRepository;

    @Autowired
    private DTMappingRepository dtMappingRepository;

    @Autowired
    private DeliverablesRepository deliverablesRepository;

    public List<DTDMapping> getAllDTDMappings() {
        return dtdMappingRepository.findAll();
    }

    public Optional<DTDMapping> getDTDMappingById(Long id) {
        return dtdMappingRepository.findById(id);
    }

    public DTDMapping saveDTDMapping(DTDMapping dtdMapping) {
        return dtdMappingRepository.save(dtdMapping);
    }

    public void deleteDTDMapping(Long id) {
        dtdMappingRepository.deleteById(id);
    }

    public List<HashMap<String, String>> GetMappedDeliverables(long dtMappingId) {
        DTMapping dtMapping = dtMappingRepository.findById(dtMappingId).get();
        List<DTDMapping> dtdMappings = dtdMappingRepository.findByDtMapping(dtMapping);

        ArrayList<HashMap<String, String>> deliverablesList = new ArrayList<>();

        for (int i = 0; i < dtdMappings.size(); i++) {
            HashMap<String, String> deliverablesMap = new HashMap<String, String>();

            Long deliverablesId = dtdMappings.get(i).getDtdMappingId();
            String deliverablesName = dtdMappings.get(i).getDeliverables().getDeliverablesName();

            deliverablesMap.put("id", deliverablesId.toString());
            deliverablesMap.put("deliverables", deliverablesName);

            deliverablesList.add(deliverablesMap);
        }
        return deliverablesList;
    }

	public List<DTDMapping> check(Deliverables deliverable, DTMapping dtmapping) {
		// TODO Auto-generated method stub
		List<DTDMapping>dtdmappings = dtdMappingRepository.findbyDTAndDeliverable(deliverable, dtmapping);
		
		return dtdmappings;
	}
}
