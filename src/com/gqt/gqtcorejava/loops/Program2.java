package com.gqt.gqtcorejava.loops;

import java.util.*;
public class Program2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of n :");
		int n = sc.nextInt();
		for(int i=0;i<n;i++) {
			System.out.println("$");
		}
		System.out.println("---------------");
		
		int i=1;
		while(i<=n) {
			System.out.println("@");
			i++;
		}
		System.out.println("----------------");
		
		int j=1;
		do {
			System.out.println("%");
			j++;
		}while(j<=n);

	}

}
