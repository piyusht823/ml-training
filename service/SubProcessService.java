package com.team4.catalogbackend.service;

import com.team4.catalogbackend.model.SubProcess;
import com.team4.catalogbackend.dao.SubProcessRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SubProcessService {

    private final SubProcessRepository subProcessRepository;

    @Autowired
    public SubProcessService(SubProcessRepository subProcessRepository) {
        this.subProcessRepository = subProcessRepository;
    }

    public List<SubProcess> getAllSubProcesses() {
        return subProcessRepository.findAll();
    }

    public SubProcess getSubProcessById(Long id) {
        return subProcessRepository.findById(id).get();
    }

    public SubProcess saveSubProcess(SubProcess subProcess) {
        return subProcessRepository.save(subProcess);
    }

    public void deleteSubProcess(Long id) {
        subProcessRepository.deleteById(id);
    }
    
    public List<Object[]> getAllActiveSubProcess() {
		return subProcessRepository.findAllActiveSubProcess();
	}
}
