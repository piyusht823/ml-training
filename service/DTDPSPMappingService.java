package com.team4.catalogbackend.service;
 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
 
import com.team4.catalogbackend.dao.DTDPSPMappingRepository;
import com.team4.catalogbackend.dao.DTDPMappingRepository;
import com.team4.catalogbackend.dao.SubProcessRepository;
import com.team4.catalogbackend.model.DTDPSPMapping;
import com.team4.catalogbackend.model.DTDPMapping;
import com.team4.catalogbackend.model.SubProcess;
 
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Optional;
 
@Service
public class DTDPSPMappingService {
    @Autowired
    private DTDPSPMappingRepository dtdpspMappingRepository;
 
    @Autowired
    private DTDPMappingRepository dtdpMappingRepository;
 
    @Autowired
    private SubProcessRepository subProcessRepository;
 
    public List<DTDPSPMapping> getAllDTDPSPMappings() {
        return dtdpspMappingRepository.findAll();
    }
 
    public Optional<DTDPSPMapping> getDTDPSPMappingById(Long id) {
        return dtdpspMappingRepository.findById(id);
    }
 
    public DTDPSPMapping saveDTDPSPMapping(DTDPSPMapping dtdpspMapping) {
        return dtdpspMappingRepository.save(dtdpspMapping);
    }
 
    public void deleteDTDPSPMapping(Long id) {
        dtdpspMappingRepository.deleteById(id);
    }
 
    public List<HashMap<String, String>> GetMappedSubProcesses(long dtdpMappingId) {
        DTDPMapping dtdpMapping = dtdpMappingRepository.findById(dtdpMappingId).get();
        List<DTDPSPMapping> dtdpspMappings = dtdpspMappingRepository.findByDtdpMapping(dtdpMapping);
 
        ArrayList<HashMap<String, String>> subProcessesList = new ArrayList<>();
 
        for (int i = 0; i < dtdpspMappings.size(); i++) {
            HashMap<String, String> subProcessMap = new HashMap<String, String>();
 
            Long subProcessId = dtdpspMappings.get(i).getDtdpspMappingId();
            String subProcessName = dtdpspMappings.get(i).getSubProcess().getSubProcessName();
 
            subProcessMap.put("id", subProcessId.toString());
            subProcessMap.put("subProcess", subProcessName);
 
            subProcessesList.add(subProcessMap);
        }
        return subProcessesList;
    }

	public List<DTDPSPMapping> check(SubProcess subProcess, DTDPMapping dtdpMapping) {
		// TODO Auto-generated method stub
		List<DTDPSPMapping>dtmappings = dtdpspMappingRepository.findbyDTDPAndSubProcess(subProcess , dtdpMapping);
		
		return dtmappings;
	}
}