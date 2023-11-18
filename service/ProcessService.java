package com.team4.catalogbackend.service;

import com.team4.catalogbackend.model.Process;
import com.team4.catalogbackend.dao.ProcessRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProcessService {

    private final ProcessRepository processRepository;
    

    @Autowired
    public ProcessService(ProcessRepository processRepository) {
        this.processRepository = processRepository;
    }

    public List<Process> getAllProcesses() {
    	
        return processRepository.findAll();
    }
    
    public List<Object[]> getAllActiveProcess() {
		return processRepository.findAllActiveProcess();
	}

    public Process getProcessById(Long id) {
        return processRepository.findById(id).get();
    }

    public Process saveProcess(Process process) {
        return processRepository.save(process);
    }

    public void deleteProcess(Long id) {
        processRepository.deleteById(id);
    }
}
