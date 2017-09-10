package com.oocl.kb.dao.impl;

import java.sql.Date;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

import org.hibernate.Filter;
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
import com.oocl.kb.util.SearchShipmentCriteria;

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
	public Long createBooking(Shipment shp) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.openSession();
		Transaction tx = null;

		tx = session.beginTransaction();
		//Shipment newShp = new Shipment(fromCity, toCity, null, null, shipper, consignee, 0, 0, 0, shipmentStatus);
		Long shpNum = (Long) session.save(shp);
		tx.commit();

		session.close();
		System.out.println("Booking Created");
		return shpNum;

	}

	@Override
	public List<ShipmentContainer> getAllContainersByShipment(String shipmentNum) {

		// TODO Auto-generated method stub
		Session session = sessionFactory.openSession();
		tx = session.beginTransaction();
		Query query = session.createQuery("FROM ShipmentContainer WHERE shipmentNum LIKE ?");
		query.setParameter(0, "%" + shipmentNum + "%");
		tx.commit();
		List<ShipmentContainer> returnList = (ArrayList<ShipmentContainer>) query.list();
		session.close();

		return returnList;
	}

	@Override
	public String deleteContainer(ShipmentContainer container) {
		// TODO Auto-generated method stub
		try {
			Session session = sessionFactory.openSession();
			tx = session.beginTransaction();
			session.delete(container);
			tx.commit();
			session.close();
			return "Success";
		} catch (Exception e) {
			return "Fail";
		}
	}

	@Override
	public List<ShipmentCargo> getAllCargoByContainer(Long refNum) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.openSession();
		tx = session.beginTransaction();
		Query query = session.createQuery("FROM ShipmentCargo WHERE refNum LIKE ?");
		query.setParameter(0, "%" + refNum + "%");
		tx.commit();
		List<ShipmentCargo> returnList = (ArrayList<ShipmentCargo>) query.list();
		session.close();

		return returnList;
	}

	@Override
	public void createShpContainer(ArrayList<ShipmentContainer> cntrList) {
		Transaction tx = null;

		tx = session.beginTransaction();

		for (ShipmentContainer shpCntr : cntrList) {
			session.save(shpCntr);
		}

		tx.commit();
		session.close();
	}

	@Override
	public List<Shipment> getAllShipments (String username, String role, SearchShipmentCriteria shpCriteria){
		 
		Session session = sessionFactory.openSession();
		Filter filter = null;
		if (!role.equals("Admin")) {
			filter = session.enableFilter(role);
			filter.setParameter("username", username);
		}
		if (!shpCriteria.equals(null)) {
			if(shpCriteria.getBkgNum() != null) {
				filter = session.enableFilter("searchByBkgNum");
				filter.setParameter("shipment_num", shpCriteria.getBkgNum());
			}
			if(shpCriteria.getFromCity() != null) {
				filter = session.enableFilter("searchByFromCity");
				filter.setParameter("from_city", shpCriteria.getFromCity());
			}
			if(shpCriteria.getToCity() != null) {
				filter = session.enableFilter("searchByToCity");
				filter.setParameter("to_city", shpCriteria.getToCity());
			}
			if(shpCriteria.getCntrNum() != null) {
				filter = session.enableFilter("searchByCntrNum");
				filter.setParameter("cntr_num", shpCriteria.getCntrNum());
			}
		}
		tx = session.beginTransaction();
		Query query = session.createQuery("FROM Shipment");
		tx.commit();
		List<Shipment> shipments = query.list();
		session.close();
		return shipments;
	}

	@Override
	public void createShpCargo(ArrayList<ShipmentCargo> cgoList) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.openSession();
		Transaction tx = null;

		tx = session.beginTransaction();

		for (ShipmentCargo shpCgo : cgoList) {
			session.save(shpCgo);
		}

		tx.commit();
		session.close();
	}

	@Override
	public String deleteCargo(ShipmentCargo cargo) {
		// TODO Auto-generated method stub
		try {
			Session session = sessionFactory.openSession();
			tx = session.beginTransaction();
			session.delete(cargo);
			tx.commit();
			session.close();
			return "Success";
		} catch (Exception e) {
			return "Fail";
		}
	}

	@Override
	public Shipment getShipmentById(String shpNum) {
		// TODO Auto-generated method stub
		Shipment shp = null;
		Session session = sessionFactory.openSession();
		tx = session.beginTransaction();
		Query query = session.createQuery("FROM User WHERE shpNum = ?");
		query.setParameter(0, shpNum);
		tx.commit();
		shp = (Shipment) query.uniqueResult();
		session.close();
		return shp;
	}

	@Override
	public String updateShipment(Shipment shp, String shpNum) {
		try {
			Session session = sessionFactory.openSession();
			tx = session.beginTransaction();
			session.update(shpNum, shp);
			tx.commit();
			session.close();
			return "Success";
		} catch (Exception e) {
			return "Fail";
		}
	}
	
	@Override
	public List<String> getShpNumByCntrNum(String cntrNum) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.openSession();
		tx = session.beginTransaction();
		Query query = session.createQuery("SELECT shipmentNum FROM ShipmentCargo WHERE cntrNum LIKE ?");
		query.setParameter(0, "%" + cntrNum + "%");
		tx.commit();
		List<String> returnList = (ArrayList<String>) query.list();
		session.close();

		return returnList;
	}

}
