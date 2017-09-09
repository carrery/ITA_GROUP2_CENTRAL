package com.oocl.kb.response;

public class ServiceResponse {
	
	public String errorMessage;
	public String serviceResult;

	public String getErrorMessage() {
		return errorMessage;
	}

	public String getServiceResult() {
		return serviceResult;
	}

	public void setServiceResult(String serviceResult) {
		this.serviceResult = serviceResult;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}

}
