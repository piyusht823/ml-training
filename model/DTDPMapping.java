package com.team4.catalogbackend.model;


import java.sql.Time;

import org.hibernate.annotations.CreationTimestamp;

//import com.team4.catalogbackend.model.Process;

import jakarta.persistence.*;

@Entity
public class DTDPMapping {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long dtdpMappingId;

    @ManyToOne
    @JoinColumn(name = "dtd_mapping_id")
    private DTDMapping dtdMapping;

    @ManyToOne
    @JoinColumn(name = "process_id")
    private Process process;
    
    private String createdBy;
    
    @CreationTimestamp
    private Time createdOn;
    private String modifiedBy;
    @CreationTimestamp
    private Time modifiedOn;
    private boolean isEnabled;

    // Getters and setters

    public DTDPMapping(DTDMapping dtdMapping, Process process) {
		// TODO Auto-generated constructor stub
    	this.dtdMapping = dtdMapping;
    	this.process = process;
    	this.createdBy = "Priyanka";
    	this.modifiedBy = null;
    	this.isEnabled = true;
	}
    
    public DTDPMapping() {}

	public Long getDtdpMappingId() {
        return dtdpMappingId;
    }

    public void setDtdpMappingId(Long dtdpMappingId) {
        this.dtdpMappingId = dtdpMappingId;
    }

    public DTDMapping getDtdMapping() {
        return dtdMapping;
    }

    public void setDtdMapping(DTDMapping dtdMapping) {
        this.dtdMapping = dtdMapping;
    }

    public Process getProcess() {
        return process;
    }

    public void setProcess(Process process) {
        this.process = process;
    }

	public String getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	public Time getCreatedOn() {
		return createdOn;
	}

	public void setCreatedOn(Time createdOn) {
		this.createdOn = createdOn;
	}

	public String getModifiedBy() {
		return modifiedBy;
	}

	public void setModifiedBy(String modifiedBy) {
		this.modifiedBy = modifiedBy;
	}

	public Time getModifiedOn() {
		return modifiedOn;
	}

	public void setModifiedOn(Time modifiedOn) {
		this.modifiedOn = modifiedOn;
	}

	public boolean isEnabled() {
		return isEnabled;
	}

	public void setEnabled(boolean isEnabled) {
		this.isEnabled = isEnabled;
	}
    
}
