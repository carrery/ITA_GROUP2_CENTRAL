package com.oocl.ita.gervajo.sw.generics;

import java.util.ArrayList;

public class HolderClass {
	
	public HolderClass() {
		ArrayList<GenericClass> list = new ArrayList<GenericClass>();
		
		GenericClass A = new GenericClass("A");
		GenericClass B = new GenericClass("B");
		GenericClass C = new GenericClass("C");
		String D = new String("D");
		
		list.add(A);
		list.add(B);
		list.add(C);
		//list.add(D);
		
		System.out.println("Output:");
		
		for(GenericClass gc : list ) {
			System.out.println(gc.getName());
		}
	}

	public static void main(String[] args) {
		
		HolderClass hc = new HolderClass();
		
	}

}
