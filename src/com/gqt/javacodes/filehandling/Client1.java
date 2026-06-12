package com.gqt.javacodes.filehandling;

import java.io.*;
import java.net.Socket;
import java.util.Scanner;

public class Client1 {
	public static void main(String[] args) throws  IOException {
		Socket csoc = new Socket("localhost",4000);
		OutputStream os = csoc.getOutputStream();
		DataOutputStream dos = new DataOutputStream(os);
		Scanner sc = new Scanner(System.in);
		System.out.println("ENter the message from client:");
		String message=sc.nextLine();
		dos.writeUTF(message);
		
	}
	
}
