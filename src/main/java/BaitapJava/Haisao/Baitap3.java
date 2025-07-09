package BaitapJava.Haisao;

import java.util.Scanner;

public class Baitap3 {
    public static String removeDuplicateChars(String input) {
        String result = "";
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            // Nếu ký tự chưa từng xuất hiện thì thêm vào kết quả
            if (result.indexOf(ch) == -1) {
                result += ch;
            }
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập chuỗi: ");
        String input = scanner.nextLine();

        String output = removeDuplicateChars(input);
        System.out.println("Chuỗi sau khi xóa ký tự lặp: " + output);
    }
}
