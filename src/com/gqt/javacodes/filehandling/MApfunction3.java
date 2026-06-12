package com.gqt.javacodes.filehandling;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class MApfunction3 {
	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<String>();
		al.add("sachin");
		al.add("keerthana");
		al.add("pandu");
		al.add("abhi");
		al.add("chinnu");
		al.add("chinnachinni");
		System.out.println(al);
		List<String> list = al.stream().map(s->s.toUpperCase()).collect(Collectors.toList());
		System.out.println(list);
	}
}
