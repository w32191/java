package com.lcpan.m10;

public class Test {

	public static void main(String[] args) {
		Moveable animal = new Dog();
		animal.run();
		animal.move();
		
		Moveable animal2 = new Cat();
		animal2.run();
		animal2.move();

	}

}
