package com.oocl.kb.dao.inf;

import java.sql.Date;
import java.sql.Timestamp;
import java.text.ParseException;
import java.util.List;
import java.util.ArrayList;
import java.util.List;

import org.hibernate.SessionFactory;

import com.oocl.kb.model.Shipment;
import com.oocl.kb.model.ShipmentCargo;
import com.oocl.kb.model.ShipmentContainer;



public interface ShipmentDAO  {
	public void setSessionFactory(SessionFactory sessionFactory);
	
	public Long createBooking(Shipment shp);
	
	public List<ShipmentContainer> getAllContainersByShipment(String shpNum);
	
	public List<ShipmentCargo> getAllCargoByContainer(Long refNum);
	
	public String deleteContainer(ShipmentContainer container);
	
    public void createShpContainer(ArrayList<ShipmentContainer> cntrList, Date bookingDate);
    
    public void createShpCargo(ArrayList<ShipmentCargo> cgoList);

	public List<Shipment> getAllShipments(String username, String role);
  
	public String deleteCargo(ShipmentCargo cargo);
	
	public Shipment getShipmentById(String shpNum);

	public String updateShipment(Shipment shipment);

	public String getAvailableContainer(String cntrType, Date bookingDate);

	public Long getCgoidSeq();

	public Long getRefNumSeq();
}
