package com.team4.catalogbackend.controller;
 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
 
import com.team4.catalogbackend.model.DTDPSPMapping;
import com.team4.catalogbackend.service.DTDPSPMappingService;
 
import java.util.HashMap;
import java.util.List;
import java.util.Optional;
 
@RestController
@RequestMapping("/api/dtdpsp-mappings")
public class DTDPSPMappingController {
 
    private final DTDPSPMappingService dtdpspMappingService;
 
    @Autowired
    public DTDPSPMappingController(DTDPSPMappingService dtdpspMappingService) {
        this.dtdpspMappingService = dtdpspMappingService;
    }
 
    @GetMapping
    public List<DTDPSPMapping> getAllDTDPSPMappings() {
        return dtdpspMappingService.getAllDTDPSPMappings();
    }
 
    @GetMapping("/{id}")
    public Optional<DTDPSPMapping> getDTDPSPMappingById(@PathVariable Long id) {
        return dtdpspMappingService.getDTDPSPMappingById(id);
    }
 
    @PostMapping
    public DTDPSPMapping saveDTDPSPMapping(@RequestBody DTDPSPMapping dtdpspMapping) {
        return dtdpspMappingService.saveDTDPSPMapping(dtdpspMapping);
    }
 
    @DeleteMapping("/{id}")
    public void deleteDTDPSPMapping(@PathVariable Long id) {
        dtdpspMappingService.deleteDTDPSPMapping(id);
    }
 
    @GetMapping("/getmappedsubprocesses/{dtdpmappingid}")
    List<HashMap<String, String>> GetMappedSubProcesses(@RequestParam long dtdpmappingid) {
        return dtdpspMappingService.GetMappedSubProcesses(dtdpmappingid);
    }
}