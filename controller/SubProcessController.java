package com.team4.catalogbackend.controller;

import com.team4.catalogbackend.model.SubProcess;
import com.team4.catalogbackend.service.SubProcessService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/service/{groupId}/subprocesses")
public class SubProcessController {

    private final SubProcessService subProcessService;

    @Autowired
    public SubProcessController(SubProcessService subProcessService) {
        this.subProcessService = subProcessService;
    }

    @GetMapping
    public List<SubProcess> getAllSubProcesses() {
        return subProcessService.getAllSubProcesses();
    }

    @GetMapping("/{id}")
    public SubProcess getSubProcessById(@PathVariable Long id) {
        return subProcessService.getSubProcessById(id);
    }

    @PostMapping
    public SubProcess saveSubProcess(@RequestBody SubProcess subProcess) {
        return subProcessService.saveSubProcess(subProcess);
    }

    @DeleteMapping("/{id}")
    public void deleteSubProcess(@PathVariable Long id) {
        subProcessService.deleteSubProcess(id);
    }
    
    @GetMapping("getallactive/")
    public List<Object[]> getAllActiveSubProcess() {
    	return subProcessService.getAllActiveSubProcess();
    }
}
