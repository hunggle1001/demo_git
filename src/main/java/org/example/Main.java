package org.example;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.printf("Hello and welcome!");

        //lệnh xuất
        System.out.println("Hello and welcome!");

        //snippet lệnh xuất - gõ sout
        System.out.println("hello Cybersoft");

        //comment nhanh - ctrl + / hoặc macbook command + /

        //lệnh nhận
        Scanner scanner = new Scanner(System.in);

        //Biến - nơi lưu trữ dữ liệu
        //<kiểu dữ liêu> <tên biến> = <giá trị khởi tạo>

        int age = 18;
        //double salary = 1500.15;
        // String name1 = "Hưng";
        //  boolean isLogin = true; //false
        //hằng số - giá trị không đổi
        // final double pi = 3.14;

        //yêu cầu: cho phép người dùng vào tên minh và xuất ra màn hình
        // ô nhập
        //System.out.println("Nhập tên người dùng");
        // Nhận giá trị từ người dùng nhập và gắn vào biến
        //String name = scanner.nextLine();
        //xuất ra màn hình
        //System.out.println("Xin chào" + name);

        //yêu cầu: viết chương trình cho sinh viên nhập vào tên, lớp và tuổi (scanner.nextln()) và in ra màn hình

        //Nhập tên sinh viên
        System.out.println("Nhập tên sinh viên: ");
        String ten = scanner.nextLine();

        //Nhập lớp
        System.out.println("Nhập lớp: ");
        String lop = scanner.nextLine();

        //Nhập số tuổi
        System.out.println("Nhập sô tuổi: ");
        int tuoi = scanner.nextInt();

        System.out.println("Xin chào " + ten + "," + "hiện đang " + tuoi + " tuổi" + "," + "học lớp " + lop);
    }
}