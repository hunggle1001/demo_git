package BaitapJava.Basao;

import java.util.Scanner;

public class Baitap1 {
    public static int[] twoSum(int[] numbers, int target) {
        int left = 0;
        int right = numbers.length - 1;

        while (left < right) {
            int sum = numbers[left] + numbers[right];

            if (sum == target) {
                // Cộng thêm 1 vì index đề bài bắt đầu từ 1
                return new int[]{left + 1, right + 1};
            } else if (sum < target) {
                left++;
            } else {
                right--;
            }
        }

        return new int[]{-1, -1}; // Không tìm thấy
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Nhập mảng từ người dùng
        System.out.print("Nhập số phần tử của mảng: ");
        int n = scanner.nextInt();
        int[] numbers = new int[n];

        System.out.println("Nhập các phần tử (theo thứ tự tăng dần):");
        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextInt();
        }

        System.out.print("Nhập target: ");
        int target = scanner.nextInt();

        int[] result = twoSum(numbers, target);

        if (result[0] == -1) {
            System.out.println("Không tìm thấy cặp số có tổng bằng target.");
        } else {
            System.out.println("Vị trí hai số là: [" + result[0] + ", " + result[1] + "]");
        }
    }
}
