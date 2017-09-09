package com.oocl.kb.response;

public class UpdateUserResponse {

	public String errorMesssage;
	public int isUpdateSuccess;
	public String getErrorMesssage() {
		return errorMesssage;
	}
	public void setErrorMesssage(String errorMesssage) {
		this.errorMesssage = errorMesssage;
	}
	public int getIsUpdateSuccess() {
		return isUpdateSuccess;
	}
	public void setIsUpdateSuccess(int isUpdateSuccess) {
		this.isUpdateSuccess = isUpdateSuccess;
	}
}
