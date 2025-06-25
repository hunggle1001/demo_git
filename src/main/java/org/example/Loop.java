package org.example;

import java.util.Scanner;

public class Loop {
    public static void main(String[] args) {
//        có 3 loại vòng lặp
//        vòng lặp while
//        giá trị ban đầu
//        while (điều kiện)
//        thực hiện logic
//
//        thay đổi giá trị ban đầu
//        }

//        yêu cầu: in ra 5 dòng Hello World
        int i = 1;//giá trị ban đầu
        while (i <= 5){ //điều kiện thực hiện vòng lặp
            System.out.println("Hello world");
            i++; // i = i +1 hoặc i += 1 thay đổi giá trị ban đầu
        }
        //yêu cầu: viết chương trình cho phép người dùng nhập số n, in ra giao diện n lần dòng Hello testing 05
        //nhập số lần
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số lần in");
        int n = scanner.nextInt();
        //in ra theo số lần đã nhập
        int lan = 1;
        while(lan <= n) {
            System.out.println("Hello testing 05");
            lan++;
        }
    }
}
