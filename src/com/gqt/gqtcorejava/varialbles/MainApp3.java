package com.gqt.gqtcorejava.varialbles;

class Dog{
	String name;
	String color;
	int age;
	int price;
	
	void display() {
		System.out.println(name);
		System.out.println(color);
		System.out.println(age);
		System.out.println(price);
	}
}
public class MainApp3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog d1 = new Dog();
		d1.display();
		d1.name="rocky";
		d1.color="Brown";
		d1.age=19;
		d1.price=15000;
		d1.display();

	}

}
