package com.gqt.javacodes.filehandling;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Example15 {
	public static void main(String[] args) {
		ArrayList<String> a = new ArrayList<String>();
		a.add("rama");
		a.add("sita");
		a.add("laxman");
		a.add("dhasharadha");
		a.add("pandu");
		System.out.println(a);
		List<String> res = a.stream().sorted((s1,s2)->s1.compareTo(s2)).collect(Collectors.toList());
		System.out.println(res);
	}
}
