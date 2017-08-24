package com.oocl.ita.yapojo.sw;

import java.util.ArrayList;
import java.util.List;

public class holderClass {

	public holderClass() {
		// TODO Auto-generated constructor stub
		List<genericClass> generics = new ArrayList<genericClass>();
		
		genericClass A = new genericClass("A");
		genericClass B = new genericClass("B");
		genericClass C = new genericClass("C");
		
		generics.add(A);
		generics.add(B);
		generics.add(C);
		
		System.out.println("Output:");
		for (genericClass g : generics) {
			System.out.println(g.getName());
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		holderClass holder = new holderClass();
	}

}
