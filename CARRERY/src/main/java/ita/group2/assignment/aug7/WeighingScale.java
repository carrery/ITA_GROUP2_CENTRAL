package ita.group2.assignment.aug7;

import java.util.List;

public class WeighingScale {
	public int getWeightResult(List<Ball> a, List<Ball> b) {
		int totalA=0,totalB=0;
		for(Ball ball:a) {
			totalA=totalA+ball.getWeight();
		}
		for(Ball ball:b) {
			totalB=totalB+ball.getWeight();
		}
		
		if(totalA==totalB) {
			return 0;
		}else {
			if(totalA>totalB) {
				return -1;
			}else {
				return 1;
			}
		}
	}
}
