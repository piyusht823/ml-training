package com.team4.catalogbackend.model;

import jakarta.persistence.*;

import java.sql.Time;
import java.util.List;

@Entity
public class SubProcess {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long subProcessId;

    private String subProcessName;
    private String createdBy;
    private Time createdOn;
    private String modifiedBy;
    private Time modifiedOn;
    private boolean isEnabled;

//    @ManyToOne
//    @JoinColumn(name = "process_id")
//    private Process process;
//
//    @OneToMany(mappedBy = "subProcess")
//    private List<Task> tasks;

    // Getters and setters

    public Long getSubProcessId() {
        return subProcessId;
    }

    public void setSubProcessId(Long subProcessId) {
        this.subProcessId = subProcessId;
    }

    public String getSubProcessName() {
        return subProcessName;
    }

    public void setSubProcessName(String subProcessName) {
        this.subProcessName = subProcessName;
    }

//    public Process getProcess() {
//        return process;
//    }
//
//    public void setProcess(Process process) {
//        this.process = process;
//    }
//
//    public List<Task> getTasks() {
//        return tasks;
//    }
//
//    public void setTasks(List<Task> tasks) {
//        this.tasks = tasks;
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
		return "SubProcess [subProcessId=" + subProcessId + ", subProcessName=" + subProcessName + ", createdBy="
				+ createdBy + ", createdOn=" + createdOn + ", modifiedBy=" + modifiedBy + ", modifiedOn=" + modifiedOn
				+ ", isEnabled=" + isEnabled + ", getSubProcessId()=" + getSubProcessId() + ", getSubProcessName()="
				+ getSubProcessName() + ", getCreatedBy()=" + getCreatedBy() + ", getCreatedOn()=" + getCreatedOn()
				+ ", getModifiedBy()=" + getModifiedBy() + ", getModifiedOn()=" + getModifiedOn() + ", isEnabled()="
				+ isEnabled() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}
}
