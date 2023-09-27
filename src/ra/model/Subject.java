package ra.model;

import java.util.Scanner;

public class Subject {
    private  String subjectId;
    private  String subjectName;

    public Subject() {
    }

    public Subject(String subjectId, String subjectName) {
        this.subjectId = subjectId;
        this.subjectName = subjectName;
    }

    public String getSubjectId() {
        return subjectId;
    }

    public void setSubjectId(String subjectId) {
        this.subjectId = subjectId;
    }

    public String getSubjectName() {
        return subjectName;
    }

    public void setSubjectName(String subjectName) {
        this.subjectName = subjectName;
    }


    public void inputData(Scanner scanner) {



        do {
            System.out.print("Nhập mã môn học (MHxxx): ");
            this.subjectId = scanner.nextLine().trim();
            if (!isValidSubjectId(this.subjectId)) {
                System.out.println("Mã môn học không hợp lệ. Vui lòng thử lại.");
            }
        } while (!isValidSubjectId(this.subjectId));


        do {
            System.out.print("Nhập tên môn học: ");
            this.subjectName = scanner.nextLine();

            if(this.subjectName.trim().isEmpty()){
                System.out.println("Tên môn học không được để trống: ");
            }
        }while (this.subjectName.trim().isEmpty());


    }


    private boolean isValidSubjectId(String subjectId) {
        return subjectId.matches("^MH\\d{3}$");
    }


    public void displayData() {
        System.out.println("Mã môn học: " + this.subjectId);
        System.out.println("Tên môn học: " + this.subjectName);
    }
}
