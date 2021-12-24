package com.lcpan.m06;

public class ThreeDimArray {
  public static void main(String[] args) {
    int sum = 0;
    //3*3*2
    int[][][] arr = {
      {{2, 3}, {7, 5}, {8, 9}},
      {{4, 5}, {7, 6}, {8, 9}},
      {{9, 3}, {8, 7}, {6, 7}}
    };

    // 7*3*3
    int[][][] array = {
      {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}},
      {{10, 11, 12}, {13, 14, 15}, {16, 17, 18}},
      {{19, 20, 21}, {22, 23, 24}, {25, 26, 27}},
      {{28, 29, 30}, {31, 32, 33}, {34, 35, 36}}
    };

    for (int i = 0; i < arr.length; i++) { // 控制 "層"
      for (int j = 0; j < arr[i].length; j++) { // 控制 第幾層的第幾列
        for (int k = 0; k < arr[i][j].length; k++) { // 控制第幾層第幾列的第幾個元素
          sum += arr[i][j][k];
        }
      }
    }
    System.out.println("sum = " + sum);
  }
}
