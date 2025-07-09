package BaitapJava.Haisao;

import java.util.Scanner;

public class Baitap2 {
    // Hàm kiểm tra chuỗi đối xứng
    public static boolean isPalindrome(String str) {
        // Loại bỏ khoảng trắng và chuyển hết về chữ thường
        String cleaned = str.replaceAll("\\s+", "").toLowerCase();

        int left = 0;
        int right = cleaned.length() - 1;

        while (left < right) {
            if (cleaned.charAt(left) != cleaned.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập chuỗi: ");
        String input = scanner.nextLine();

        if (isPalindrome(input)) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }
}
