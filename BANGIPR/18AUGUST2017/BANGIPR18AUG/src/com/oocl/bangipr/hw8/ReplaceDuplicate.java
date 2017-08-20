package com.oocl.bangipr.hw8;

import java.util.ArrayList;
import java.util.List;

public class ReplaceDuplicate {

	public static void main(String[] args) {
		ArrayList<String> normalEnglish = new ArrayList<String>();
		normalEnglish.add("haha");
		normalEnglish.add("hannah");
		normalEnglish.add("cake");
		normalEnglish.add("movies");
		normalEnglish.add("GoT");
		normalEnglish.add("hannah");
		
		ArrayList<String> notEnglish = new ArrayList<String>();
		notEnglish.add("你好吗");
		notEnglish.add("喂");
		notEnglish.add("对不起");
		notEnglish.add("谢");
		notEnglish.add("你好吗");
		notEnglish.add("多少钱");
		
		
		removeDup(normalEnglish);
		removeDup(notEnglish);
	}
	
	public static void removeDup(ArrayList<String> list) {
		int index = 0;

	    int count = 0;

	    while (index < list.size() - 1) {
	        String item = list.get(index);

	        List<String> tail = list.subList(index + 1, list.size());

	        while (tail.contains(item)) {
	            tail.remove(item);
	            count++;
	        }
	        index++;
	    }

	    System.out.println(count);

	    System.out.println(list);
	}

}
