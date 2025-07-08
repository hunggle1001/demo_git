package Motsao;

import java.util.Scanner;

public class Baitap4 {

    // Hàm đếm số từ trong chuỗi
    public static int demSotu(String input) {
        // Xoá khoảng trắng đầu/cuối chuỗi (nếu có)
        input = input.trim();

        // Kiểm tra chuỗi rỗng sau khi trim
        if (input.isEmpty()) {
            return 0;
        }

        // Tách chuỗi thành mảng từ bằng dấu cách (1 hoặc nhiều dấu cách)
        String[] words = input.split("\\s+");
        return words.length;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập chuỗi cần đếm từ: ");
        String sentence = scanner.nextLine();

        int count = demSotu(sentence);
        System.out.println("Số từ trong chuỗi là: " + count);

    }
}
