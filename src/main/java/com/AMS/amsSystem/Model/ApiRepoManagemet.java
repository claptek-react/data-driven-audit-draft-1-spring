package com.AMS.amsSystem.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="DD_API_REPO_MANAGEMENT")
public class ApiRepoManagemet {
	
	@Id
	@Column(name="API_ID")
	private String apiId;
	
	@Column(name="OBJECT_NAME")
	private String objectName;
	
	@Column(name ="OBJECT_TYPE")
	private String objectType;
	
	@Column(name="OBJECT_ID")
	private String objectId;
	
	@Column(name="API")
	private String api;
	
	@Column (name="OBJECT_API_MAPPING")
	private String objectApiMapping;

	public String getApiId() {
		return apiId;
	}

	public void setApiId(String apiId) {
		this.apiId = apiId;
	}

	public String getObjectName() {
		return objectName;
	}

	public void setObjectName(String objectName) {
		this.objectName = objectName;
	}

	public String getObjectType() {
		return objectType;
	}

	public void setObjectType(String objectType) {
		this.objectType = objectType;
	}

	public String getObjectId() {
		return objectId;
	}

	public void setObjectId(String objectId) {
		this.objectId = objectId;
	}

	public String getApi() {
		return api;
	}

	public void setApi(String api) {
		this.api = api;
	}

	public String getObjectApiMapping() {
		return objectApiMapping;
	}

	public void setObjectApiMapping(String objectApiMapping) {
		this.objectApiMapping = objectApiMapping;
	}

	public ApiRepoManagemet(String apiId, String objectName, String objectType, String objectId, String api,
			String objectApiMapping) {
		super();
		this.apiId = apiId;
		this.objectName = objectName;
		this.objectType = objectType;
		this.objectId = objectId;
		this.api = api;
		this.objectApiMapping = objectApiMapping;
	}

	public ApiRepoManagemet() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	
	
	

}
