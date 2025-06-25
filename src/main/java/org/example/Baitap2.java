package org.example;

import java.util.Scanner;

public class Baitap2 {
    static double tinhTongLuong(double gioLam, double luong){
        double tongLuong = gioLam * luong;
        return tongLuong;
    }

    public static void main(String[] args) {
        //user nhập tiền lương/h và số giờ làm, tính tổng
//        mô hình IPO
        //input
        //giá trị từ phía người dùng nhập
        //tổng giờ làm, lương/h
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập tổng số giờ làm: ");
        double gioLam = scanner.nextDouble();
        System.out.println("Nhập lương/h: ");
        double luong = scanner.nextDouble();


        //process
        //lấy giá trị từ người dùng nhập đi thực hiện logic theo yc bài
        //tongluong = tổng số giờ làm * số lương 1 giờ
        double tongLuong = tinhTongLuong(gioLam, luong);

        //output
        //giá trị đầu ra từ yc bài
        System.out.println("Tổng số lương là: " + tongLuong);
    }
}
