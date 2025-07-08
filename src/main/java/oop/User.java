package oop;
//tinh đóng gói
public class User {
    //thuộc tính
    private String name;
    private int age;
    private String phonenum;

    //constructor dùng để khởi tạo name, age, soDT
    public User( String name, int age, String phonenum){
        this.name = name;//con trỏ this, name được nhận từ người dùng nhập
        this.age = age;
        this.phonenum = phonenum;
    }
    //phương thức
    // getter và
    //tạo phương thức public để lấy giá trị
    public String getName(){
        return name;
    };
    public int getAge(){
        return age;
    };
    public String getPhonenum(){
        return phonenum;
    };

    //tạo phương thức để hiện thị thông tin người dùng
    public void displayInfo(){
        System.out.println("User name: " + name + "; Age: " + age + "; Số điện thoại: " + phonenum);
    }

}
