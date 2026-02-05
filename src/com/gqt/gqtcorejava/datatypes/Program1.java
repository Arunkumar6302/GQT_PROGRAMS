package com.gqt.gqtcorejava.datatypes;

public class Program1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//implicit type conversion
		
		byte a = 126;
		System.out.println("The byte value is= "+a);
		System.out.println("----------------------");
		short s = a;
		System.out.println("The short value is ="+s);
		System.out.println("----------------------");
		int i = s;
		System.out.println("The int value is= "+i);
		System.out.println("----------------------");
		long l = i;
		System.out.println("The long value is= "+l);
		float ft= l;
		System.out.println("The floating value is= "+ft);
		System.out.println("----------------------");
		double d = ft;
		System.out.println("The double value is= "+d);
		System.out.println("----------------------");
	}
}
