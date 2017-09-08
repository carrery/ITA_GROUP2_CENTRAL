package com.oocl.kb.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "ROLES")
public class Role {
	@Id
	@Column(name = "ROLE")
	private String role;
	
	@Column(name = "ACCESS_CB")
	private int accessCB;
	
	@Column(name = "ACCESS_FS")
	private int accessFS;
	
	@Column(name = "ACCESS_UM")
	private int accessUM;
	
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public int getAccessCB() {
		return accessCB;
	}
	public void setAccessCB(int accessCB) {
		this.accessCB = accessCB;
	}
	public int getAccessFS() {
		return accessFS;
	}
	public void setAccessFS(int accessFS) {
		this.accessFS = accessFS;
	}
	public int getAccessUM() {
		return accessUM;
	}
	public void setAccessUM(int accessUM) {
		this.accessUM = accessUM;
	}
	
	
}
