package com.oocl.ita.gervajo.sw.test;

import static org.junit.Assert.*;

import org.junit.Test;

//import com.oocl.ita.TestFunctions;
import com.oocl.ita.gervajo.sw.functional.MathFunctions;

public class TestMavenJUnit {
	
	MathFunctions mf = new MathFunctions();
//	TestFunctions tf = new TestFunctions();

	@Test
	public void testAdd() {
		int sum = mf.add(282, 20);
		assertEquals(302, sum);
	}
	
	@Test
	public void testSub() {
		int diff = mf.substract(69, 11);
		assertEquals(58, diff);
	}
	
	@Test
	public void testfactorial() {
		int fact = mf.factorial(5);
		assertEquals(120, fact);
	}
	
//	@Test
//	public void testq1() {
//		String q1 = tf.question1();
//		assertEquals("one two default",q1);
//	}
//	
//	@Test
//	public void testq2() {
//		int q2 = tf.question2(5);
//		assertEquals(8, q2);
//	}
//	
//	@Test
//	public void testq3() {
//		int q3 = tf.question3();
//		assertEquals(26, q3);
//	}
//	
//	@Test
//	public void testq4() {
//		int q4 = tf.question4();
//		assertEquals(4, q4);
//	}
//	
//	@Test
//	public void testq7() {
//		int q7 = tf.question7(60);
//		assertEquals(5, q7);
//	}
//	
//	@Test
//	public void testq10a() {
//		double q10a = tf.question10a();
//		assertEquals(10.5, q10a,0.00);
//	}	
//	
//	@Test
//	public void testq10b() {
//		int q10bp1 = tf.question10bp1(10);
//		assertEquals(100, q10bp1);
//		int q10bp2 = tf.question10bp2(q10bp1);
//		assertEquals(20, q10bp2);
//	}
//	
//	@Test
//	public void testq10c() {
//		int q10c = tf.question10c();
//		assertEquals(5, q10c);
//	}
//	
//	@Test
//	public void testq10d() {
//		boolean q10d = tf.question10d(true,false,false);
//		assertEquals(false, q10d);
//	}
//	
//	@Test
//	public void testq10e() {
//		String q10e = tf.question10e(2, 1, 3);
//		assertEquals("carton",q10e);
//	}
	
	@Test
	public void fadd() {
		int fsum = mf.fadd(10, 5);
		assertEquals(15,fsum);
	}
	
	@Test
	public void div() {
		int q = mf.divide(6, 0);
		System.out.println(q);
	}
	
	@Test
	public void tadd() {
		int tsum = mf.tadd(1, 521123131	);
		//assertEquals(15,fsum);
		System.out.println(tsum);
	}

	
	
	

		
	
	
	

}
