package com.team4.catalogbackend.service;
 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
 
import com.team4.catalogbackend.dao.DTDPSPTMappingRepository;
import com.team4.catalogbackend.dao.DTDPSPMappingRepository;
import com.team4.catalogbackend.dao.TaskRepository;
import com.team4.catalogbackend.model.DTDPSPTMapping;
import com.team4.catalogbackend.model.DTDPSPMapping;
import com.team4.catalogbackend.model.Task;
 
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Optional;
 
@Service
public class DTDPSPTMappingService {
    @Autowired
    private DTDPSPTMappingRepository dtdpsptMappingRepository;
 
    @Autowired
    private DTDPSPMappingRepository dtdpspMappingRepository;
 
    @Autowired
    private TaskRepository taskRepository;
 
    public List<DTDPSPTMapping> getAllDTDPSPTMappings() {
        return dtdpsptMappingRepository.findAll();
    }
 
    public Optional<DTDPSPTMapping> getDTDPSPTMappingById(Long id) {
        return dtdpsptMappingRepository.findById(id);
    }
 
    public DTDPSPTMapping saveDTDPSPTMapping(DTDPSPTMapping dtdpsptMapping) {
        return dtdpsptMappingRepository.save(dtdpsptMapping);
    }
 
    public void deleteDTDPSPTMapping(Long id) {
        dtdpsptMappingRepository.deleteById(id);
    }
 
    public List<HashMap<String, String>> GetMappedTasks(long dtdpspMappingId) {
        DTDPSPMapping dtdpspMapping = dtdpspMappingRepository.findById(dtdpspMappingId).get();
        List<DTDPSPTMapping> dtdpsptMappings = dtdpsptMappingRepository.findByDtdpspMapping(dtdpspMapping);
 
        ArrayList<HashMap<String, String>> tasksList = new ArrayList<>();
 
        for (int i = 0; i < dtdpsptMappings.size(); i++) {
            HashMap<String, String> taskMap = new HashMap<String, String>();
 
            Long taskId = dtdpsptMappings.get(i).getDtdpsptMappingId();
            String taskName = dtdpsptMappings.get(i).getTask().getTaskName();
 
            taskMap.put("id", taskId.toString());
            taskMap.put("task", taskName);
 
            tasksList.add(taskMap);
        }
        return tasksList;
    }

	public List<DTDPSPTMapping> check(Task task, DTDPSPMapping dtdpspMapping) {
		// TODO Auto-generated method stub
		List<DTDPSPTMapping>dtspsptmappings = dtdpsptMappingRepository.findbyTaskAnddtdpsp(task , dtdpspMapping);
		
		return dtspsptmappings;
	}
}