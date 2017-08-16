package com.oocl.bituiga.hw1;

import java.util.ArrayList;
import java.util.List;

public class MainClass {
	
	
	
	public MainClass() {
		// TODO Auto-generated constructor stub
	}
	
	public static void main(String[] args) {
		List<Ball> originalBalls = new ArrayList<Ball>();
		List<Ball> baseBalls = new ArrayList<Ball>();
		List<Ball> diffBalls = new ArrayList<Ball>();
		List<Ball> heavyScale = new ArrayList<Ball>();
		List<Ball> temp = new ArrayList<Ball>();
		Scale wScale = new Scale();
		Ball oddBall = new Ball();
		
		
		int index = random(8,11);
		System.out.println("Original Set of Balls:");
		for(int i = 0; i < 12; i++) {
			if(i == index) originalBalls.add(new Ball(random(1,3)));
			else originalBalls.add(new Ball(2));
		}
		for(Ball bola : originalBalls) {
			System.out.print(bola.weight + "   ");
		}
		System.out.println("\n\n=======================\n\n\n");
		List<List<Ball>> subgroups = new ArrayList<List<Ball>>();
		
		subgroups.add((List<Ball>)originalBalls.subList(0, 4));		
		subgroups.add((List<Ball>)originalBalls.subList(4, 8));
		subgroups.add((List<Ball>)originalBalls.subList(8, 12));
		
		System.out.println("STEP 1 : \nDivide Balls into 3 groups:");
		for(List<Ball> subL : subgroups) {
			System.out.println("Group :");
			for(Ball bola : subL) {
				System.out.print(bola.weight + "   ");
			}
			System.out.println("\n");
		}
		System.out.println("\n=======================\n");
		System.out.println("========  Weigh 2 groups  ========");
		// Step 1
		heavyScale = wScale.weighScales(subgroups.get(0),subgroups.get(1));
		if(heavyScale == null && wScale.isEqual) {
			System.out.println("========  Groups are of equal weight  ========");
			diffBalls = subgroups.get(2).subList(0, 3);
			baseBalls = subgroups.get(0).subList(0, 3);
			
			for(Ball bola : baseBalls) {
				System.out.print(bola.weight + "   ");
			}
			System.out.print("\n");
			for(Ball bola : diffBalls) {
				System.out.print(bola.weight + "   ");
			}
			System.out.print("\n");
			heavyScale = wScale.weighScales(diffBalls,baseBalls);
			
			if(heavyScale == null && wScale.isEqual) {
				System.out.println("========  Groups are of equal weight  ========");
				oddBall = subgroups.get(2).get(3);
			}
			else {
				if(wScale.calculateWeight(diffBalls) > wScale.calculateWeight(baseBalls)) oddBall.label = "heavy";
				else oddBall.label = "light";
				
				if(diffBalls.get(0).weight == diffBalls.get(1).weight) {
					oddBall = diffBalls.get(2);
				}
				else if(diffBalls.get(0).weight  > diffBalls.get(1).weight && oddBall.label == "heavy") {					
					oddBall = diffBalls.get(0);
				}
				else {
					oddBall = diffBalls.get(1);
				}
			}
		}
		else {
			System.out.println("========  Groups are not of equal weight  ========");
		}
		
		System.out.println("Odd ball: " + oddBall.weight);
		
		
	}
	
	
	static int random(int min, int max)
	{
		boolean ctr = false;
	   int range = (max - min) + 1;     
	   int rand = 0;
	   do {
		   rand = (int)(Math.random() * range) + min;
		   if(rand%2 == 0) ctr = true;
		   else ctr = false;
	   }while(ctr);
	   return rand;
	}
}
