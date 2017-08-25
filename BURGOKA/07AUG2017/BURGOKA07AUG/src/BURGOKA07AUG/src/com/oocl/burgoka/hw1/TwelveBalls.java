package com.oocl.burgoka.hw1;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class TwelveBalls {
	
	private Ball[] initializeBalls(int numBalls){
		Ball[] balls = new Ball[numBalls];
		int [] num;
		
		System.out.print("Balls are: ");
		for(int j = 0; j < balls.length; j++) {
			balls[j] = new Ball(0.02, j);
			System.out.print(balls[j].position + "\t");
		}
		System.out.println();
		
		int [][] ba = new int[numBalls][3];
			
		int numChunks = (int)Math.ceil(ba.length / 3);
		int [][] out = new int [numChunks][];
			
		for (int h = 0 ; h < numChunks ; ++h) {
			int start = h * 3;
			int length = Math.min(ba.length - start, 3);
				
			int [] temp = new int[length];
			//System.arraycopy(ba, start, temp, 0, length);
			out[h] = temp;
		}
			
		return balls;
	}

	
	private int compareBalls(Ball[] left, Ball[] mid, Ball[] right){
		if(left.length != right.length||mid.length != right.length) System.out.println("Balls unequal to both side");
			double leftWeight = 0.0;
			
			for(int j = 0; j < left.length; j++) leftWeight += left[j].getWeight();
				double rightWeight = 0.0;
				for(int k = 0; k < right.length; k++) rightWeight += right[k].getWeight();
					double midWeight = 0.0;
					
				for(int q = 0; q < mid.length; q++) midWeight += mid[q].getWeight();
					if(leftWeight < rightWeight) return 1;
					else if (leftWeight > rightWeight) return -1;
					else return 0;
	}
	
	private void searchMessage(Ball[] balls){
		if (balls.length >= 1){
			System.out.println("searching from " + balls[0].getPosition()+ " to " + balls[balls.length - 1].getPosition());
		} else System.out.println("searching empty array");
		
	}
	
	private int findOddBall(Ball[] balls){
		if(balls.length == 0) return -1; 
		else if(balls.length == 1) return balls[0].getPosition();
		else {
			boolean oddNumBalls = balls.length % 3 == 1;
			int mid = balls.length/3;
			int mid2 = balls.length*2/3;
			
			Ball[] leftSide = Arrays.copyOfRange(balls, 0, mid);
			Ball[] midSide = Arrays.copyOfRange(balls, mid, mid2);
			Ball[] rightSide = Arrays.copyOfRange(balls, mid2, balls.length);
		
		       int result = compareBalls(leftSide, midSide, rightSide);
		       if(result == 1) {
		    	   searchMessage(leftSide);
		    	   return findOddBall(leftSide);
		       }
		       else if(result == -1){
		    	   searchMessage(rightSide);
		    	   return findOddBall(rightSide);
		       }
		       else if (result == 0){
		           searchMessage(midSide);
		           return findOddBall(midSide);
		       }
		       else if(oddNumBalls) return balls[balls.length-1].getPosition();
		       		else return -1; 
		
		       }
		
		    }
	
	public static void main(String[] args) {
		int numBall;
		TwelveBalls fc = new TwelveBalls();
		Scanner in = new Scanner(System.in);
		System.out.print("Please input number of balls: ");
		numBall = in.nextInt();
		Ball[] balls = fc.initializeBalls(numBall);
		int oddBallPosition = fc.findOddBall(balls);
		System.out.println("The odd ball is at: " + oddBallPosition);

	}
}
