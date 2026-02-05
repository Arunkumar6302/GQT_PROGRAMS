package com.gqt.gqtcorejava.arrays;

import java.util.Scanner;

public class ArrayProgram3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no of class rooms :");
		int cls = sc.nextInt();
		System.out.println("________________________________");
		String[][] arr = new String[cls][];
		
		for(int i=0;i<cls;i++) {
			System.out.println("Enter the studdent count inside class room no-"+(i+1)+":");
			int stu = sc.nextInt();
			arr[i] = new String[stu];
		}
		
		for(int i=0;i<arr.length;i++) {
			System.out.println("Inside the class No "+(i+1)+":");
			for(int j=0;j<arr[i].length;j++) {
				System.out.println("Enter the names of the student no "+(j+1)+" is :");
				arr[i][j] = sc.next();
			}
		}
		System.out.println("__________________________________");
		
		for(int i=0;i<arr.length;i++) {
			System.out.println("Inside the class No "+(i+1)+":");
			for(int j=0;j<arr[i].length;j++) {
				System.out.println("The name of the student no "+(j+1)+" is :"+arr[i][j]);
			}
		}
		System.out.println("__________________________________");
		
	}
}
