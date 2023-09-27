package ra.model;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class Student {
    private static int nextId = 1;
    private int studentId;
    private String studentName;
    private String birthDay;
    private String address;
    private boolean gender;
    private  String phone;

    public Student() {
        this.studentId = nextId++;
    }

    public Student(int studentId, String studentName, String birthDay, String address, boolean gender, String phone) {
        this.studentId = nextId++;
        this.studentName = studentName;
        this.birthDay = birthDay;
        this.address = address;
        this.gender = gender;
        this.phone = phone;
    }


    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(String birthDay) {
        this.birthDay = birthDay;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public boolean isGender() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void inputData(Scanner scanner) {




        do {
            System.out.println("nhập vào tên học sinh:");

            this.studentName = scanner.nextLine();

            if(this.studentName.trim().isEmpty()){
                System.out.println("tên học sinh ko đc để trống.");
            }

        }
        while (this.studentName.trim().isEmpty());
        System.out.print("Nhập ngày sinh (dd/MM/yyyy): ");
    this.birthDay= scanner.nextLine();


        do {
            System.out.println("nhập vào địa chỉ:");

            this.address = scanner.nextLine();

            if(this.address.trim().isEmpty()){
                System.out.println("Địa chỉ ko được để trống:");
            }

        } while (this.address.trim().isEmpty());

        System.out.print("Nhập giới tính (true cho nam, false cho nữ): ");
        this.gender = Boolean.parseBoolean(scanner.nextLine());

        while (true) {
            System.out.print("Nhập số điện thoại (10 hoặc 11 số, bắt đầu bằng số 0): ");
             this.phone = scanner.nextLine();
            if (this.phone.matches("0\\d{9,10}")) {

                break;
            } else {
                System.out.println("Số điện thoại không hợp lệ. Vui lòng thử lại.");
            }
        }

    }





    public void displayData() {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        System.out.println("Mã học sinh: " + studentId);
        System.out.println("Tên học sinh: " + studentName);
        System.out.println("Ngày sinh: " +  birthDay);
        System.out.println("Địa chỉ: " + address);
        System.out.println("Giới tính: " + (gender ? "Nam" : "Nữ"));
        System.out.println("Số điện thoại: " + phone);
    }
}
