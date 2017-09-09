package com.oocl.kb.test;

import java.util.ArrayList;
import java.util.List;

import org.json.JSONArray;
import org.json.JSONObject;

import com.oocl.kb.model.ShipmentContainer;

public class TestJson {
	
	public static void main(String[] args) {
		JSONObject obj = new JSONObject("{shp_container :[{cntr_num:OOLU123456, ref_num:REF1000}, {cntr_num:OOLU123457, ref_num:REF1000}] }") ;

		List<ShipmentContainer> list = new ArrayList<ShipmentContainer>();
		JSONArray array = obj.getJSONArray("shp_container");
		for(int i = 0 ; i < array.length() ; i++){
			ShipmentContainer sc = new ShipmentContainer(null, null, null, null, null);
			sc.setCntrNum(array.getJSONObject(i).getString("cntr_num"));
			sc.setRefNum(Long.parseLong(array.getJSONObject(i).getString("ref_num")));
		    list.add(sc);
		}
		
		System.out.println(list.get(1).getCntrNum());
	}

}
