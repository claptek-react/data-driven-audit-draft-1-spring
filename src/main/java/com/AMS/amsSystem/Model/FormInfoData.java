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

	@Column(name="NAVIGATE")
	private String navigate;

	@Column(name ="BTN_VISIBILITY")
	private String btnVisibility;

	@Column (name="API_ID")
	private String apiId;

	@Column(name="ISREPORT")
	private String isReport;

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

	public String getNavigate() {
		return navigate;
	}

	public void setNavigate(String navigate) {
		this.navigate = navigate;
	}

	public String getBtnVisibility() {
		return btnVisibility;
	}

	public void setBtnVisibility(String btnVisibility) {
		this.btnVisibility = btnVisibility;
	}

	public String getApiId() {
		return apiId;
	}

	public void setApiId(String apiId) {
		this.apiId = apiId;
	}

	public String getIsReport() {
		return isReport;
	}

	public void setIsReport(String isReport) {
		this.isReport = isReport;
	}

	public FormInfoData(String formId, String formName, String formInfo, String navElementId, String navigate,
			String btnVisibility, String apiId, String isReport) {
		super();
		this.formId = formId;
		this.formName = formName;
		this.formInfo = formInfo;
		this.navElementId = navElementId;
		this.navigate = navigate;
		this.btnVisibility = btnVisibility;
		this.apiId = apiId;
		this.isReport = isReport;
	}

	public FormInfoData() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
