package com.oocl.bangipr.sw2;


import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.AfterReturning;

@Aspect
public class Logging {
	
	 @Pointcut("execution(* com.oocl.bangipr.sw2.*.*(..))")
	   private void selectAll(){}

	  
	   @Before("selectAll()")
	   public void beforeAdvice(){
	      System.out.println("Calculator is getting input");
	   }

	  
	   @After("selectAll()")
	   public void afterAdvice(){
	      System.out.println("Calculator has acquired input");
	   }

	   @AfterReturning(pointcut = "selectAll()", returning = "retVal")
	   public void afterReturningAdvice(Object retVal){
	      //System.out.println("Returning:" + retVal.toString() );
	   }

	   @AfterThrowing(pointcut = "selectAll()", throwing = "ex")
	   public void AfterThrowingAdvice(IllegalArgumentException ex){
	      System.out.println("There has been an exception: " + ex.toString());   
	   }

}
