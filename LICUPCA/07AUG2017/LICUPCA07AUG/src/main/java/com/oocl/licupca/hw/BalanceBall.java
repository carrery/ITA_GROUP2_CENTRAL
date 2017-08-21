package com.oocl.licupca.hw;

import java.util.ArrayList;
import java.util.Scanner;

public class BalanceBall {

	public static void main(String[] args) {
		Balls<Ball> balls = new Balls<>();
//		Balls<Ball> balls = new Balls<>(4);
		for (int i = 1; i <= 3; i++) {
			System.out.println(
					"\n----------------------------------------------------------------------\nChance " + i + "\n----------------------------------------------------------------------\n");
			weigh(balls);
		}
		finalAnswer(balls);

	}

	public static void weigh(Balls<Ball> balls) {
		ArrayList<Ball> sideA = new ArrayList<>();
		ArrayList<Ball> sideB = new ArrayList<>();
		WeighingScale scale = new WeighingScale();
		int n;
		System.out.print("How many balls will you put on each side? ");
		Scanner s = new Scanner(System.in);
		n = s.nextInt();
		System.out.println("----------------------------------------------------------------------\nSide A\n----------------------------------------------------------------------\n");
		for (int i = 1; i <= n; i++) {
			System.out.println("Ball " + i + " for side A: ");
			s = new Scanner(System.in);
			Ball ball = balls.getBall(s.nextInt());
			if (!sideA.contains(ball) && !ball.equals(null)) {
				sideA.add(ball);
			} else if (ball.equals(null)) {
				i--;
				System.out.println("No such ball!");
			} else {
				i--;
				System.out.println("Ball already in!");
			}
		}
		System.out.println("----------------------------------------------------------------------\nSide B\n----------------------------------------------------------------------\n");
		for (int i = 1; i <= n; i++) {
			System.out.println("Ball " + i + " for side B: ");
			s = new Scanner(System.in);
			Ball ball = balls.getBall(s.nextInt());
			if (!sideA.contains(ball) && !sideB.contains(ball) && !ball.equals(null)) {
				sideB.add(ball);
			} else if (ball.equals(null)) {
				i--;
				System.out.println("No such ball!");
			} else {
				i--;
				System.out.println("Ball already in!");
			}
		}
		scale.weigh(sideA, sideB);
		return;

	}

	@SuppressWarnings("resource")
	public static void finalAnswer(Balls<Ball> balls) {
		System.out.println("Which ball is the odd ball? ");
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		if (n == balls.getOddBall()) {
			System.out.println("**********************************************************************\nYour answer is correct! ");
		} else {
			System.out.println("**********************************************************************\nWrong answer. Odd ball is " + balls.getOddBall());
		}
	}

}
