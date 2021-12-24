package com.lcpan.m14;

import java.io.*;

public class ConsoleInput {
	public static void main(String[] args) {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String str;
		int sum = 0;
		try {
			while (!(str = in.readLine()).equals(""))
				sum += Integer.parseInt(str);
			System.out.println("sum = " + sum);
			in.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
