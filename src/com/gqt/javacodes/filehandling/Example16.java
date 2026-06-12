package com.gqt.javacodes.filehandling;

import java.util.ArrayList;

public class Example16 {
	public static void main(String[] args) {
		ArrayList<String> a = new ArrayList<String>();
		a.add("rama");
		a.add("sita");
		a.add("laxman");
		a.add("dhasharadha");
		a.add("pandu");
		System.out.println(a);
		String min = a.stream().min((s1,s2)->s1.compareTo(s2)).get();
		System.out.println("The min value is =" +min);
		System.out.println("----------");
		String max = a.stream().max((s1,s2)->s1.compareTo(s2)).get();
		System.out.println("The max value is =" +max);
		
	}
}
