package com.lcpan.m07;

public class Overloading {
	public void greeting() {
		System.out.println("Hello!");
	}

	public void greeting(String name) {
		System.out.println("Hello! " + name);
	}

	public void greeting(String name, int num) {
		for (int i = 1; i <= num; i++)
			System.out.println("Hello! " + name);
	}

	public static void main(String[] args) {
		Overloading ol = new Overloading();
		ol.greeting();
		ol.greeting("John");
		ol.greeting("Mary", 3);
	}

}
