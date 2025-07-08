package BaitapJava.Motsao;
import java.util.Scanner;
public class Baitap3 {
    // Hàm tính tổng các số chẵn từ 0 đến n
    public static int tongSoChan(int n) {
        int sum = 0;
        for (int i = 0; i <= n; i++) {
            if (i % 2 == 0) {
                sum += i;
            }
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số nguyên dương n: ");
        int n = scanner.nextInt();

        if (n < 0) {
            System.out.println("Vui lòng nhập một số nguyên dương.");
        } else {
            int result = tongSoChan(n);
            System.out.println("Tổng các số chẵn từ 0 đến " + n + " là: " + result);
        }
    }
}
