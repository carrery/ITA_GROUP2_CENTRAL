package com.oocl.ita.gervajo.hw;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Exer8 {
	public static void main(String[] args) {
		List<String> list1 = new ArrayList<String>();
		list1.add("a");
		list1.add("a");
		list1.add(null);
		list1.add(null);
		Set<String> hs = new HashSet<String>();
		hs.addAll(list1);
		list1.clear();
		list1.addAll(hs);
		
		for(String x : list1) {
			System.out.println(x);
		}
	}
}
