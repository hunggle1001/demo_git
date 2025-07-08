package BaitapJava;
import java.util.Scanner;
public class Baitap5 {
    // Hàm lấy chữ cái đầu của mỗi từ
    public static String getFirstLetters(String input) {
        // Xoá khoảng trắng đầu/cuối
        input = input.trim();

        if (input.isEmpty()) {
            return "";
        }
        // Tách từ theo khoảng trắng
        String[] words = input.split("\\s+");
        StringBuilder result = new StringBuilder();

        for (String word : words) {
            if (!word.isEmpty()) {
                result.append(word.charAt(0));
            }
        }
        return result.toString();
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Input
        System.out.print("Nhập chuỗi: ");
        String input = scanner.nextLine();
        //Output
        String output = getFirstLetters(input);
        System.out.println("Chuỗi các chữ cái đầu là: " + output);
    }
}
