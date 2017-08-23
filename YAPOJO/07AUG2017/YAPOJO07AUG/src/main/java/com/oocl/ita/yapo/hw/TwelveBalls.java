package com.oocl.ita.yapo.hw;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class TwelveBalls {
	
	public TwelveBalls() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		ArrayList<Integer> A = new ArrayList<Integer>();
		ArrayList<Integer> B = new ArrayList<Integer>();
		ArrayList<Integer> C = new ArrayList<Integer>();
		
		Random rand = new Random();
		
		int odd = rand.nextInt(12);
		int wieghtFlag = rand.nextInt(2);
//		int[] balls = new int[12];
	
		for (int i = 0; i < 12; i++) {
			if (i == odd) {
				if (wieghtFlag == 0) {
					if(i < 4) {
						A.add(-1);
					} else if (i>=4 && i<=7) {
						B.add(-1);
					} else if (i > 7) {
						C.add(-1);
					}
				} else {
					if(i < 4) {
						A.add(1);
					} else if (i>=4 && i<=7) {
						B.add(1);
					} else if (i > 7) {
						C.add(1);
					}
				}
			} else {
				if(i < 4) {
					A.add(0);
				} else if (i>=4 && i<=7) {
					B.add(0);
				} else if (i > 7) {
					C.add(0);
				}
			}
		} 
//		//lighter of A not working
//		A.add(1);
//		A.add(1);
//		A.add(1);
//		A.add(1);
//		//heavier of B not working
//		B.add(1);
//		B.add(1);
//		B.add(1);
//		B.add(1);
//		
//		C.add(1);
//		C.add(1);
//		C.add(1);
//		C.add(2);
		
		System.out.println("A: " + A.toString());
		System.out.println("B: " + B.toString());
		System.out.println("C: " + C.toString());
		
		int sumA = A.get(0).intValue() + A.get(1).intValue() + A.get(2).intValue() + A.get(3).intValue();
		int sumB = B.get(0).intValue() + B.get(1).intValue() + B.get(2).intValue() + B.get(3).intValue();
		int sumC = C.get(0).intValue() + C.get(1).intValue() + C.get(2).intValue() + C.get(3).intValue();
		
		if(sumA == sumB) {
			sumA = A.get(0).intValue() + A.get(1).intValue() + A.get(2).intValue(); 
			sumC = C.get(0).intValue() + C.get(1).intValue() + C.get(2).intValue();
			System.out.println("A group and B group is equal");
			System.out.println("C group has the odd ball");
			System.out.println("Remove A4 in A group and remove C4 in C group");
			System.out.println("Compare A1, A2, A3 and C1, C2, C3");
			if (sumA == sumC) {
				System.out.println("A group and C group are equal");
				System.out.println("C4 is the odd ball");
			} else if (sumC < sumA) {
				System.out.println("C group is lighter than A group");
				System.out.println("Either C1, C2, C3 is the odd (lighter) ball");
				System.out.println("Remove C3 in C group and compare C1 and C2");
				if (C.get(0).intValue() <  C.get(1).intValue()) {
					System.out.println("C1 is lighter than C2");
					System.out.println("C1 is the odd ball");
				} else if (C.get(0).intValue() >  C.get(1).intValue()) {
					System.out.println("C2 is lighter than C1");
					System.out.println("C2 is the odd ball");
				} else if (C.get(0).intValue() ==  C.get(1).intValue()) {
					System.out.println("C1 and C2 is equal");
					System.out.println("C3 is the odd ball");
				}
			} else if (sumC > sumA) {
				System.out.println("C group is heavier than A group");
				System.out.println("Either C1, C2, C3 is the odd (heavier) ball");
				System.out.println("Remove C3 in C group and compare C1 and C2");
				if (C.get(0).intValue() <  C.get(1).intValue()) {
					System.out.println("C2 is heavier than C1");
					System.out.println("C2 is the odd ball");
				} else if (C.get(0).intValue() >  C.get(1).intValue()) {
					System.out.println("C1 is heavier than C2");
					System.out.println("C1 is the odd ball");
				} else if (C.get(0).intValue() ==  C.get(1).intValue()) {
					System.out.println("C1 and C2 is equal");
					System.out.println("C3 is the odd ball");
				}
			}
		} else if(sumA > sumB) {
			System.out.println("A group is heavier than B group");
			System.out.println("Spread the B group, retain B1 and B2 then place with C1");
			System.out.println("Put B3 and B4 on the other side then place with A4");
			sumA = A.get(3).intValue() + B.get(2).intValue() + B.get(3).intValue(); 
			sumB = C.get(0).intValue() + B.get(0).intValue() + B.get(1).intValue();
			
			if (sumA > sumB) {
				System.out.println("B group with A4 is heavier than B group with C1");
				System.out.println("Either A4 is heavier (odd) or B1-B2 is lighter (odd)");
				System.out.println("Compare B1 and B2");
			
				if(B.get(0).intValue() > B.get(1).intValue()) {
					System.out.println("B2 is lighter than B1");
					System.out.println("B2 is the odd ball");
				} else if(B.get(0).intValue() < B.get(1).intValue()) {
					System.out.println("B1 is lighter than B2");
					System.out.println("B1 is the odd ball");
				} else if(B.get(0).intValue() == B.get(1).intValue()) {
					System.out.println("B1 and B2 is equal");
					System.out.println("A4 is the odd ball");
				}
			} else if (sumA < sumB) {
				System.out.println("B group with A4 is lighter than B group with C1");
				System.out.println("Either B3-B4 is lighter (odd)");
				System.out.println("Compare B3 and B4");
				
				if(B.get(2).intValue() > B.get(3).intValue()) {
					System.out.println("B3 is lighter than B4");
					System.out.println("B4 is the odd ball");
				} else if(B.get(2).intValue() < B.get(3).intValue()) {
					System.out.println("B4 is lighter than B3");
					System.out.println("B3 is the odd ball");
				}
			} else if (sumA == sumB) {
				System.out.println("B group with A4 is equal to B group with C1");
				System.out.println("Either A1, A2, A3 is the odd (heavier) ball");
				System.out.println("Remove A3 in A group and compare A1 and A2");
				if (A.get(0).intValue() <  A.get(1).intValue()) {
					System.out.println("A2 is heavier than A1");
					System.out.println("A2 is the odd ball");
				} else if (A.get(0).intValue() >  A.get(1).intValue()) {
					System.out.println("A1 is heavier than A2");
					System.out.println("A1 is the odd ball");
				} else if (A.get(0).intValue() ==  A.get(1).intValue()) {
					System.out.println("A1 and A2 is equal");
					System.out.println("A3 is the odd ball");
				}
			}
		} else if(sumA < sumB) {
			System.out.println("B group is heavier than A group");
			System.out.println("Spread the A group, retain A3 and A4 then place with C1");
			System.out.println("Put A1 and A2 on the other side then place with B4");
			sumA = C.get(0).intValue() + A.get(0).intValue() + A.get(1).intValue();
			sumB = B.get(3).intValue() + A.get(2).intValue() + A.get(3).intValue(); 
			
			if (sumA > sumB) {
				System.out.println("A group with C1 is heavier than A group with B4");
				System.out.println("Either A3-A4 is lighter (odd)");
				System.out.println("Compare A3 and A4");
				
				if(A.get(2).intValue() > A.get(3).intValue()) {
					System.out.println("A4 is lighter than A3");
					System.out.println("A4 is the odd ball");
				} else if(A.get(2).intValue() < A.get(3).intValue()) {
					System.out.println("A3 is lighter than A4");
					System.out.println("A3 is the odd ball");
				}
			} else if (sumA < sumB) {
				System.out.println("A group with C1 is lighter than A group with B4");
				System.out.println("Either B4 is heavier (odd) or A1-A2 is lighter (odd)");
				System.out.println("Compare A1 and A2");
			
				if(A.get(0).intValue() > A.get(1).intValue()) {
					System.out.println("A2 is lighter than A1");
					System.out.println("A2 is the odd ball");
				} else if(A.get(0).intValue() < A.get(1).intValue()) {
					System.out.println("A1 is lighter than A2");
					System.out.println("A1 is the odd ball");
				} else if(A.get(0).intValue() == A.get(1).intValue()) {
					System.out.println("A1 and A2 is equal");
					System.out.println("B4 is the odd all");
				}
			} else if (sumA == sumB) {
				System.out.println("A group with C1 is equal with A group with B4");
				System.out.println("Either B1, B2, B3 is the odd (heavier) ball");
				System.out.println("Remove B3 in B group and compare B1 and B2");
				if (B.get(0).intValue() <  B.get(1).intValue()) {
					System.out.println("B2 is heavier than B1");
					System.out.println("B2 is the odd ball");
				} else if (B.get(0).intValue() >  B.get(1).intValue()) {
					System.out.println("B1 is heavier than B2");
					System.out.println("B1 is the odd ball");
				} else if (B.get(0).intValue() ==  B.get(1).intValue()) {
					System.out.println("B1 and B2 is equal");
					System.out.println("B3 is the odd ball");
				}
			}
			
		}
		

		
	}

}
