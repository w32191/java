package com.lcpan.m05;

public class LoopDebug {
	public static void main(String[] args) {
		int n = 1;
		int sum = 0;
		while (n <= 10) {
			sum += n;
			n++;
		}
		System.out.println(sum);
	}
}
