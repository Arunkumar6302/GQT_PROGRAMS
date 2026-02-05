package com.gqt.gqtcorejava.loops;

import java.util.Scanner;

public class Program3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of n :");
		int n = sc.nextInt();
		for(int i=0;i<n;i++) {
			System.out.print("$");
		}
		System.out.println();
		System.out.println("---------------");
		
		int i=1;
		while(i<=n) {
			System.out.print("@");
			i++;
		}
		System.out.println();
		System.out.println("----------------");
		
		int j=1;
		do {
			System.out.print("%");
			j++;
		}while(j<=n);

	}

	}


