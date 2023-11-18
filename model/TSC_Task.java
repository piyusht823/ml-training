

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
	public class TSC_Task{

	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long TSC_TaskId;
	    private String TSC_TaskName;
		@Value("${groupid:0}")
		private int groupId; 
	    private String createdBy;
	    private Time createdOn;
	    private String modifiedBy;
	    private Time modifiedOn;
	    private boolean isEnabled;
	    

		@ManyToOne
		    @JoinColumn(name = "dtdpstmap_id", nullable = false)
		    private DTDPSPTMapping dtdpstmapping;


		public Long getTSC_TaskId() {
			return TSC_TaskId;
		}


		public void setTSC_TaskId(Long tSC_TaskId) {
			TSC_TaskId = tSC_TaskId;
		}


		public String getTSC_TaskName() {
			return TSC_TaskName;
		}


		public void setTSC_TaskName(String tSC_TaskName) {
			TSC_TaskName = tSC_TaskName;
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


		public DTDPSPTMapping getDtdpstmapping() {
			return dtdpstmapping;
		}


		public void setDtdpstmapping(DTDPSPTMapping dtdpstmapping) {
			this.dtdpstmapping = dtdpstmapping;
		}


		@Override
		public String toString() {
			return "TSC_Task [TSC_TaskId=" + TSC_TaskId + ", TSC_TaskName=" + TSC_TaskName + ", groupId=" + groupId
					+ ", createdBy=" + createdBy + ", createdOn=" + createdOn + ", modifiedBy=" + modifiedBy
					+ ", modifiedOn=" + modifiedOn + ", isEnabled=" + isEnabled + ", dtdpstmapping=" + dtdpstmapping
					+ "]";
		}
		
		
		
}
