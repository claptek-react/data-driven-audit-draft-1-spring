package com.AMS.amsSystem.Model;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="DD_EVENT_ASSIGNMENTS")
public class EventAssignmentData {
	
	@Id
	@Column(name="ASSIGN_ID")
	private String assignId;
	
	@Column(name="FORM_ID")
	private String formId;
	
	@Column(name="OBJ_ID")
	private String objId;
	
	@Column(name="ASSIGN_NAME")
	private String assignName;
	
	@Column(name="CREATED_ON")
	private Date createdOn;
	
	@Column(name="CREATED_BY")
	private String createdBy;
	
	@Column(name="DUE_BY")
	private String dueBy;
	
	@Column(name="MODIFIED_ON")
	private Date modifiedOn;
	
	@Column(name="PROCESS_INSTANCE_ID")
	private String pId;
	
	@Column(name="INSTANCE_ID")
	private String instanceId;
	
	@Column(name="STAGE")
	private String stage;
	
	@Column(name="STATUS")
	private String status;
	
	@Column(name="USER_ID")
	private String userId;
	
	@Column(name="INIT_BY")
	private String initBy;

	public String getAssignId() {
		return assignId;
	}

	public void setAssignId(String assignId) {
		this.assignId = assignId;
	}

	public String getFormId() {
		return formId;
	}

	public void setFormId(String formId) {
		this.formId = formId;
	}

	public String getObjId() {
		return objId;
	}

	public void setObjId(String objId) {
		this.objId = objId;
	}

	public String getAssignName() {
		return assignName;
	}

	public void setAssignName(String assignName) {
		this.assignName = assignName;
	}

	public Date getCreatedOn() {
		return createdOn;
	}

	public void setCreatedOn(Date createdOn) {
		this.createdOn = createdOn;
	}

	public String getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	public String getDueBy() {
		return dueBy;
	}

	public void setDueBy(String dueBy) {
		this.dueBy = dueBy;
	}

	public Date getModifiedOn() {
		return modifiedOn;
	}

	public void setModifiedOn(Date modifiedOn) {
		this.modifiedOn = modifiedOn;
	}

	public String getpId() {
		return pId;
	}

	public void setpId(String pId) {
		this.pId = pId;
	}

	public String getInstanceId() {
		return instanceId;
	}

	public void setInstanceId(String instanceId) {
		this.instanceId = instanceId;
	}

	public String getStage() {
		return stage;
	}

	public void setStage(String stage) {
		this.stage = stage;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getInitBy() {
		return initBy;
	}

	public void setInitBy(String initBy) {
		this.initBy = initBy;
	}

	public EventAssignmentData(String assignId, String formId, String objId, String assignName, Date createdOn,
			String createdBy, String dueBy, Date modifiedOn, String pId, String instanceId, String stage, String status,
			String userId, String initBy) {
		super();
		this.assignId = assignId;
		this.formId = formId;
		this.objId = objId;
		this.assignName = assignName;
		this.createdOn = createdOn;
		this.createdBy = createdBy;
		this.dueBy = dueBy;
		this.modifiedOn = modifiedOn;
		this.pId = pId;
		this.instanceId = instanceId;
		this.stage = stage;
		this.status = status;
		this.userId = userId;
		this.initBy = initBy;
	}

	public EventAssignmentData() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "EventAssignmentData [assignId=" + assignId + ", formId=" + formId + ", objId=" + objId + ", assignName="
				+ assignName + ", createdOn=" + createdOn + ", createdBy=" + createdBy + ", dueBy=" + dueBy
				+ ", modifiedOn=" + modifiedOn + ", pId=" + pId + ", instanceId=" + instanceId + ", stage=" + stage
				+ ", status=" + status + ", userId=" + userId + ", initBy=" + initBy + "]";
	}
	

}
