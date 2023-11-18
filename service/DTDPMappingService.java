package com.team4.catalogbackend.service;
 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
 
import com.team4.catalogbackend.dao.DTDPMappingRepository;
import com.team4.catalogbackend.dao.DTDMappingRepository;
import com.team4.catalogbackend.dao.ProcessRepository;
import com.team4.catalogbackend.model.DTDPMapping;
import com.team4.catalogbackend.model.DTDPSPMapping;
import com.team4.catalogbackend.model.DTDMapping;
import com.team4.catalogbackend.model.Process;
import com.team4.catalogbackend.model.SubProcess;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Optional;
 
@Service
public class DTDPMappingService {
    @Autowired
    private DTDPMappingRepository dtdpMappingRepository;
 
    @Autowired
    private DTDMappingRepository dtdMappingRepository;
 
    @Autowired
    private ProcessRepository processRepository;
 
    public List<DTDPMapping> getAllDTDPMappings() {
        return dtdpMappingRepository.findAll();
    }
 
    public Optional<DTDPMapping> getDTDPMappingById(Long id) {
        return dtdpMappingRepository.findById(id);
    }
 
    public DTDPMapping saveDTDPMapping(DTDPMapping dtdpMapping) {
        return dtdpMappingRepository.save(dtdpMapping);
    }
 
    public void deleteDTDPMapping(Long id) {
        dtdpMappingRepository.deleteById(id);
    }
 
    public ArrayList<HashMap<String, String>> GetMappedProcesses(long dtdMappingId) {
        
    	DTDMapping dtdMapping = dtdMappingRepository.findById(dtdMappingId).get();
        List<DTDPMapping> dtdpMappings = dtdpMappingRepository.findByDtdMapping(dtdMapping);
 
        ArrayList<HashMap<String, String>> processesList = new ArrayList<>();
 
        for (int i = 0; i < dtdpMappings.size(); i++) {
            HashMap<String, String> processMap = new HashMap<String, String>();
 
            Long processId = dtdpMappings.get(i).getDtdpMappingId();
            String processName = dtdpMappings.get(i).getProcess().getProcessName();
 
            processMap.put("id", processId.toString());
            processMap.put("process", processName);
 
            processesList.add(processMap);
        }
        return processesList;
    }

	public List<DTDPMapping> check(Process process, DTDMapping dtdMapping) {
		// TODO Auto-generated method stub
		List<DTDPMapping>dtdpmappings = dtdpMappingRepository.findbyDTDAndProcess(process, dtdMapping);
		
		return dtdpmappings;
	}

}