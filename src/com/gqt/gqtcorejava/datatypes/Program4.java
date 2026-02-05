package com.gqt.gqtcorejava.datatypes;

public class Program4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Byte Wrapper Class");
		byte b = 125;
		Byte b1 = new Byte(b);
		System.out.println(b1.getClass());
		System.out.println("The value in Byte ="+b1);
		System.out.println("--------------");
		System.out.println("Short Wrapper Class");
		short s = 12345;
		Short s1 = new Short(s);
		System.out.println(s1.getClass());
		System.out.println("The value in Short ="+s1);
		System.out.println("--------------");
		System.out.println("Integer Wrapper Class");
		int i = 12345678;
		Integer i1 = new Integer(i);
		System.out.println(i1.getClass());
		System.out.println("The value in Integer ="+i1);
		System.out.println("--------------");
		System.out.println("Long Wrapper Class");
		long l = 12345678l;
		Long l1 = new Long(l);
		System.out.println(l1.getClass());
		System.out.println("The value in Long ="+l1);
		System.out.println("--------------");
		System.out.println("Character Wrapper Class");
		char c = 'e';
		Character c1 = new Character(c);
		System.out.println(c1.getClass());
		System.out.println("The value in Character ="+c1);
		System.out.println("--------------");
		System.out.println("String Wrapper Class");
		String st = "Global Quest Technologies";
		String st1 = new String(st);
		System.out.println(st1.getClass());
		System.out.println("The value in String ="+st1);
		System.out.println("--------------");

	}

}
