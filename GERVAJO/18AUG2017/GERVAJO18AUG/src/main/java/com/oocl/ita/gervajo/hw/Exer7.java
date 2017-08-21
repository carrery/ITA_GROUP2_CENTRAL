package com.oocl.ita.gervajo.hw;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;

public class Exer7 {
	public static void main(String[] args) throws IOException {
		List<String> stringList = new ArrayList<String>();
		List<String> stringList2 = new ArrayList<String>();
		stringList.add("John");
		stringList.add("Adriel");
		stringList.add("Gervacio");
		Files.write(Paths.get("D:\\testfile1.txt"), stringList , StandardOpenOption.CREATE);
		
		FileReader fr = new FileReader("D:\\testfile1.txt");
		BufferedReader br = new BufferedReader(fr);
		
		while(br.readLine() != null) {
			stringList2.add(br.readLine());
		}
		
		Files.write(Paths.get("D:\\testfile2.txt"), stringList2, StandardOpenOption.CREATE);
	}
}
