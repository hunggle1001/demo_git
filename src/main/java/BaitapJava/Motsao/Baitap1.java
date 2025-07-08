package BaitapJava.Motsao;

import java.util.Scanner;

public class Baitap1 {
    public static String removeVowels(String input) {
        String result = "";

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);

            // Kiểm tra nếu không phải nguyên âm thì mới thêm vào kết quả
            if (ch != 'a' && ch != 'e' && ch != 'i' && ch != 'o' && ch != 'u' &&
                    ch != 'A' && ch != 'E' && ch != 'I' && ch != 'O' && ch != 'U') {
                result += ch;
            }
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input: ");
        String chuoi = scanner.nextLine();
        System.out.println("Output: " + removeVowels(chuoi));
    }
}
