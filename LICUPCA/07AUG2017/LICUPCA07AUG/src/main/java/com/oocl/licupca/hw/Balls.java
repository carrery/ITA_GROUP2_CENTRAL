package com.oocl.licupca.hw;

import java.util.ArrayList;
import java.util.Random;

public class Balls<T extends Ball> {
	public ArrayList<T> Balls = new ArrayList<>();
	public int oddBall = (int)(Math.random() * 12) + 1;
	public int oddBallWeight = new int[]{1,3}[new Random().nextInt(2)];
	
	@SuppressWarnings("unchecked")
	public Balls() {
		for(int i = 1; i <= 12; i++) {
			if (i == oddBall) {
				this.Balls.add((T) new Ball(i, oddBallWeight));
			}
			else {
				this.Balls.add((T) new Ball(i, 2));
			}
		}
	}
	
	@SuppressWarnings("unchecked")
	public Balls(int oddBall, int weight) {
		this.oddBall = oddBall;
		this.oddBallWeight = weight;
		for(int i = 1; i <= 12; i++) {
			if (i == oddBall) {
				this.Balls.add((T) new Ball(i, oddBallWeight));
			}
			else {
				this.Balls.add((T) new Ball(i, 2));
			}
		}
	}
	
	public T getBall(int id) {
		for (T ball : this.Balls) {
			if(ball.id == id)
				return ball;
		}
		return null;
		
	}
	
	public int getOddBall() {
		return this.oddBall;
	}

}
