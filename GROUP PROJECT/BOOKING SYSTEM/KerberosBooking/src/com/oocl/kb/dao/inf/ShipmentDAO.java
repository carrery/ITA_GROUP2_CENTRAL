package com.oocl.kb.dao.inf;

import org.hibernate.SessionFactory;

public interface ShipmentDAO {
	public void setSessionFactory(SessionFactory sessionFactory);
	
	public void createBooking();

}
