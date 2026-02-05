package com.gqt.gqtcorejava.arrays;

import java.util.Scanner;

public class MainProgram {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no  of languages :");
		int lang = sc.nextInt();
		System.out.println("Enter no of types :");
		int type = sc.nextInt();
		System.out.println("Enter no of movies :");
		int mov = sc.nextInt();
		
		long overall=0;
		long investment = 7000000000l;
		long prev_invs = 3000000000l;
		
		long[][][] arr = new long[lang][type][mov];
		
		long res[] = new long[lang];
		int temp=0;
		
		
		for(int i=0;i<arr.length ;i++) {
			System.out.println("Inside the language :"+(i+1));
			long lang_count=0;
			for(int j=0;j<arr[i].length;j++) {
				System.out.println("Inside type no "+(j+1));
				for(int k=0;k<arr[i][j].length;k++) {
					System.out.println("Enter the collection movie no  "+(k+1));
					arr[i][j][k] = sc.nextInt();
					overall+=arr[i][j][k];
					lang_count+=arr[i][j][k];
				}
			}
			res[temp] =lang_count;
			temp++;
			
		}
		System.out.println("___________________________________");
		for(int i=0;i<arr.length ;i++) {
			System.out.println("Inside the language :"+(i+1));
			long lang_count=0;
			for(int j=0;j<arr[i].length;j++) {
				System.out.println("Inside type no "+(j+1));
				for(int k=0;k<arr[i][j].length;k++) {
					System.out.println("The collection movie no  "+(k+1)+"is ="+arr[i][j][k]);	
				}
			}
		}
		
		System.out.println("______________________________");
		System.out.println("Over all revenue "+ overall);
		System.out.println("______________________________");
		long prof_loss;
		System.out.println("Comparing the investment and revenue");
		if(overall >investment) {
			prof_loss = overall-investment;
			System.out.println("Jagadeesh has a profit of "+prof_loss);
		}else {
			prof_loss = investment-overall;
			System.out.println("Jagadeesh has incurred loss of "+prof_loss);
		}
		System.out.println("------------------------------------------");
		System.out.println("Comparing prof/loss and prev year ");
		
		
		if(overall>prev_invs) {
			System.out.println("Jagadeesh has gain more money this year");
		}else {
			System.out.println("Jagadeesh has not gain more money this year");
		}
		System.out.println("____________________________");
		
		for(int i=0;i<res.length;i++) {
			System.out.println("revenue made by lang no "+(i+1)+"is ="+arr[i]);
		}
	}
}
