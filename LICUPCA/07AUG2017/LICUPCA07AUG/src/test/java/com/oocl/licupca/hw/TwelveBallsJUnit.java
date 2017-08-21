package com.oocl.licupca.hw;

import static org.junit.Assert.*;
import java.util.ArrayList;
import java.util.Arrays;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class TwelveBallsJUnit {
	
	static Balls<Ball> balls = new Balls<>();
	int result = oddBallFinder(balls);

	@Test
	public void deffective1() {
		assertEquals(1, result);
	}
	@Test
	public void deffective2() {
		assertEquals(2, result);
	}
	@Test
	public void deffective3() {
		assertEquals(3, result);
	}
	@Test
	public void deffective4() {
		assertEquals(4, result);
	}
	@Test
	public void deffective5() {
		assertEquals(5, result);
	}
	@Test
	public void deffective6() {
		assertEquals(6, result);
	}
	@Test
	public void deffective7() {
		assertEquals(7, result);
	}
	@Test
	public void deffective8() {
		assertEquals(8, result);
	}
	@Test
	public void deffective9() {
		assertEquals(9, result);
	}
	@Test
	public void deffective10() {
		assertEquals(10, result);
	}
	@Test
	public void deffective11() {
		assertEquals(11, result);
	}
	@Test
	public void deffective12() {
		assertEquals(12, result);
	}
	
	
	public int oddBallFinder(Balls<Ball> balls) {
//		balls = this.balls;
		WeighingScale scale = new WeighingScale();
		ArrayList<Ball> sideA = new ArrayList<>();
		ArrayList<Ball> sideB = new ArrayList<>();
		sideA = new ArrayList<>(Arrays.asList(
				balls.getBall(1), balls.getBall(2), balls.getBall(3), balls.getBall(4)));
		sideB = new ArrayList<Ball>(Arrays.asList(
				balls.getBall(5), balls.getBall(6), balls.getBall(7), balls.getBall(8)));
		if (scale.weigh(sideA, sideB) > 0) {
			sideA = new ArrayList<>(Arrays.asList(
					balls.getBall(4), balls.getBall(7), balls.getBall(8)));
			sideB = new ArrayList<>(Arrays.asList(
					balls.getBall(5), balls.getBall(6), balls.getBall(9)));
			if(scale.weigh(sideA, sideB) > 0) {
				sideA = new ArrayList<>(Arrays.asList(
						balls.getBall(5)));
				sideB = new ArrayList<>(Arrays.asList(
						balls.getBall(6)));
				if (scale.weigh(sideA, sideB) < 0) {
					System.out.println("Oddball is 5");
					return 5;
				}
				else if (scale.weigh(sideA, sideB) > 0) {
					System.out.println("Oddball is 6");
					return 6;
				}
				else {
					System.out.println("Oddball is 4");
					return 4;
				}
			}
			else if (scale.weigh(sideA, sideB) < 0) {
				sideA = new ArrayList<>(Arrays.asList(
						balls.getBall(7)));
				sideB = new ArrayList<>(Arrays.asList(
						balls.getBall(8)));
				if (scale.weigh(sideA, sideB) < 0) {
					System.out.println("Oddball is 7");
					return 7;
				}
				else if (scale.weigh(sideA, sideB) > 0) {
					System.out.println("Oddball is 8");
					return 8;
				}
			}
			else {
				sideA = new ArrayList<>(Arrays.asList(
						balls.getBall(1)));
				sideB = new ArrayList<>(Arrays.asList(
						balls.getBall(2)));
				if (scale.weigh(sideA, sideB) > 0) {
					System.out.println("Oddball is 1");
					return 1;
				}
				else if (scale.weigh(sideA, sideB) < 0) {
					System.out.println("Oddball is 2");
					return 2;
				}
				else {
					System.out.println("Oddball is 3");
					return 3;
				}
			}
		}
		else if (scale.weigh(sideA, sideB) < 0) {
			sideA = new ArrayList<>(Arrays.asList(
					balls.getBall(4), balls.getBall(7), balls.getBall(8)));
			sideB = new ArrayList<>(Arrays.asList(
					balls.getBall(5), balls.getBall(6), balls.getBall(9)));
			if(scale.weigh(sideA, sideB) < 0) {
				sideA = new ArrayList<>(Arrays.asList(
						balls.getBall(5)));
				sideB = new ArrayList<>(Arrays.asList(
						balls.getBall(6)));
				if (scale.weigh(sideA, sideB) > 0) {
					System.out.println("Oddball is 5");
					return 5;
				}
				else if (scale.weigh(sideA, sideB) < 0) {
					System.out.println("Oddball is 6");
					return 6;
				}
				else {
					System.out.println("Oddball is 4");
					return 4;
				}
			}
			else if (scale.weigh(sideA, sideB) > 0) {
				sideA = new ArrayList<>(Arrays.asList(
						balls.getBall(7)));
				sideB = new ArrayList<>(Arrays.asList(
						balls.getBall(8)));
				if (scale.weigh(sideA, sideB) > 0) {
					System.out.println("Oddball is 7");
					return 7;
				}
				else if (scale.weigh(sideA, sideB) < 0) {
					System.out.println("Oddball is 8");
					return 8;
				}
			}
			else {
				sideA = new ArrayList<>(Arrays.asList(
						balls.getBall(1)));
				sideB = new ArrayList<>(Arrays.asList(
						balls.getBall(2)));
				if (scale.weigh(sideA, sideB) < 0) {
					System.out.println("Oddball is 1");
					return 1;
				}
				else if (scale.weigh(sideA, sideB) > 0) {
					System.out.println("Oddball is 2");
					return 2;
				}
				else {
					System.out.println("Oddball is 3");
					return 3;
				}
			}
		}
		else  {
			sideA = new ArrayList<>(Arrays.asList(
					balls.getBall(9), balls.getBall(10), balls.getBall(11)));
			sideB = new ArrayList<>(Arrays.asList(
					balls.getBall(1), balls.getBall(2), balls.getBall(3)));
			if(scale.weigh(sideA, sideB) < 0) {
				sideA = new ArrayList<>(Arrays.asList(
						balls.getBall(9)));
				sideB = new ArrayList<>(Arrays.asList(
						balls.getBall(10)));
				if (scale.weigh(sideA, sideB) < 0) {
					System.out.println("Oddball is 9");
					return 9;
				}
				else if (scale.weigh(sideA, sideB) > 0) {
					System.out.println("Oddball is 10");
					return 10;
				}
				else {
					System.out.println("Oddball is 11");
					return 11;
				}
			}
			else if (scale.weigh(sideA, sideB) > 0) {
				sideA = new ArrayList<>(Arrays.asList(
						balls.getBall(9)));
				sideB = new ArrayList<>(Arrays.asList(
						balls.getBall(10)));
				if (scale.weigh(sideA, sideB) > 0) {
					System.out.println("Oddball is 9");
					return 9;
				}
				else if (scale.weigh(sideA, sideB) < 0) {
					System.out.println("Oddball is 10");
					return 10;
				}
				else {
					System.out.println("Oddball is 11");
					return 11;
				}
			}
			else {
				sideA = new ArrayList<>(Arrays.asList(
						balls.getBall(1)));
				sideB = new ArrayList<>(Arrays.asList(
						balls.getBall(12)));
				if (scale.weigh(sideA, sideB) < 0) {
					System.out.println("Oddball is 12");
					return 12;
				}
				else if (scale.weigh(sideA, sideB) > 0) {
					System.out.println("Oddball is 12");
					return 12;
				}
			}
		}
		return 0;
	}
	
}
