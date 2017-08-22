package com.oocl.bangipr.sw2;


import java.io.File;
import java.io.IOException;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.sql.Timestamp;
import java.time.LocalDateTime;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class Logging {
	
	InetAddress thisIp;
	Timestamp timestamp = new Timestamp(System.currentTimeMillis());
	File logDir = new File("D:\\WSlogs");
	File logsTxt = new File("D:\\WSlogs\\logs.txt");
	
	 @Pointcut("execution(* com.oocl.bangipr.sw1.*.*(..))")
	   private void selectAll(){}

	  
	   @Before("selectAll()")
	   public void beforeAdvice(){
	      System.out.println("Calculator is getting input");
	   }

	  
	   @After("selectAll()")
	   public void afterAdvice() throws IOException{
	      System.out.println("Calculator has acquired input");
	      System.out.println(thisIp.getLocalHost());
	      
	      String text = "This is accessing your webservice " + thisIp.getLocalHost() + System.lineSeparator() + LocalDateTime.now() + System.lineSeparator() + System.lineSeparator();
	      if (!logDir.exists()) {
				logDir.mkdir();
				logsTxt.createNewFile();
				Files.write(Paths.get(logsTxt.getAbsolutePath()), text.getBytes(), StandardOpenOption.APPEND);
			} else {
				if (!logsTxt.exists()) {
					logsTxt.createNewFile();
					Files.write(Paths.get(logsTxt.getAbsolutePath()), text.getBytes(), StandardOpenOption.APPEND);
				} else {
					Files.write(Paths.get(logsTxt.getAbsolutePath()), text.getBytes(), StandardOpenOption.APPEND);
				}
			}
	      
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
