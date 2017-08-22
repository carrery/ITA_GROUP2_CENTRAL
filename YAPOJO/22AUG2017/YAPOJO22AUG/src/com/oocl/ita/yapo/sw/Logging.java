package com.oocl.ita.yapo.sw;

import java.io.IOException;
import java.net.InetAddress;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class Logging {
   /** Following is the definition for a pointcut to select
      *  all the methods available. So advice will be called
      *  for all the methods.
   */
   @Pointcut("execution(* com.oocl.ita.yapo.sw.*.*(..))")
   private void selectAll(){}

   /** 
      * This is the method which I would like to execute
      * before a selected method execution.
 * @throws IOException 
   */
   @Before("selectAll()")
   public void beforeAdvice() throws IOException{
	  writeLogger(); 
      System.out.println("Calculator has been started.");
   }
   
   private void writeLogger() throws IOException {
		InetAddress ip;
		ip = InetAddress.getLocalHost();
		
//		byte data[] = ip.getAddress();
//		List<String> stringList = new ArrayList<String>();
//		
//		Enumeration e = NetworkInterface.getNetworkInterfaces();
//		
//		while(e.hasMoreElements())
//		{
//		    NetworkInterface n = (NetworkInterface) e.nextElement();
//		    Enumeration ee = n.getInetAddresses();
//		    while (ee.hasMoreElements())
//		    {
//		        InetAddress i = (InetAddress) ee.nextElement();
//		        stringList.add(i.getHostAddress());
//		    }
//		}
		
//		try(final DatagramSocket socket = new DatagramSocket()){
//			  socket.connect(InetAddress.getByName("8.8.8.8"), 10002);
//			  ip = socket.getLocalAddress().getHostAddress();
		
//	    String ipAddress = null;
//
//	    try {
//	        Enumeration<NetworkInterface> networkInterfaces = NetworkInterface.getNetworkInterfaces();
//
//	        while (networkInterfaces.hasMoreElements()) {
//
//	            NetworkInterface networkInterface = networkInterfaces.nextElement();
//
//	            byte[] hardwareAddress = networkInterface.getHardwareAddress();
//	            if (null == hardwareAddress || 0 == hardwareAddress.length || (0 == hardwareAddress[0] && 0 == hardwareAddress[1] && 0 == hardwareAddress[2])) continue;
//
//	            Enumeration<InetAddress> inetAddresses = networkInterface.getInetAddresses();
//
//	            if (inetAddresses.hasMoreElements()) ipAddress = inetAddresses.nextElement().toString();
//
//	            break;
//	        }
//	    } catch (SocketException e) {
//	        e.printStackTrace();
//	    }
//			}
		
		Timestamp timestamp = new Timestamp(System.currentTimeMillis());

		String path = "\\\\ZHA-ITA003-W7\\Yapo\\Others\\IPLog.txt";
		List<String> stringList = new ArrayList<String>();
		stringList.add(timestamp + " : " + ip.getHostName() + " || " + ip.getHostAddress() + " || " + ip.getCanonicalHostName());
		Files.write(Paths.get(path), stringList, StandardOpenOption.CREATE, StandardOpenOption.APPEND);
	} 

   /** 
      * This is the method which I would like to execute
      * after a selected method execution.
   */
   @After("selectAll()")
   public void afterAdvice(){
      System.out.println("Calculator has been setup.");
   }

   /** 
      * This is the method which I would like to execute
      * when any method returns.
   */
   @AfterReturning(pointcut = "selectAll()", returning = "retVal")
   public void afterReturningAdvice(Object retVal){
      System.out.println("Returning:" + retVal.toString() );
   }

   /**
      * This is the method which I would like to execute
      * if there is an exception raised by any method.
   */
   @AfterThrowing(pointcut = "selectAll()", throwing = "ex")
   public void AfterThrowingAdvice(IllegalArgumentException ex){
      System.out.println("There has been an exception: " + ex.toString());   
   }
}