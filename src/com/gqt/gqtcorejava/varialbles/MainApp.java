package com.gqt.gqtcorejava.varialbles;

class Program1{
	static int a,b,c;
	int p,q,r;

static {
	a=10;
	b=20;
	c=30;
}
{
	p=100;
	q=200;
	r=300;
}
static void display1() {
	System.out.println(a);
	System.out.println(b);
	System.out.println(c);
}
void display2() {
	System.out.println(p);
	System.out.println(q);
	System.out.println(r);
	
}
}

public class MainApp {
  
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Program1.a);
		Program1.display1();
		Program1 p1 =new Program1();
		p1.display1();
		p1.display2();
		
		
	}

}
