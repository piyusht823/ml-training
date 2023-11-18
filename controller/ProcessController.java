package com.team4.catalogbackend.controller;

import com.team4.catalogbackend.model.Process;
import com.team4.catalogbackend.service.ProcessService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/service/{groupId}/processes")
public class ProcessController {

    private final ProcessService processService;

    @Autowired
    public ProcessController(ProcessService processService) {
        this.processService = processService;
    }

    @GetMapping("/getall")
    public List<Process> getAllProcesses() {
        return processService.getAllProcesses();
    }
    
    @GetMapping("getallactive/")
    public List<Object[]> getAllActiveProcess() {
    	return processService.getAllActiveProcess();
    }
    

    @GetMapping("get/{id}")
    public Process getProcessById(@PathVariable Long id) {
        return processService.getProcessById(id);
    }

    @PostMapping("/save")
    public Process saveProcess(@RequestBody Process process) {
        return processService.saveProcess(process);
    }

    @DeleteMapping("delete/{id}")
    public void deleteProcess(@PathVariable Long id) {
        processService.deleteProcess(id);
    }
    
}
