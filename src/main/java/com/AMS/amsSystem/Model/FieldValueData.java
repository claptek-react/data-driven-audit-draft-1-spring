package com.AMS.amsSystem.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name ="DD_FIELD_VALUE")
public class FieldValueData {
	
	@Id
	@Column(name ="FIELD_VALUE_ID")
	private String id;

	
	@Column(name ="FORM_ID")
	private String formId;
	
	@Column(name ="FORM_NAME")
	private String formName;
	
	@Column(name="FIELD_STORED_VALUE")
	private String fieldStoredValue;
	
	@Column(name ="FIELD_OPTIONS")
	private String fieldOptions;
	
	@Column(name ="FIELD_ID")
	private int field_id;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

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

	public String getFieldStoredValue() {
		return fieldStoredValue;
	}

	public void setFieldStoredValue(String fieldStoredValue) {
		this.fieldStoredValue = fieldStoredValue;
	}

	public String getFieldOptions() {
		return fieldOptions;
	}

	public void setFieldOptions(String fieldOptions) {
		this.fieldOptions = fieldOptions;
	}

	public int getField_id() {
		return field_id;
	}

	public void setField_id(int field_id) {
		this.field_id = field_id;
	}

	public FieldValueData(String id, String formId, String formName, String fieldStoredValue, String fieldOptions,
			int field_id) {
		super();
		this.id = id;
		this.formId = formId;
		this.formName = formName;
		this.fieldStoredValue = fieldStoredValue;
		this.fieldOptions = fieldOptions;
		this.field_id = field_id;
	}

	public FieldValueData() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	
	
	

}
