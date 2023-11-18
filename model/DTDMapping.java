package com.team4.catalogbackend.model;

import java.sql.Time;
import java.time.LocalDateTime;

import org.hibernate.annotations.CreationTimestamp;

//import com.team4.catalogbackend.model.Deliverables;

import jakarta.persistence.*;

@Entity
public class DTDMapping {

	 @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long dtdMappingId;

	    @ManyToOne
	    @JoinColumn(name = "dt_mapping_id")
	    private DTMapping dtMapping;

	    @ManyToOne
	    @JoinColumn(name = "deliverables_id")
	    private Deliverables deliverables;
	    
	    private String createdBy;
	    @CreationTimestamp
	    private LocalDateTime createdOn;
	    
	    private String modifiedBy;
		@CreationTimestamp
	    private LocalDateTime modifiedOn;
	    
	    private boolean isEnabled;

	    public DTDMapping(DTMapping dtMapping, Deliverables deliverables) {
			super();
			this.dtMapping = dtMapping;
			this.deliverables = deliverables;
			this.createdBy = "Piyush";
			this.modifiedBy = null;
			this.isEnabled = true;
		}
    // Getters and setters
	    public DTDMapping() {
			
		}
	public Long getDtdMappingId() {
        return dtdMappingId;
    }

    public void setDtdMappingId(Long dtdMappingId) {
        this.dtdMappingId = dtdMappingId;
    }

    public DTMapping getDtMapping() {
        return dtMapping;
    }

    public void setDtMapping(DTMapping dtMapping) {
        this.dtMapping = dtMapping;
    }

    public Deliverables getDeliverables() {
        return deliverables;
    }

    public void setDeliverables(Deliverables deliverables) {
        this.deliverables = deliverables;
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
