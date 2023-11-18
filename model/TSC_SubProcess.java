package com.team4.catalogbackend.model;
import java.sql.Time;
import org.springframework.beans.factory.annotation.Value;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
 
@Entity
public class TSC_SubProcess {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long TSC_SubProcessId;
	private String TSC_SubProcessName;
	@Value("${groupid:0}")
	private int groupId;
    private String createdBy;
    private Time createdOn;
    private String modifiedBy;
    private Time modifiedOn;
    private boolean isEnabled;
    
    @ManyToOne
    @JoinColumn(
        name = "dtdpspMapping_Id",
        nullable = false
    )
    private DTMapping dtmapping;
    
	public Long getTSC_SubProcessId() {
		return TSC_SubProcessId;
	}
	public void setTSC_SubProcessId(Long tSC_SubProcessId) {
		TSC_SubProcessId = tSC_SubProcessId;
	}
	public String getTSC_SubProcessName() {
		return TSC_SubProcessName;
	}
	public void setTSC_SubProcessName(String tSC_SubProcessName) {
		TSC_SubProcessName = tSC_SubProcessName;
	}
	public int getGroupId() {
		return groupId;
	}
	public void setGroupId(int groupId) {
		this.groupId = groupId;
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
	@Override
	public String toString() {
		return "TSC_SubProcess [TSC_SubProcessId=" + TSC_SubProcessId + ", TSC_SubProcessName=" + TSC_SubProcessName
				+ ", groupId=" + groupId + ", createdBy=" + createdBy + ", createdOn=" + createdOn + ", modifiedBy="
				+ modifiedBy + ", modifiedOn=" + modifiedOn + ", isEnabled=" + isEnabled + "]";
	}
    
    

}
