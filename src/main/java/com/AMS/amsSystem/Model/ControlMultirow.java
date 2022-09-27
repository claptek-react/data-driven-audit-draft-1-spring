package com.AMS.amsSystem.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="DD_GRC_CONTROL_ABC")
public class ControlMultirow {

	
	@Id 
    @GeneratedValue (strategy = GenerationType.IDENTITY)
	@Column(name="MU_ABC_KEY")
    private int muABCKey;
	
	@Column(name="OBJ_ID")
	private String objId;
	
	@Column(name="MU_FIELD")
	private String field;
	
	@Column(name="MU_FIELD_VALUE")
	private String fieldValue;

	public int getMuABCKey() {
		return muABCKey;
	}

	public void setMuABCKey(int muABCKey) {
		this.muABCKey = muABCKey;
	}

	public String getObjId() {
		return objId;
	}

	public void setObjId(String objId) {
		this.objId = objId;
	}

	public String getField() {
		return field;
	}

	public void setField(String field) {
		this.field = field;
	}

	public String getFieldValue() {
		return fieldValue;
	}

	public void setFieldValue(String fieldValue) {
		this.fieldValue = fieldValue;
	}

	public ControlMultirow(int muABCKey, String objId, String field, String fieldValue) {
		super();
		this.muABCKey = muABCKey;
		this.objId = objId;
		this.field = field;
		this.fieldValue = fieldValue;
	}

	public ControlMultirow() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "ControlMultirow [muABCKey=" + muABCKey + ", objId=" + objId + ", field=" + field + ", fieldValue="
				+ fieldValue + ", getMuABCKey()=" + getMuABCKey() + ", getObjId()=" + getObjId() + ", getField()="
				+ getField() + ", getFieldValue()=" + getFieldValue() + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + ", toString()=" + super.toString() + "]";
	}
	
	
	

}
