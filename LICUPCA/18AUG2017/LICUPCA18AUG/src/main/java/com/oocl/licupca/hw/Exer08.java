package com.oocl.licupca.hw;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Set;

public class Exer08 {
	public static void main(String[] args) {
		ArrayList<String> stringList = new ArrayList<>();
		stringList.add("ea");
		stringList.add("ea");
		stringList.add("éà");
		stringList.add("éà");
		stringList.add(null);
		stringList.add(null);
		stringList.add("今天");
		stringList.add("今天");
		
		System.out.println("Before removing: " + stringList);
		Set<String> s = new LinkedHashSet<>(stringList);
		stringList = new ArrayList<>(s);
		
		System.out.println("After removing: " + stringList);
	}
}
