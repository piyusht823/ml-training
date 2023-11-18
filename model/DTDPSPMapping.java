package com.team4.catalogbackend.model;


import java.sql.Time;
import java.time.LocalDateTime;

import org.hibernate.annotations.CreationTimestamp;

//import com.team4.catalogbackend.model.SubProcess;

import jakarta.persistence.*;

@Entity
public class DTDPSPMapping {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long dtdpspMappingId;

    @ManyToOne
    @JoinColumn(name = "dtdp_mapping_id")
    private DTDPMapping dtdpMapping;

    @ManyToOne
    @JoinColumn(name = "sub_process_id")
    private SubProcess subProcess;
    
    private String createdBy;
    
    @CreationTimestamp
    private LocalDateTime createdOn;
    private String modifiedBy;
    
    @CreationTimestamp
    private LocalDateTime modifiedOn;
    private boolean isEnabled;
    
    // Getters and setters

    public DTDPSPMapping(SubProcess subProcess, DTDPMapping dtdpMapping) {
		// TODO Auto-generated constructor stub
    	this.subProcess = subProcess;
    	this.dtdpMapping = dtdpMapping;
    	this.createdBy = "amrita";
    	this.modifiedBy = null;
    	this.isEnabled= true;
	}
    
    public DTDPSPMapping() {}

	public Long getDtdpspMappingId() {
        return dtdpspMappingId;
    }

    public void setDtdpspMappingId(Long dtdpspMappingId) {
        this.dtdpspMappingId = dtdpspMappingId;
    }

    public DTDPMapping getDtdpMapping() {
        return dtdpMapping;
    }

    public void setDtdpMapping(DTDPMapping dtdpMapping) {
        this.dtdpMapping = dtdpMapping;
    }

    public SubProcess getSubProcess() {
        return subProcess;
    }

    public void setSubProcess(SubProcess subProcess) {
        this.subProcess = subProcess;
    }

	public String getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	public LocalDateTime getCreatedOn() {
		return createdOn;
	}

	public String getModifiedBy() {
		return modifiedBy;
	}

	public void setModifiedBy(String modifiedBy) {
		this.modifiedBy = modifiedBy;
	}

	public LocalDateTime getModifiedOn() {
		return modifiedOn;
	}

	public boolean isEnabled() {
		return isEnabled;
	}

	public void setEnabled(boolean isEnabled) {
		this.isEnabled = isEnabled;
	}
}
