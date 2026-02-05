package com.gqt.gqtcorejava.loops;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size :");
		int n = sc.nextInt();
		for(int i=1;i<=n;i++) {
			int count=i;
			for(int j=1;j<=n;j++) {
				System.out.print(count+"	");
				count+=n;
			}
			System.out.println();
			
		}

	}

}
