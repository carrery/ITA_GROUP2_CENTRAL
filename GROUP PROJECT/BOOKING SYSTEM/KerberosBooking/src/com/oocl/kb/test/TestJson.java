package com.oocl.kb.test;

import java.util.ArrayList;
import java.util.List;

import org.json.JSONArray;
import org.json.JSONObject;
import org.json.JSONString;

import com.oocl.kb.model.ShipmentContainer;

public class TestJson {
	
	public static void main(String[] args) {
		JSONObject obj = new JSONObject("{shp_container :[{cntr_num:OOLU123456, ref_num:1000001}, {cntr_num:OOLU123457, ref_num:1000000}], shp_num:1234123412 }")  ;

		List<ShipmentContainer> list = new ArrayList<ShipmentContainer>();
		JSONArray array = obj.getJSONArray("shp_container");
		for(int i = 0 ; i < array.length() ; i++){
			ShipmentContainer sc = new ShipmentContainer(null, null, null, null, null);
			sc.setCntrNum(array.getJSONObject(i).getString("cntr_num"));
			sc.setRefNum(array.getJSONObject(i).getLong("ref_num"));
		    list.add(sc);
		}
		
		Long shp_num = obj.getLong("shp_num");
		
		System.out.println(list.get(1).getCntrNum());
		System.out.println(shp_num);
	}

}
