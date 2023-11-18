
	package com.team4.catalogbackend.model;

	import java.sql.Time;

	import org.springframework.beans.factory.annotation.Value;

	import jakarta.persistence.Entity;
	import jakarta.persistence.GeneratedValue;
	import jakarta.persistence.GenerationType;
	import jakarta.persistence.Id;
	import jakarta.persistence.JoinColumn;
	import jakarta.persistence.ManyToOne;

	@Entity
	public class TSC_Process {

	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long TSC_ProcessId;
	    private String TSC_ProcessName;
		@Value("${groupid:0}")
		private int groupId; 
	    private String createdBy;
	    private Time createdOn;
	    private String modifiedBy;
	    private Time modifiedOn;
	    private boolean isEnabled;
	    

		@ManyToOne
		    @JoinColumn(name = "dtdpmap_id", nullable = false)
		    private DTDPMapping dtdpmapping;


		public Long getTSC_ProcessId() {
			return TSC_ProcessId;
		}


		public void setTSC_ProcessId(Long tSC_ProcessId) {
			TSC_ProcessId = tSC_ProcessId;
		}


		public String getTSC_ProcessName() {
			return TSC_ProcessName;
		}


		public void setTSC_ProcessName(String tSC_ProcessName) {
			TSC_ProcessName = tSC_ProcessName;
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


		public DTDPMapping getDtdpmapping() {
			return dtdpmapping;
		}


		public void setDtdpmapping(DTDPMapping dtdpmapping) {
			this.dtdpmapping = dtdpmapping;
		}


		@Override
		public String toString() {
			return "TSC_Process [TSC_ProcessId=" + TSC_ProcessId + ", TSC_ProcessName=" + TSC_ProcessName + ", groupId="
					+ groupId + ", createdBy=" + createdBy + ", createdOn=" + createdOn + ", modifiedBy=" + modifiedBy
					+ ", modifiedOn=" + modifiedOn + ", isEnabled=" + isEnabled + ", dtdpmapping=" + dtdpmapping + "]";
		}
	    
}
