package org.example;

import java.util.Scanner;

public class BaiTap {
    public static void main(String[] args) {
        //viết chương trình kiểm tra học sinh, cho phép nhập vào điểm toán lý hoá, sau đó tính điểm trung bình
        // dtb <5 => hsinh yếu,
        // 5,1-6: hsinh tbinh
        // 6,1-7: hsinh khá
        // 7,1-8: hsinh giỏi
        // 8,1 -10: hsinh xuất sắc
        Scanner scanner = new Scanner(System.in);
        //nhập điểm toán lý hoá
        System.out.println("Nhập điểm hoá");
        float diemHoa = scanner.nextFloat();
        System.out.println("Nhâp điểm toán");
        float diemToan = scanner.nextFloat();
        System.out.println("NHập điểm lý");
        float diemLy = scanner.nextFloat();
        //tính điểm trung bình
        float dtb = (diemHoa + diemLy + diemToan) / 3;
        System.out.println("Điểm trung bình là :" + dtb);
        //xếp loại
        if(dtb <= 5 && dtb > 0){
            System.out.println("Học sinh yếu");
        }else if(dtb > 5.1 && dtb <= 6) {
            System.out.println("Học sinh trung bình");
        }else if(dtb > 6.1 && dtb <= 7) {
            System.out.println("Học sinh khá");
        }else if(dtb > 7.1 && dtb <= 8) {
            System.out.println("Học sinh giỏi");
        }else if(dtb > 8.1 && dtb <=10) {
            System.out.println("Học sinh xuất sắc");
        }else {
            System.out.println("vui lòng nhập lại");
        }
    }
}
