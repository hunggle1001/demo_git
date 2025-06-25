package org.example;

import java.util.Scanner;

public class TinhTienDien {
    public static void main(String[] args) {
        //Nhập tên người dùng và số Kw
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Nhập tên khách hàng");
//        String user = scanner.nextLine();
//        System.out.println("Nhập số Kw");
//        float Kw = scanner.nextFloat();
//        float tien = 0;
//        //Tính tiền điện
//        if (Kw <= 50 && Kw >0) {
//            tien = Kw * 500;
//        }else if(Kw > 50 && Kw <= 100) {
//            tien = 50 * 500 + (Kw-50) * 650;
//        }else if(Kw > 100 && Kw <= 200) {
//            tien = 50 * 500 + 50 * 650 + (Kw - 100) * 850;
//        }else if(Kw >200 && Kw <=350) {
//            tien = 50 * 500 + 50 *650 + 100 * 850 + (Kw - 200) * 1100;
//        }else if(Kw > 350){
//            tien = 50 * 500 + 50 * 650 + 100 * 850 + 150 * 1100 + (Kw - 350) * 1300;
//        }else {
//            System.out.println("vui lòng nhập lại");
//        }
//        System.out.println("Khách hàng " + user + "có số tiền điện phải đóng là: " + tien);
        //switch case
        //gán biến (int a = 10)
        //switch (a) {
        //case (giá trị 1): -> thực hiện logic
        //System.out.println("false");
        //breal

        int d = 7;
        switch (d) {
            case 5:
                System.out.println("số 5");
                break;
            case 10:
                System.out.println("số 10");
                break;
            default:
                System.out.println("vui lòng kiểm tra lại");
        }
        //lưu ý: nên sử dụng sw casr khi nào, khi giá trị so sánh là giá trị cụ thể, điều kiện đơn  (==), không nên dùng với điều kiện ss >,<


    }
}
