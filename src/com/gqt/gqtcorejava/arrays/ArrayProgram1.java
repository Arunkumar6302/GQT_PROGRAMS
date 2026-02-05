package com.gqt.gqtcorejava.arrays;

import java.util.Scanner;

public class ArrayProgram1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the student count : ");
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i=0;i<n;i++) {
			System.out.println("Enter marks of student no :"+(i+1));
			arr[i] = sc.nextInt();
		}
		System.out.println("__________________________");
		for(int i=0;i<n;i++) {
			System.out.println("The marks of student no "+(i+1)+" is: "+arr[i]);
		}
	}
}
