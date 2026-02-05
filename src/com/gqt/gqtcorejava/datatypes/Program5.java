package com.gqt.gqtcorejava.datatypes;

public class Program5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Float Wrapper Class");
		float f = 123.123f;
		Float f1 = new Float(f);
		System.out.println(f1.getClass());
		System.out.println("The value in Float ="+f1);
		System.out.println("--------------");
		System.out.println("Double Wrapper Class");
		double d = 12345.1234;
		Double d1 = new Double(d);
		System.out.println(d1.getClass());
		System.out.println("The value in Double ="+d1);
		System.out.println("--------------");
	}

}
