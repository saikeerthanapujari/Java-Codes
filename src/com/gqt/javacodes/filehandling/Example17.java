package com.gqt.javacodes.filehandling;

import java.util.ArrayList;

public class Example17 {
	public static void main(String[] args) {
		ArrayList<Integer> a=new ArrayList<Integer>();
		a.add(100);
		a.add(0);
		a.add(10);
		a.add(145);
		a.add(530);
		a.add(100);
		a.add(10);
		System.out.println(a);
		System.out.println("-----------");
		a.stream().forEach(i->System.out.println(i));
		System.out.println("----------");
		a.stream().forEach(System.out::println);
	}
}
