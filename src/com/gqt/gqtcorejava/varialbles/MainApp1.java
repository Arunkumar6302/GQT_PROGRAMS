package com.gqt.gqtcorejava.varialbles;

class Calculator{
	void add() {
		int a = 20;
		int b = 30;
		int res = a+b;
		System.out.println(res);
	}
	
	void sub(int m,int n) {
		System.out.println(m-n);
	}
	
	int mul() {
		int a = 10;
		int b = 20;
		return a*b;
	}
	
	int div(int m,int n) {
		return m/n;
		}
}

public class MainApp1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator  c = new Calculator();
		System.out.println("Addition: ");
		c.add();
		System.out.println("Subtraction: ");
		c.sub(80, 30);
		System.out.println("Multiplication: ");
		System.out.println(c.mul());
		System.out.println("Division: ");
		System.out.println(c.div(90, 5));
	}

}
