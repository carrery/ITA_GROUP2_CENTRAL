package com.oocl.testlogin.session;

import org.hibernate.SessionFactory;

public class NewSession {
	private SessionFactory factory;
	
	public NewSession() {
		
	}
	
	public SessionFactory newSessionFactory() {
		return this.factory;
	}
}
