package org.example;

import java.util.Scanner;

public class CauDieuKien {
    public static void main(String[] args) {
                //Câu lệnh if
                // if(điều kiện) {thực hiện logic}
                //điều kiện đúng
                if(9 > 2) {
                    System.out.println("điều kiện đúng");
                }
                //điều kiện sai
                if(2 > 9){
                    System.out.println("điều kiện đúng");
                }

                //viết chương trihf kiểm tra xem hôm nay có phải là ngày đi học không?
                int day = 4;
                if(day == 4 || day == 8){
                    System.out.println("Hôm nay đi học");
                }

                //câu if .. else
                //if(điều kiện){thực hiện logic1} else {thực hiện logic2}

                int a = 8;
                int b = 10;
                if(a > b) {
                    System.out.println("số a lớn hơn số b");
                }else {
                    System.out.println("số b lớn hơn số a");
                }
                //yêu cầu: viết chương trình cho phép người dùng nhập vào số tuổi, kiểm tra xem đã đủ tuổi học đại học chưa
                System.out.println("Nhập tuổi người dùng:");
                Scanner scanner = new Scanner(System.in);
                int tuoi = scanner.nextInt();
                //ktra đủ tuổi
                if(tuoi > 18) {
                    System.out.println("Người dùng đủ tuổi học đại học");
                }else {
                    System.out.println("Người dùng chưa đủ tuổi học đại học");
                }

                //toán tử 3 ngôi -> điều kiện ? thực hiện logic 1 : thực hiện logic 2
        // toán tử 3 ngôi không dùng cho các điều kiện và logic phức tạp
//                String result = (tuoi > 18) ? "Người dùng đủ tuổi học đại học" : "Người dùng chưa đủ tuổi học đại học";
//                System.out.println(result);
                //if(điều kiện1){thực hiện logic 1}else if(điều kiện 2){thực hiện logic 2}else {logic3}
               int c = 10;
               if(c == 10){
                   System.out.println("số 10");
               } else if(c == 11){
                   System.out.println("số 11");
               }else if(c == 12){
               }System.out.println("vui lòng nhập lại số");

            }
        }




