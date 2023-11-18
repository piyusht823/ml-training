package com.team4.catalogbackend.controller;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.team4.catalogbackend.model.DTDMapping;
import com.team4.catalogbackend.model.DTDPMapping;
import com.team4.catalogbackend.model.DTDPSPMapping;
import com.team4.catalogbackend.model.DTDPSPTMapping;
import com.team4.catalogbackend.model.DTMapping;
import com.team4.catalogbackend.model.Deliverables;
import com.team4.catalogbackend.model.Domain;
import com.team4.catalogbackend.model.Process;
import com.team4.catalogbackend.model.SubProcess;
import com.team4.catalogbackend.model.Task;
import com.team4.catalogbackend.model.Technology;
import com.team4.catalogbackend.service.DTDMappingService;
import com.team4.catalogbackend.service.DTDPMappingService;
import com.team4.catalogbackend.service.DTDPSPMappingService;
import com.team4.catalogbackend.service.DTDPSPTMappingService;
import com.team4.catalogbackend.service.DTMappingService;
import com.team4.catalogbackend.service.DeliverablesService;
import com.team4.catalogbackend.service.DomainService;
import com.team4.catalogbackend.service.ProcessService;
import com.team4.catalogbackend.service.SubProcessService;
import com.team4.catalogbackend.service.TaskService;
import com.team4.catalogbackend.service.TechnologyService;

import org.springframework.web.bind.annotation.RequestBody;


@RestController
@RequestMapping("/api/service/0/saveglobalcatalog")
public class GlobalCatalogSaveMappingController {
	//getting all the mapping services
	@Autowired
	DTMappingService dtMappingService;
	@Autowired	
	DTDMappingService dtdMappingService;
	@Autowired
	DTDPMappingService dtdpMappingService;
	@Autowired	
	DTDPSPMappingService dtdpspMappingService;
	@Autowired	
	DTDPSPTMappingService dtdpsptMappingService;
		
		@Autowired
		DomainService domainService;
		@Autowired
		TechnologyService technologyService;
		@Autowired
		DeliverablesService deliverablesService;
		@Autowired
		ProcessService processService;
		@Autowired
		SubProcessService subProcessService;
		@Autowired 
		TaskService taskService;
		
		// For saving the Admin created Mapping
		@PostMapping("/saveadminmapping")
		public ArrayList<String> SaveAdminMapping(@RequestBody List<Map<String, Long>> mapping) {
			ArrayList<String>Result = new ArrayList<String>();
			mapping.forEach((e)->{
					Result.add(SaveMappingOneAtATime(e));
			});
			
			return Result;
			
		}
		
		
		
		 public String SaveMappingOneAtATime(Map<String, Long> mapping) {
			
			boolean alreadyMapping = true;
			
			Domain domain = domainService.getDomainById(mapping.get("domain"));
			Technology technology = technologyService.getTechnologyById(mapping.get("technology"));
			
			// this function will check mapping is already present or not 
			// and return if it is present
			//else return empty list
			List<DTMapping> dtMappings =  dtMappingService.check(domain ,technology);

			DTMapping dtmapping;
			if(dtMappings.size() == 1) {
				dtmapping = dtMappings.get(0);
			}else {
				DTMapping temp_dtMapping=new DTMapping(domain ,technology);
				dtmapping = dtMappingService.saveDTMapping(temp_dtMapping);
				alreadyMapping = false;
			}
			
			// Adding for deliverable
			DTDMapping dtdMapping;
			if(mapping.get("deliverable") != null ) {
				Deliverables deliverable = deliverablesService.getDeliverablesById(mapping.get("deliverable"));
				
				List<DTDMapping>dtdMappings = dtdMappingService.check(deliverable , dtmapping);
				
				if(dtdMappings.size() == 1) {
					dtdMapping = dtdMappings.get(0);
				}else {
					DTDMapping temp_dtdMapping=new DTDMapping(dtmapping,deliverable);
					dtdMapping = dtdMappingService.saveDTDMapping(temp_dtdMapping);
					alreadyMapping = false;
				}
			}else {
				if(alreadyMapping)return "mapping is already present";
				return "your mapping is saved";
			}
			
			// Adding for Process
			
			DTDPMapping dtdpMapping;
			if(mapping.get("process") != null ) {
				Process Process = processService.getProcessById(mapping.get("process"));
				
				
				List<DTDPMapping>dtdpMappings = dtdpMappingService.check(Process , dtdMapping);
				if(dtdpMappings.size() == 1) {
					dtdpMapping = dtdpMappings.get(0);
				}else {
					DTDPMapping temp_dtdpMapping=new DTDPMapping(dtdMapping,Process);
					dtdpMapping = dtdpMappingService.saveDTDPMapping(temp_dtdpMapping);
					alreadyMapping = false;
				}
			}else {
				if(alreadyMapping)return "mapping is already present";
				return "your mapping is saved";
			}
			
			//Adding subProcess
			DTDPSPMapping dtdpspMapping;
			if(mapping.get("subprocess") != null ) {
				SubProcess subProcess = subProcessService.getSubProcessById(mapping.get("subprocess"));
				
				
				List<DTDPSPMapping>dtdpspMappings = dtdpspMappingService.check(subProcess, dtdpMapping);
				if(dtdpspMappings.size() == 1) {
					dtdpspMapping = dtdpspMappings.get(0);
				}else {
					DTDPSPMapping temp_dtdpspMapping = new DTDPSPMapping(subProcess,dtdpMapping);
					dtdpspMapping = dtdpspMappingService.saveDTDPSPMapping(temp_dtdpspMapping);
					alreadyMapping = false;
				}
			}else {
				if(alreadyMapping)return "mapping is already present";
				return "your mapping is saved";
			}
			
			//Adding Task
			DTDPSPTMapping dtdpsptMapping;
			if(mapping.get("task") != null ) {
				
				Task Task= taskService.getTaskById(mapping.get("task"));
				
				List<DTDPSPTMapping>dtdpsptMappings = dtdpsptMappingService.check(Task, dtdpspMapping);
				
				if(dtdpsptMappings.size() == 1) {
					dtdpsptMapping = dtdpsptMappings.get(0);
				}else {
					DTDPSPTMapping temp_dtdpsptMapping = new DTDPSPTMapping(Task,dtdpspMapping);
					dtdpsptMapping = dtdpsptMappingService.saveDTDPSPTMapping(temp_dtdpsptMapping);
					alreadyMapping = false;
				}
			}else {
				if(alreadyMapping)return "mapping is already present";
				return "your mapping is saved";
			}
			if (alreadyMapping)return "mapping is already present";
			return "mapping is created";
			
		}
}
