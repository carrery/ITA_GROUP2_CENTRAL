package com.oocl.licupca.hw;

import java.util.ArrayList;

public class WeighingScale {

	public WeighingScale() {
		
	}
	
	public int weigh(ArrayList<Ball> sideA, ArrayList<Ball> sideB) {
		int sideAWeight = 0, sideBWeight = 0;
		String sideABalls = "", sideBBalls = "";
		for(int i = 0; i < sideA.size(); i++) {
			sideAWeight += sideA.get(i).weight;
			sideABalls += sideA.get(i).id +" ";
			sideBWeight += sideB.get(i).weight;
			sideBBalls += sideB.get(i).id +" ";
		}
		System.out.println("======================================================================");
		if (sideAWeight > sideBWeight) {
			System.out.println("Side A ( " + sideABalls +") is heavier than Side B ( " + sideBBalls +")");
			System.out.println("======================================================================");
			return 1;
		}
		else if (sideAWeight < sideBWeight) {
			System.out.println("Side A ( " + sideABalls +") is lighter than Side B ( " + sideBBalls +")");
			System.out.println("======================================================================");
			return -1;
		}
		System.out.println("Side A ( " + sideABalls +") weight is equal to Side B ( " + sideBBalls +")");
		System.out.println("======================================================================");
		return 0;
		
		
	}

}
