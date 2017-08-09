package ita.group2.assignment.aug7;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BallProcess {
	static Map<String,Ball> map = new HashMap<String,Ball>();
	static WeighingScale ws = new WeighingScale();
	
	static List<Ball> a = new ArrayList<Ball>();
	static List<Ball> b = new ArrayList<Ball>();
	static List<Ball> c = new ArrayList<Ball>();
	
	static List<Ball> x = new ArrayList<Ball>();
	static List<Ball> y = new ArrayList<Ball>();
	
	static Ball oddBall;

	public static void main(String[] args) {
		int first,second,third;
		boolean isHeavier=false;
		
		int ballNum = 12;
		int wsUsage = 3;
		int quotient = ballNum/wsUsage;
		String groupLetter = null, ballName=null;
		
		for(int i=0;i<wsUsage;i++) {
			switch(i) {
			case 0: groupLetter="A";break;
			case 1: groupLetter="B";break;
			case 2: groupLetter="C";break;
			case 3: groupLetter="D";break;
			}
			for(int j=0;j<quotient;j++) {
				ballName=groupLetter+String.valueOf(j+1);
				Ball ball = new Ball(ballName,5);
				map.put(ball.getName(),ball);
			}
		}

		Ball ball = map.get("A4");
		ball.setWeight(1);
	
		a = groupBalls(4,"A1","A2","A3","A4");
		b = groupBalls(4,"B1","B2","B3","B4");
		c = groupBalls(4,"C1","C2","C3","C4");
		
		first=ws.getWeightResult(a, b);
		
		if(first==0) { //odd ball is in group C
			x=groupBalls(3,"A1","A2","A3",null);
			y=groupBalls(3,"C1","C2","C3",null);
			second=ws.getWeightResult(x, y);
			if(second==0) { //odd ball is C4, compare to any other ball to determine if heavier or lighter		
				x=groupBalls(1,"A1",null,null,null);
				y=groupBalls(1,"C4",null,null,null);
				third=ws.getWeightResult(x, y);
				if(third==1) {
					isHeavier=true;
					oddBall=map.get("C4");
				}else if(third==-1) {
					isHeavier=false;
					oddBall=map.get("C4");
				}else {
					System.out.println("All Balls are equal");
				}
			}else {
				x=groupBalls(1,"C1",null,null,null);
				y=groupBalls(1,"C2",null,null,null);
				if(second==1) {
					isHeavier=true;
				}else {
					isHeavier=false;
				}
				third=ws.getWeightResult(x, y);
				if(third==0) {
					oddBall=map.get("C3");
				}else {
					if(third==1) {
						if(second==1) {
							oddBall=map.get("C2");
						}else {
							oddBall=map.get("C1");
						}
					}else {
						if(second==1) {
							oddBall=map.get("C1");
						}else {
							oddBall=map.get("C2");
						}
					}
				}
			}
		}else if(first==-1){ //one of the ball in group A is heavier or one of the ball in group B is lighter
			x=groupBalls(3,"A4","B3","B4",null);
			y=groupBalls(3,"B1","B2","C1",null);
			second=ws.getWeightResult(x, y);
			if(second==0) {
				isHeavier=true;
				x=groupBalls(1,"A1",null,null,null);
				y=groupBalls(1,"A2",null,null,null);
				third=ws.getWeightResult(x, y);
				if(third==0) {
					oddBall=map.get("A3");
				}else if(third==1) {
					oddBall=map.get("A2");
				}else if(third==-1){
					oddBall=map.get("A1");
				}
			}else if(second==-1) {
				x=groupBalls(1,"B1",null,null,null);
				y=groupBalls(1,"B2",null,null,null);
				third=ws.getWeightResult(x, y);
				if(third==0) {
					isHeavier=true;
					oddBall=map.get("A4");
				}else if(third==1){
					oddBall=map.get("B1");
				}else if(third==-1) {
					oddBall=map.get("B2");
				}
			}else if(second==1) {
				x=groupBalls(1,"B3",null,null,null);
				y=groupBalls(1,"B4",null,null,null);
				third=ws.getWeightResult(x, y);
				if(third==1){
					oddBall=map.get("B3");
				}else if(third==-1) {
					oddBall=map.get("B4");
				}
			}
		}else if(first==1){
			x=groupBalls(3,"A4","B3","B4",null);
			y=groupBalls(3,"B1","B2","C1",null);
			
			x=groupBalls(3,"B4","A3","A4",null);
			y=groupBalls(3,"A1","A2","C1",null);
			second=ws.getWeightResult(x, y);
			if(second==0) {
				isHeavier=true;
				x=groupBalls(1,"B1",null,null,null);
				y=groupBalls(1,"B2",null,null,null);
				third=ws.getWeightResult(x, y);
				if(third==0) {
					oddBall=map.get("B3");
				}else if(third==1) {
					oddBall=map.get("B2");
				}else if(third==-1){
					oddBall=map.get("B1");
				}
			}else if(second==-1) {
				x=groupBalls(1,"A1",null,null,null);
				y=groupBalls(1,"A2",null,null,null);
				third=ws.getWeightResult(x, y);
				if(third==0) {
					isHeavier=true;
					oddBall=map.get("B4");
				}else if(third==1){
					oddBall=map.get("A1");
				}else if(third==-1) {
					oddBall=map.get("A2");
				}
			}else if(second==1) {
				x=groupBalls(1,"A3",null,null,null);
				y=groupBalls(1,"A4",null,null,null);
				third=ws.getWeightResult(x, y);
				if(third==1){
					oddBall=map.get("A3");
				}else if(third==-1) {
					oddBall=map.get("A4");
				}
			}
		}
		if(oddBall!=null) {
			System.out.println(oddBall.getName() + weight(isHeavier));
		}
	}

	public static List<Ball> groupBalls(int numGroup, String a, String b, String c, String d) {
		List<Ball> group = new ArrayList<Ball>();
		
		switch(numGroup) {
		case 4:
			group.add(map.get(a));
			group.add(map.get(b));
			group.add(map.get(c));
			group.add(map.get(d));
			break;
		case 3:
			group.add(map.get(a));
			group.add(map.get(b));
			group.add(map.get(c));
			break;
		case 2:
			group.add(map.get(a));
			group.add(map.get(b));
			break;
		case 1:
			group.add(map.get(a));
			break;		
		}
		
		return group;
	}
	
	public static String weight(boolean isHeavier) {
		if(isHeavier) {
			return " is the heavier odd Ball";
		}else {
			return " is the lighter odd Ball";
		}
	}
}
