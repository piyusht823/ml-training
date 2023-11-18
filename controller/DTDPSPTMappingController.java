package com.team4.catalogbackend.controller;
 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
 
import com.team4.catalogbackend.model.DTDPSPTMapping;
import com.team4.catalogbackend.service.DTDPSPTMappingService;
 
import java.util.HashMap;
import java.util.List;
import java.util.Optional;
 
@RestController
@RequestMapping("/api/dtdpspt-mappings")
public class DTDPSPTMappingController {
 
    private final DTDPSPTMappingService dtdpsptMappingService;
 
    @Autowired
    public DTDPSPTMappingController(DTDPSPTMappingService dtdpsptMappingService) {
        this.dtdpsptMappingService = dtdpsptMappingService;
    }
 
    @GetMapping
    public List<DTDPSPTMapping> getAllDTDPSPTMappings() {
        return dtdpsptMappingService.getAllDTDPSPTMappings();
    }
 
    @GetMapping("/{id}")
    public Optional<DTDPSPTMapping> getDTDPSPTMappingById(@PathVariable Long id) {
        return dtdpsptMappingService.getDTDPSPTMappingById(id);
    }
 
    @PostMapping
    public DTDPSPTMapping saveDTDPSPTMapping(@RequestBody DTDPSPTMapping dtdpsptMapping) {
        return dtdpsptMappingService.saveDTDPSPTMapping(dtdpsptMapping);
    }
 
    @DeleteMapping("/{id}")
    public void deleteDTDPSPTMapping(@PathVariable Long id) {
        dtdpsptMappingService.deleteDTDPSPTMapping(id);
    }
 
    @GetMapping("/getmappedtasks/{dtdpspmappingid}")
    List<HashMap<String, String>> GetMappedTasks(@RequestParam long dtdpspmappingid) {
        return dtdpsptMappingService.GetMappedTasks(dtdpspmappingid);
    }
}