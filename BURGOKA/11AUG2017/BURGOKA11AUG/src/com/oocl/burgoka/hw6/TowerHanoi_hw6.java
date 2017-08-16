package com.oocl.burgoka.hw6;

import java.util.ArrayList;
import java.util.Scanner;

public class TowerHanoi_hw6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> str = new ArrayList<String>();
//		str.add("A");
//		str.add("B");
//		str.add("C");
		
		TowersClass towersOfHanoi = new TowersClass();
	    System.out.print("Number of discs: 3 (A, B, C) ");
	    towersOfHanoi.arrange(3, "A", "B", "C");
	}

}
