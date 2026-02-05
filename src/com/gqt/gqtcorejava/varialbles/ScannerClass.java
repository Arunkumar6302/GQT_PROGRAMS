package com.gqt.gqtcorejava.varialbles;

import java.util.Scanner;

public class ScannerClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the byte data : ");
		byte bt = sc.nextByte();
		System.out.println("The byte data is ="+bt);
		System.out.println("-------------");
		
		System.out.println("Enter the short data : ");
		short st = sc.nextShort();
		System.out.println("The short data is ="+st);
		System.out.println("-------------");
		
		System.out.println("Enter the Integer data : ");
		int it = sc.nextInt();
		System.out.println("The int data is ="+it);
		System.out.println("-------------");
		
		System.out.println("Enter the long data : ");
		long ln = sc.nextLong();
		System.out.println("The long data is ="+ln);
		System.out.println("-------------");
		
		System.out.println("Enter the float data : ");
		float ft = sc.nextFloat();
		System.out.println("The float data is ="+ft);
		System.out.println("-------------");
		
		System.out.println("Enter the double data : ");
		double db = sc.nextDouble();
		System.out.println("The double data is ="+db);
		System.out.println("-------------");
		
		

	}

}
