package oop;

public class Main {
    public static void main(String[] args) {
    //tạo ra 1 đối tượng là user
      User nguoiDung = new User("Hưng", 22, "0762549250");//new ở đây là khởi tạo mới từ lớp User
      nguoiDung.displayInfo();
      User nguoiDung2 = new User("Tiên", 18, "0123456789");
        nguoiDung2.displayInfo();

    }
}
