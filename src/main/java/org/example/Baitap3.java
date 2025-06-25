package org.example;

import java.util.Scanner;

public class Baitap3 {
    static double tongDiem(double toan, double ly, double hoa){
        double dtb = (toan + ly + hoa)/3;
        return dtb;
    }

    static String xepLoai (double dtb){
        String result = "";
        if(dtb>0 && dtb <=5){
            result = "Học sinh yếu";
        }else if(dtb > 5.1 && dtb <= 6) {
            result ="Học sinh trung bình";
        }else if(dtb > 6.1 && dtb <= 7) {
            result ="Học sinh khá";
        }else if(dtb > 7.1 && dtb <= 8) {
            result ="Học sinh giỏi";
        }else if(dtb > 8.1 && dtb <=10) {
            result ="Học sinh xuất sắc";
        }else {
            result ="vui lòng nhập lại";
        }
        return result;
    }
    public static void main(String[] args) {
         //nhập điểm toán lý hoá
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập điểm toán");
        double toan = scanner.nextDouble();
        System.out.println("nhập điểm lý");
        double ly = scanner.nextDouble();
        System.out.println("nhập điểm hoá");
        double hoa = scanner.nextDouble();
        //tính dtb
        double dtb = tongDiem (toan, ly, hoa);
        String danhGia = xepLoai(dtb);
        System.out.println("Xếp loại học sinh: " + danhGia);

        // đánh giá hsinh
        // <5: hs yếu; 5.1 - 6: hs trung bình; 6.1 - 7: hs khá; 7.1 - 8: hs giỏi; 8.1 - 10: hs xuất sắc
        // lưu ý: tách hàm tính dtb và tách hàm xếp loại
    }
}
