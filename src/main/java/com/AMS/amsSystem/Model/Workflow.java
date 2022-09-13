package com.AMS.amsSystem.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name ="DD_WORKFLOW")
public class Workflow {
	
	@Id
	@Column(name ="WORKFLOW_ID")
	private String workflowId;
	
	@Column(name ="WORKFLOW_NAME")
	private String workflowName;
	
	@Column(name ="FORM_ID")
	private String formId;
	
	@Column(name ="PROCEDURE_NAME")
	private String procedureName;

	@Override
	public String toString() {
		return "Workflow [workflowId=" + workflowId + ", workflowName=" + workflowName + ", formId=" + formId
				+ ", procedureName=" + procedureName + "]";
	}

	public Workflow() {
		super();
	}

	public Workflow(String workflowId, String workflowName, String formId, String procedureName) {
		super();
		this.workflowId = workflowId;
		this.workflowName = workflowName;
		this.formId = formId;
		this.procedureName = procedureName;
	}

	public String getWorkflowId() {
		return workflowId;
	}

	public void setWorkflowId(String workflowId) {
		this.workflowId = workflowId;
	}

	public String getWorkflowName() {
		return workflowName;
	}

	public void setWorkflowName(String workflowName) {
		this.workflowName = workflowName;
	}

	public String getFormId() {
		return formId;
	}

	public void setFormId(String formId) {
		this.formId = formId;
	}

	public String getProcedureName() {
		return procedureName;
	}

	public void setProcedureName(String procedureName) {
		this.procedureName = procedureName;
	}

}
