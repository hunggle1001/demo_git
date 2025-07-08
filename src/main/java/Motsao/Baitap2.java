package Motsao;

import java.util.Scanner;

public class Baitap2 {
    public static int findSecondLargest(int[] arr) {
        if (arr.length < 2) {
            return Integer.MIN_VALUE;
        }

        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;

        for (int num : arr) {
            if (num > max) {
                secondMax = max;
                max = num;
            } else if (num > secondMax && num < max) {
                secondMax = num;
            }
        }

        return secondMax;
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 3, 4, 5, 0, 2};
        int[] arr2 = {10, 5, 10};
        int[] arr3 = {3};
        //in kết quả
        System.out.println("Output 1: " + findSecondLargest(arr1));
        System.out.println("Output 2: " + findSecondLargest(arr2));
        System.out.println("Output 3: " + findSecondLargest(arr3));
    }
}
