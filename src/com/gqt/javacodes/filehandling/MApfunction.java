package com.gqt.javacodes.filehandling;

import java.util.ArrayList;

public class MApfunction {
	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<String>();
		al.add("sachin");
		al.add("keerthana");
		al.add("pandu");
		al.add("abhi");
		al.add("chinnu");
		al.add("chinnachinni");
		System.out.println(al);
		ArrayList<String> res = new ArrayList<String>();
		for(int i=0;i<al.size();i++) {
			res.add(al.get(i).toUpperCase());
		}
		System.out.println(res);
	}
}
