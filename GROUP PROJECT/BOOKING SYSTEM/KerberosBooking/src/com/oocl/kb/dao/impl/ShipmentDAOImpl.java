package com.oocl.kb.dao.impl;

import java.sql.Date;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;

import com.oocl.kb.dao.inf.ShipmentDAO;
import com.oocl.kb.model.Shipment;
import com.oocl.kb.model.ShipmentCargo;
import com.oocl.kb.model.ShipmentContainer;
import com.oocl.kb.model.User;

public class ShipmentDAOImpl implements ShipmentDAO {

	@Autowired
	SessionFactory sessionFactory;
	Session session;
	Transaction tx;

	@Override
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	@Override
	public Long createBooking(String fromCity, String toCity, Date fromDate, Date toDate, String shipper,
			String consignee, int approveDoc, int validWt, int goodCustomer, String shipmentStatus) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.openSession();
		Transaction tx = null;

		tx = session.beginTransaction();
		Shipment newShp = new Shipment(fromCity, toCity, null, null, shipper, consignee, 0, 0, 0, shipmentStatus);
		Long shpNum = (Long) session.save(newShp);
		tx.commit();

		session.close();
		System.out.println("Booking Created");
		return shpNum;

	}

	@Override
	public void createShpContainer(ArrayList<ShipmentContainer> cntrList) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.openSession();
		Transaction tx = null;
		
		tx = session.beginTransaction();
		
		for(ShipmentContainer shpCntr: cntrList) {
			session.save(shpCntr);
		}
		
		tx.commit();
		session.close();
	}
	
	@Override
	public List<Shipment> getAllShipments (){
		Session session = sessionFactory.openSession();
		tx = session.beginTransaction();
		Query query = session.createQuery("FROM Shipment");
		tx.commit();
		List<Shipment> shipments  =query.list();
		session.close();
		return shipments;
	}

	@Override
	public void createShpCargo(ArrayList<ShipmentCargo> cgoList) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.openSession();
		Transaction tx = null;
		
		tx = session.beginTransaction();
		
		for(ShipmentCargo shpCgo: cgoList) {
			session.save(shpCgo);
		}
		
		tx.commit();
		session.close();
	}
	
}
