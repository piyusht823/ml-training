package com.team4.catalogbackend.model;

import jakarta.persistence.*;

import java.sql.Time;
import java.util.List;

@Entity
public class Process {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long processId;

    private String processName;
    private String createdBy;
    private Time createdOn;
    private String modifiedBy;
    private Time modifiedOn;
    private boolean isEnabled;

//    @ManyToOne
//    @JoinColumn(name = "deliverables_id")
//    private Deliverables deliverables;
//
//    @OneToMany(mappedBy = "process")
//    private List<SubProcess> subProcesses;

    // Getters and setters

    public Long getProcessId() {
        return processId;
    }

    public void setProcessId(Long processId) {
        this.processId = processId;
    }

    public String getProcessName() {
        return processName;
    }

    public void setProcessName(String processName) {
        this.processName = processName;
    }

//    public Deliverables getDeliverables() {
//        return deliverables;
//    }
//
//    public void setDeliverables(Deliverables deliverables) {
//        this.deliverables = deliverables;
//    }
//
//    public List<SubProcess> getSubProcesses() {
//        return subProcesses;
//    }
//
//    public void setSubProcesses(List<SubProcess> subProcesses) {
//        this.subProcesses = subProcesses;
//    }

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

	@Override
	public String toString() {
		return "Process [processId=" + processId + ", processName=" + processName + ", createdBy=" + createdBy
				+ ", createdOn=" + createdOn + ", modifiedBy=" + modifiedBy + ", modifiedOn=" + modifiedOn
				+ ", isEnabled=" + isEnabled + "]";
	}
}
