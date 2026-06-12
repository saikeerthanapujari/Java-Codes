package com.gqt.javacodes.filehandling;

import java.util.ArrayList;

public class COuntMethod {
	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<String>();
		al.add("sachin");
		al.add("keerthana");
		al.add("pandu");
		al.add("abhi");
		al.add("chinnu");
		al.add("chinnachinni");
		System.out.println(al);
		System.out.println("--------------");
		int count=0;
		for(int i=0;i<al.size();i++) {
			if(al.get(i).length()==5) {
				count++;
			}
		}
		System.out.println(count);
	}
}
