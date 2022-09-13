package com.AMS.amsSystem.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name ="DD_FIELDS")
public class FieldsData {
	
	

	@Id
	@Column(name="SR_NO")
	private int srId;
	
	@Column(name = "FORM_ID")
	private String formId;
	
	@Column(name ="FIELD_ID")
	private String fieldID;
	
	@Column(name= "FORM_NAME")
	private String formName;

	@Column(name="FIELD_LABLE_VALUE")
	private String fieldLableValue;
	
	@Column(name="FIELD_STOREd_VALUE")
	private String fieldStoreValue;
	
	@Column(name="FIELD_TYPE")
	private String fieldType;
	
	@Column(name ="FIELD_CATEGORY")
	private String fieldCategory;
	
	@Column(name ="IS_SELECT")
	private String isSelect;

	public int getSrId() {
		return srId;
	}

	public void setSrId(int srId) {
		this.srId = srId;
	}

	public String getFormId() {
		return formId;
	}

	public void setFormId(String formId) {
		this.formId = formId;
	}

	public String getFieldID() {
		return fieldID;
	}

	public void setFieldID(String fieldID) {
		this.fieldID = fieldID;
	}

	public String getFormName() {
		return formName;
	}

	public void setFormName(String formName) {
		this.formName = formName;
	}

	public String getFieldLableValue() {
		return fieldLableValue;
	}

	public void setFieldLableValue(String fieldLableValue) {
		this.fieldLableValue = fieldLableValue;
	}

	public String getFieldStoreValue() {
		return fieldStoreValue;
	}

	public void setFieldStoreValue(String fieldStoreValue) {
		this.fieldStoreValue = fieldStoreValue;
	}

	public String getFieldType() {
		return fieldType;
	}

	public void setFieldType(String fieldType) {
		this.fieldType = fieldType;
	}

	public String getFieldCategory() {
		return fieldCategory;
	}

	public void setFieldCategory(String fieldCategory) {
		this.fieldCategory = fieldCategory;
	}

	public String getIsSelect() {
		return isSelect;
	}

	public void setIsSelect(String isSelect) {
		this.isSelect = isSelect;
	}

	public FieldsData(int srId, String formId, String fieldID, String formName, String fieldLableValue,
			String fieldStoreValue, String fieldType, String fieldCategory, String isSelect) {
		super();
		this.srId = srId;
		this.formId = formId;
		this.fieldID = fieldID;
		this.formName = formName;
		this.fieldLableValue = fieldLableValue;
		this.fieldStoreValue = fieldStoreValue;
		this.fieldType = fieldType;
		this.fieldCategory = fieldCategory;
		this.isSelect = isSelect;
	}

	public FieldsData() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	
		
	
}

	