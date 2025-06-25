package org.example;

public class Mang {
    public static void main(String[] args) {
        //int num1 = 10;
//        int num2 = 20;
        //khởi tạo giá trị
        int[] numbers = {10,20,30,40};
        String[] name = {"Thành", "Tuyến", "Giang"};
        //                  0          1       2
        System.out.println(name[1]);
        name[2] = "Khải";
        System.out.println(name[2]);

        //độ dài của mảng
        int length = name.length;
        System.out.println("độ dài của mảng: " + length);

        //duyệt mảng dùng lặp for
        for(int i = 0; i < name.length; i++){
            System.out.println("Tên thứ " + (i+1) + ": " +name[i]);
        }

        //duyệt mảng dùng lặp for-each (chỉ dùng trong mảng)
        for(int number: numbers){
            System.out.println(number);
        }

        //nâng cao: duyệt mảng ngược
        for(int index = numbers.length - 1; index >= 0; index-- ){
            System.out.println(numbers[index]);
        }

    }
}
