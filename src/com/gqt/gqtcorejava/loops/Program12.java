package com.gqt.gqtcorejava.loops;

import java.util.Scanner;

public class Program12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size :");
		int n = sc.nextInt();
		
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=i;j++) {
				if(i==1 || i==n ||j==1 || j==i) {
					System.out.print("$ ");
				}else {
					System.out.print("# ");
				}
			}
			System.out.println();
			
		}
	}

}
