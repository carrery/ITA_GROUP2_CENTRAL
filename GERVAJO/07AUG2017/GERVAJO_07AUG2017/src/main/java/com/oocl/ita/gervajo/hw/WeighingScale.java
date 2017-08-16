package com.oocl.ita.gervajo.hw;

import java.util.ArrayList;

public class WeighingScale {

	int counter = 3;

	public int getWeight(ArrayList<Ball> list) {
		int weight = 0;
		for (int i = 0; i < list.size(); i++) {
			weight = weight + list.get(i).getWeight();
		}
		return weight;
	}

	public void clear(int weight) {
		weight = 0;
	}

	public void weigh(ArrayList<Ball> A, ArrayList<Ball> B, ArrayList<Ball> C) {
		int weightA = 0, weightB = 0, weightC = 0;
		weightA = getWeight(A);
		weightB = getWeight(B);
		weightC = getWeight(C);

		ArrayList<Ball> g1 = new ArrayList<Ball>();
		ArrayList<Ball> g2 = new ArrayList<Ball>();
		g1.add(A.get(3));
		g1.add(B.get(2));
		g1.add(B.get(3));
		g2.add(B.get(0));
		g2.add(B.get(1));
		g2.add(C.get(0));
		int wg1 = getWeight(g1);
		int wg2 = getWeight(g2);

		if (weightA > weightB) {
			System.out.println("Side A went down");

			if (wg1 > wg2) {
				if (g2.get(0).getWeight() == g2.get(1).getWeight()) {
					System.out.println("Odd ball is A4 (Heavier)");
				} else if (g2.get(0).getWeight() < g2.get(1).getWeight()) {
					System.out.println("Odd ball is B1 (Lighter)");
				} else if (g2.get(0).getWeight() > g2.get(1).getWeight()) {
					System.out.println("Odd ball is B2 (Lighter)");
				}
			} else if (wg1 < wg2) {
				if (g1.get(1).getWeight() > g1.get(2).getWeight()) {
					System.out.println("Odd ball is B4 (Lighter)");
				} else if (g1.get(1).getWeight() < g1.get(2).getWeight()) {
					System.out.println("Odd ball is B3 (Lighter)");
				}
			} else if (wg1 == wg2) {
				if (A.get(0).getWeight() == A.get(1).getWeight()) {
					System.out.println("Odd ball is A3 (Heavier)");
				} else if (A.get(0).getWeight() > A.get(1).getWeight()) {
					System.out.println("Odd ball is A1 (Heavier)");
				} else if (A.get(0).getWeight() < A.get(1).getWeight()) {
					System.out.println("Odd ball is A2 (Heavier)");
				}
			}
		} else if (weightA < weightB) {
			System.out.println("Side B went down");
			if (wg1 < wg2) {
				if (g2.get(0).getWeight() == g2.get(1).getWeight()) {
					System.out.println("Odd ball is A4 (Lighter)");
				} else if (g2.get(0).getWeight() > g2.get(1).getWeight()) {
					System.out.println("Odd ball is B1 (Heavier)");
				} else if (g2.get(0).getWeight() < g2.get(1).getWeight()) {
					System.out.println("Odd ball is B2 (Heavier)");
				}
			} else if (wg1 > wg2) {
				if (g1.get(1).getWeight() < g1.get(2).getWeight()) {
					System.out.println("Odd ball is B4 (Heavier)");
				} else if (g1.get(1).getWeight() > g1.get(2).getWeight()) {
					System.out.println("Odd ball is B3 (Heavier)");
				}
			} else if (wg1 == wg2) {
				if (A.get(0).getWeight() == A.get(1).getWeight()) {
					System.out.println("Odd ball is A3 (Lighter)");
				} else if (A.get(0).getWeight() < A.get(1).getWeight()) {
					System.out.println("Odd ball is A1 (Lighter)");
				} else if (A.get(0).getWeight() > A.get(1).getWeight()) {
					System.out.println("Odd ball is A2 (Lighter)");
				}
			}
		} else if (weightA == weightB) { // case1
			System.out.println("Side A and B are equal");
			System.out.println("Odd ball might in Group C");
			Ball c4 = C.get(3);
			Ball a4 = A.get(3);
			C.remove(3);
			A.remove(3);
			weightA = 0;
			weightA = getWeight(A);
			weightC = getWeight(C);
			if (weightA == weightC) {
				if (a4.getWeight() > c4.getWeight()) {
					System.out.println("Odd ball is C4 (Lighter)");
				} else if (a4.getWeight() < c4.getWeight()) {
					System.out.println("Odd ball is C4 (Heavier)");
				}
			} else if (weightA < weightC) {
				C.remove(2);
				A.remove(2);
				weightA = 0;
				weightA = getWeight(A);
				weightC = getWeight(C);
				if (C.get(0).getWeight() == C.get(1).getWeight()) {
					System.out.println("Odd ball is C3 (Heavier)");
				} else if (C.get(0).getWeight() < C.get(1).getWeight()) {
					System.out.println("Odd ball is C2 (Heavier)");
				} else {
					System.out.println("Odd ball is C1 (Heavier)");
				}
			} else if (weightA > weightC) {
				C.remove(2);
				A.remove(2);
				weightA = 0;
				weightA = getWeight(A);
				weightC = getWeight(C);
				if (C.get(0).getWeight() == C.get(1).getWeight()) {
					System.out.println("Odd ball is C3 (Lighter)");
				} else if (C.get(0).getWeight() > C.get(1).getWeight()) {
					System.out.println("Odd ball is C2 (Lighter)");
				} else {
					System.out.println("Odd ball is C1 (Lighter)");
				}
			}
		}

	}

}
