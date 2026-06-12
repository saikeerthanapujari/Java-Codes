package com.gqt.javacodes.filehandling;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Example12 {
	public static void main(String[] args) {
		ArrayList<Integer> al= new ArrayList<Integer>();
		al.add(100);
		al.add(10);
		al.add(200);
		al.add(175);
		al.add(250);
		al.add(25);
		al.add(92);
		al.add(1000);
		al.add(1090);
		System.out.println(al);
		List<Integer> res = al.stream().sorted().collect(Collectors.toList());
		System.out.println(res);
	}
}
