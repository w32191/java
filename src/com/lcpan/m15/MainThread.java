package com.lcpan.m15;

public class MainThread {
	public static void main(String[] args) {
		Thread t = Thread.currentThread();
		System.out.println("before change : " + t.getName());
		t.setName("Main Thread");
		System.out.println("after change : " + t.getName());
	}
}
