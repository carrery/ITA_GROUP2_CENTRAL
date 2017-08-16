package com.oocl.exam;

public class Exam {
	public Exam() {
		
	}
	static int value = 10;
	public String getQuest(int i) {
		String ret = "";
		switch(i) {
		case 1:
			ret = getAnsQ1();
			break;
		case 2:
			ret = getAnsQ2();
			break;
		case 3:
			ret = getAnsQ3();
			break;
		case 4:
			ret = getAnsQ4();
			break;
		case 5:
			ret = getAnsQ5();
			break;
		case 6:
			ret = getAnsQ6();
			break;
		case 7:
			value = 10;
			ret = getAnsQ7();
			break;
		case 8:
			ret = getAnsQ8();
			break;
		case 9:
			ret = getAnsQ9();
			break;
		case 10:
			ret = getAnsQ10();
			break;
		}
		
		return ret;
	}
	
	public String getAnsQ1() {
		
		String expectedRes = "";
		
		int i=1;
		for (int j=0; j<5;j=j+2)
		{
		i= (i*i) +j;
		}
		switch (i)
		{
		case 3:
			expectedRes += "zero";
		break;
		case 13:
			expectedRes += "one";
		case 175:
			expectedRes += "two";
		default:
			expectedRes += "default";
		}
		
		return expectedRes;
	} 
	
	public String getAnsQ2() {
		int n;
		int F_0=1,F_1=1;
		int F_n=0;
//		System.out.println ("Enter the number");
		n=5;
		for (int i=1; i<n; i++)
		{
		F_n=F_0+F_1;
		F_0=F_1;
		F_1=F_n;
		}
		return  String.valueOf(F_n);
	}
	
	public String getAnsQ3() {
		int inner=2, outer=2;
		int result=0;
		for (int i=0; i<outer; i++)
		{
		for (int j=0; j<inner; j++)
		{
		result = (result*result)+1;
		}
		}
		
		return String.valueOf(result);
	}
	
	public String getAnsQ4() {
		int ctr = 0;
		int x = 3;
		int y = 10;
		while (x < y)
		{
			ctr ++;
		x = x + 1;
		y = y - 1;
		}
		
		return String.valueOf(ctr);
	}
	
	public String getAnsQ5() {
		// Declare Local Variables 
		int integer_value = 60;
		boolean done = false; int count = 1; int current = integer_value + 2;
		while (! done) { current = current / count; if (current % 3 == 0) done = true; else if (current < 1) done = true; else count += 1;  }
		
		return String.valueOf(count);
	}
	
	public String getAnsQ6() {
		String ret = "";
		double count;
		int limit;
		count = 9.0;
		limit = 43/4;
		for (; count <= limit; count = count + 0.5)
		{
			ret += "in for:" + count;
		}
		ret +="after for" + count;
		
		return String.valueOf(count);
	}
	
	public String getAnsQ7() {
		String ret = "";
		ret +="Main before p1: " + value;
		value = p1(value);
		ret +="Main before p2: " + value;
		value = p2(value);
		ret +="Main at the end: " + value;
		ret +="-----";
		int value = 30;
		ret +="Main before p1: " + value;
		value = p1(value);
		ret +="Main before p2: " + value;
		value = p2(value);
		ret +="Main at the end: " + value;
		
		return ret;
		
	}
	static int p1(int input)
	{
	value = input * value;
//	System.out.println("In p1: " + value);
	return value;
	}
	static int p2(int input)
	{
	int value = 5;
	value = input / value;
//	System.out.println("In p2: " + value);
	return value;
	}
	
	public String getAnsQ8() {
		String ret = "";
		int value = 5;
		int value2 = 1;
		while (value2 < 4)
		{
		for (;value >= value2; value--)
		{
			ret +="*";
		}
		value2++;
		}
		
		return ret;
	} 
	
	public String getAnsQ9() {
		boolean a,b,c;
		String ret = "";
		a = true;
		b = false;
		c = false;
		ret += a + ", " + b + ", " + c;
		do
		{
		if (b == c)
		b = a;
		else if (a == c)
		b = c;
		else
		a = c;
		ret += a + ", " + b + ", " + c;
		}
		while ( a || b || c);
		
		return ret;
	}
	
	public String getAnsQ10() {
		String ret = "";
		int one = 1;
		int two = 2;
		int three = 3;
		do
		{
		one++;
		ret +="cart";
		}
		while ( one < 3);
		for (int i = 0; i < two; i++)
		{
			ret +="o";
		}
		while (true)
		{
		three++;
		if (three == 5)
		{
		break;
		}
		ret +="n";
		}
		return ret;
	}
	
}
