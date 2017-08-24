package com.oocl.ita.gervajo.ws.business;

import java.io.IOException;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class CalcImpl {
	
	InetAddress ip;
	String timestamp;
	String pcname;
	
	
	public CalcImpl() {
		try {
			timestamp = new SimpleDateFormat("HH:mm:ss").format(Calendar.getInstance().getTime());
			ip = InetAddress.getLocalHost();

		} catch (UnknownHostException e) {
			
		}
	}
	
	public void log() throws IOException {
		String path = "D:\\iplog.txt";
		List<String> stringList = new ArrayList<String>();
		stringList.add("Address: " +  ip.getHostAddress() + " Timestamp: " + timestamp);
		Files.write(Paths.get(path), stringList , StandardOpenOption.CREATE,StandardOpenOption.APPEND);
	}

	public double getAnswer(String category, double firstNum, double secondNum) throws IOException {
		log();
		switch (category.toLowerCase()) {
		case "+":
			return firstNum + secondNum;
		case "-":
			return firstNum - secondNum;
		case "*":
			return firstNum * secondNum;
		case "/":
			return firstNum / secondNum;
		}
		return 0;

	}

}
