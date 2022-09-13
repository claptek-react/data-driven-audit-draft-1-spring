package com.AMS.amsSystem.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name ="DD_FORM_INFO")
public class FormInfoData {
	
	@Id
	@Column(name="FORM_ID")
	private String formId;
	
	@Column(name="FORM_NAME")
	private String formName;
	
	@Column(name="FORM_INFO")
	private String formInfo;
	
	@Column(name="NAV_ELEMENT_ID")
	private String navElementId;

	public String getFormId() {
		return formId;
	}

	public void setFormId(String formId) {
		this.formId = formId;
	}

	public String getFormName() {
		return formName;
	}

	public void setFormName(String formName) {
		this.formName = formName;
	}

	public String getFormInfo() {
		return formInfo;
	}

	public void setFormInfo(String formInfo) {
		this.formInfo = formInfo;
	}

	public String getNavElementId() {
		return navElementId;
	}

	public void setNavElementId(String navElementId) {
		this.navElementId = navElementId;
	}

	public FormInfoData(String formId, String formName, String formInfo, String navElementId) {
		super();
		this.formId = formId;
		this.formName = formName;
		this.formInfo = formInfo;
		this.navElementId = navElementId;
	}

	public FormInfoData() {
		super();
		// TODO Auto-generated constructor stub
	}

	

}
