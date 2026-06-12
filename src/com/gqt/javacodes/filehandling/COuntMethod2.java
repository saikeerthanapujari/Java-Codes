package com.gqt.javacodes.filehandling;

import java.util.ArrayList;

public class COuntMethod2 {
	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<String>();
		al.add("sachin");
		al.add("keerthana");
		al.add("pandu");
		al.add("abhi");
		al.add("chinnu");
		al.add("china");
		System.out.println(al);
		System.out.println("--------------");
		Long count = al.stream().filter(s->s.length()==5).count();
		System.out.println(count);
} 
}
