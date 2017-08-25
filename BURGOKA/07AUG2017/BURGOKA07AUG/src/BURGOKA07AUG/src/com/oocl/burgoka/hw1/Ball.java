package com.oocl.burgoka.hw1;

public class Ball {
		double weight;
		int position;
			
		Ball(double weight, int position){
			this.weight = weight;
			this.position = position;
		}
			
		double getWeight() {
			return weight;
		}
			
		void setWeight(double weight){
			this.weight = weight;
		}
			
		int getPosition(){
			return position;
		}
}
