package com.lcpan.m06;

public class TwoDimArray {
	public static void main(String[] args) {
		int sum = 0;
		int[][] arr = { { 2, 6, 1 }, { 4, 3, 5 } };
		//
		for (int i = 0; i < arr.length; i++)
			for (int j = 0; j < arr[i].length; j++)
				sum += arr[i][j];
		System.out.println("sum = " + sum);

		sum = 0;
		int[][] arr1 = { { 2, 6, 1 }, { 4, 3, 5 }, { 4, 3, 4, 3, 5, 3, 5, 3 } };
		//
		for (int i = 0; i < arr.length; i++)
			for (int j = 0; j < arr[i].length; j++)
				sum += arr[i][j];
		System.out.println("sum = " + sum);

		sum = 0;
		arr1=new int[][]{{2,6,1},{4,3,5},{4,3,4,3,5,3,5,3},{7,8,5,3,}};
		//
		for (int i = 0; i < arr.length; i++)
			for (int j = 0; j < arr[i].length; j++)
				sum += arr[i][j];
		System.out.println("sum = " + sum);

	}
}
