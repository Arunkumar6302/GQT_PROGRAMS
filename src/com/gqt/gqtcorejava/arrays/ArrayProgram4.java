package com.gqt.gqtcorejava.arrays;

import java.util.Scanner;

public class ArrayProgram4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the college count :");
		int col = sc.nextInt();
		
		int[][][] arr = new int[col][][];
		
		for(int i=0;i<arr.length;i++) {
			System.out.println("Enter the class count inside college no "+(i+1));
			int cls = sc.nextInt();
			arr[i] = new int[cls][];
		}
		for(int i=0;i<arr.length;i++) {
			System.out.println("Inside College no "+(i+1));
			for(int j=0;j<arr[i].length;i++) {
				System.out.println("Enter the student count inside class no :"+(j+1));
				int stu = sc.nextInt();
				arr[i][j] = new int[stu];
			}
		}
	}
}
