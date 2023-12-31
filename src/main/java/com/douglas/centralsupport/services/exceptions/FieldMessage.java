package com.douglas.centralsupport.services.exceptions;

import java.io.Serializable;

public class FieldMessage implements Serializable {
	private static final long serialVersionUID = 1L;

	private String fieldName;
	private String messagem;

	public FieldMessage() {
		super();
	}

	public FieldMessage(String fieldName, String messagem) {
		super();
		this.fieldName = fieldName;
		this.messagem = messagem;
	}

	public String getFieldName() {
		return fieldName;
	}

	public void setFieldName(String fieldName) {
		this.fieldName = fieldName;
	}

	public String getMessagem() {
		return messagem;
	}

	public void setMessagem(String messagem) {
		this.messagem = messagem;
	}

}
