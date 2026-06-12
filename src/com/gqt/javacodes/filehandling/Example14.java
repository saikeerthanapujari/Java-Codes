package com.gqt.javacodes.filehandling;

import java.util.ArrayList;
import java.util.Collections;

public class Example14 {
	public static void main(String[] args) {
		ArrayList<String> a = new ArrayList<String>();
		a.add("rama");
		a.add("sita");
		a.add("laxman");
		a.add("dhasharadha");
		a.add("pandu");
		System.out.println(a);
		Collections.sort(a);
		System.out.println(a);
	}
}
