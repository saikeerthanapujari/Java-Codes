package com.gqt.javacodes.filehandling;

import java.util.ArrayList;
import java.util.Scanner;

public class StreamsEx1 {
	public static void main(String[] args) {
		ArrayList<Integer> al= new ArrayList<Integer>();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no.of elements");
		int n=sc.nextInt();
		for(int i=0;i<n;i++) {
			al.add(sc.nextInt());
		}
		System.out.println(al);
		ArrayList<Integer> res = new ArrayList<Integer>();
		for(int i=0;i<al.size();i++) {
			if(al.get(i)%2==0) {
				res.add(al.get(i));
			}
		}
		System.out.println("resultant array =" +res);
	}
}
