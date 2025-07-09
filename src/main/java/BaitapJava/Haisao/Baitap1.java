package BaitapJava.Haisao;

import java.util.Scanner;

public class Baitap1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Thu nhập cá nhân trong một năm:");
        int n = scanner.nextInt();
        if(n < 0){
            System.out.println("Yêu cầu nhập lại thu nhập cá nhân trong một năm");
            n = scanner.nextInt();
        }
        totalTax(n);
    }
    static int tax(int luong){
        int x = 1000000;
        if(luong > 0 && luong <= 5*x){
            return 5;
        }else if(luong > 5*x && luong <= 10*x){
            return 10;
        }else if(luong > 10*x && luong <= 18*x){
            return 15;
        }else if(luong > 18*x && luong <= 32*x){
            return 20;
        }else if(luong > 32*x && luong <= 52*x){
            return 25;
        }else if(luong > 52*x && luong <= 80*x){
            return 30;
        }else{
            return 35;
        }
    }
    static void totalTax(int luong){
        System.out.println("Mức thuế là "+ tax(luong) +"% Thuế thu nhập cá nhân 1 năm là: "+ ((long) luong * tax(luong) / 100));
    }
}
