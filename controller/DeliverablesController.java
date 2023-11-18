package com.team4.catalogbackend.controller;

import com.team4.catalogbackend.model.Deliverables;
import com.team4.catalogbackend.service.DeliverablesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/service/{groupId}/deliverables")
public class DeliverablesController {

    private final DeliverablesService deliverablesService;

    @Autowired
    public DeliverablesController(DeliverablesService deliverablesService) {
        this.deliverablesService = deliverablesService;
    }

    @GetMapping("/getall")
    public List<Deliverables> getAllDeliverables(){
        return deliverablesService.getAllDeliverables();
    }
    
    @GetMapping("/getallactive")
    public List<Object[]> getAllActiveDeliverables(){
        return deliverablesService.getAllActiveDeliverables();
    }

    @GetMapping("/get/{id}")
    public Deliverables getDeliverablesById(@PathVariable Long id) {
        return deliverablesService.getDeliverablesById(id);
    }

    @PostMapping("save")
    public Deliverables saveDeliverables(@RequestBody Deliverables deliverables) {
        return deliverablesService.saveDeliverables(deliverables);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteDeliverables(@PathVariable Long id) {
        deliverablesService.deleteDeliverables(id);
    }
    
}

