package com.oocl.ita.gervajo.hw;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Balance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WeighingScale ws = new WeighingScale();
		//Scanner sc = new Scanner(System.in);

		ArrayList<Ball> ball = new ArrayList<Ball>();
		ArrayList<Ball> g1 = new ArrayList<Ball>();
		ArrayList<Ball> g2 = new ArrayList<Ball>();
		ArrayList<Ball> g3 = new ArrayList<Ball>();

		for (int i = 0; i < 12; i++) {
			ball.add(new Ball());
			ball.get(i).setId(i + 1);
			ball.get(i).setWeight(2);
		}
		
		int oddWeight =  new int[]{1,3}[new Random().nextInt(2)];
		
		int random = random(0, 11);
		ball.get(random).setWeight(oddWeight);

		g1.add(ball.get(0));
		g1.add(ball.get(1));
		g1.add(ball.get(2));
		g1.add(ball.get(3));

		g2.add(ball.get(4));
		g2.add(ball.get(5));
		g2.add(ball.get(6));
		g2.add(ball.get(7));

		g3.add(ball.get(8));
		g3.add(ball.get(9));
		g3.add(ball.get(10));
		g3.add(ball.get(11));

		ws.weigh(g1, g2, g3);
		
		System.out.println(random+1);
		System.out.println(ball.get(random).getWeight());

	}

	static int random(int min, int max) {
		int range = (max - min) + 1;
		return (int) (Math.random() * range) + min;
	}

}
