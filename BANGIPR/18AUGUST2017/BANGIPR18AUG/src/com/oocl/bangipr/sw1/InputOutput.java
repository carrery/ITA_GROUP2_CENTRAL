package com.oocl.bangipr.sw1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Collections;

public class InputOutput {
	
	
	public static ArrayList<String> sorts(ArrayList<String> n) {
		
		ArrayList<Integer> inte = new ArrayList<Integer>();
		ArrayList<String> wor = new ArrayList<String>();
		
		String regex = "\\d+";
		for(int i =0; i < n.size(); i++) {
			if(n.get(i) != null) {
				
				if((n.get(i)).matches(regex)) {
					int a = Integer.parseInt(n.get(i));
					inte.add(a);
					
				} else {
					String b = n.get(i);
					wor.add(b);
				}
			}
		}
		
		Collections.sort(inte);
		Collections.sort(wor);
		
		for(int e = 0; e< inte.size(); e++) {
			
			wor.add(e, inte.get(e).toString());
		}
		
		return wor;
			
	}

	public static void main(String[] args) throws Exception {
		
		ArrayList<String> words = new ArrayList<String>();
		
		BufferedReader buffer = new BufferedReader(new FileReader("resources/input.txt"));
	
		String w;
		
		while((w = buffer.readLine()) !=null) {
			words.add(w);
		}
		
		ArrayList<String> obj2 = sorts(words);
		
			
		FileWriter write = new FileWriter("resources/output.txt");
		for (String cur: obj2) {
		System.out.println(cur);
			write.write(cur + "\n");
		}
		
		buffer.close();
		write.close();
	}

}
