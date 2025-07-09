package BaitapJava.Basao;

import java.util.HashMap;
import java.util.Scanner;

public class Baitap3 {
    public static String minWindow(String s, String t) {
        if (s == null || t == null || s.length() < t.length()) return "";

        HashMap<Character, Integer> need = new HashMap<>();
        for (char c : t.toCharArray()) {
            need.put(c, need.getOrDefault(c, 0) + 1);
        }

        int left = 0, right = 0, minLen = Integer.MAX_VALUE;
        int start = 0; // Bắt đầu của kết quả
        int count = 0; // Đếm số ký tự đã khớp

        HashMap<Character, Integer> window = new HashMap<>();

        while (right < s.length()) {
            char c = s.charAt(right);
            window.put(c, window.getOrDefault(c, 0) + 1);

            if (need.containsKey(c) && window.get(c) <= need.get(c)) {
                count++;
            }

            // Khi đã đủ hết các ký tự
            while (count == t.length()) {
                // Cập nhật chuỗi nhỏ nhất
                if (right - left + 1 < minLen) {
                    minLen = right - left + 1;
                    start = left;
                }

                // Bắt đầu co cửa sổ từ bên trái
                char leftChar = s.charAt(left);
                window.put(leftChar, window.get(leftChar) - 1);
                if (need.containsKey(leftChar) && window.get(leftChar) < need.get(leftChar)) {
                    count--;
                }
                left++;
            }

            right++;
        }

        return minLen == Integer.MAX_VALUE ? "" : s.substring(start, start + minLen);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập chuỗi s: ");
        String s = scanner.nextLine();

        System.out.print("Nhập chuỗi t: ");
        String t = scanner.nextLine();

        String result = minWindow(s, t);
        System.out.println("Chuỗi con nhỏ nhất của s chứa tất cả ký tự của t là: " + result);

    }
}
