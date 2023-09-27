package ra.model;

import java.util.Scanner;

public class Mark {

    private static int nextId = 1;
    private int markId;
    private Student student;
    private Subject subject;
    private double point;

    public Mark() {
    }

    public Mark(int markId, Student student, Subject subject, double point) {
        this.markId = markId;
        this.student = student;
        this.subject = subject;
        this.point = point;
    }

    public static int getNextId() {
        return nextId;
    }

    public static void setNextId(int nextId) {
        Mark.nextId = nextId;
    }

    public int getMarkId() {
        return markId;
    }

    public void setMarkId(int markId) {
        this.markId = markId;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public Subject getSubject() {
        return subject;
    }

    public void setSubject(Subject subject) {
        this.subject = subject;
    }

    public double getPoint() {
        return point;
    }

    public void setPoint(double point) {
        this.point = point;
    }


    public void inputData(Scanner scanner ) {

        System.out.print("Nhập điểm số (từ 0 đến 10): ");
        this.point = scanner.nextDouble();
        while (this.point < 0 || this.point > 10) {
            System.out.println("Điểm số không hợp lệ. Vui lòng nhập lại.");
            System.out.print("Nhập điểm số (từ 0 đến 10): ");
            this.point = scanner.nextDouble();
        }
    }
    public void displayData() {
        System.out.println("ID điểm: " + this.markId);
        System.out.println("Tên học sinh: " + this.student.getStudentName());
        System.out.println("Tên môn học: " + this.subject.getSubjectName());
        System.out.println("Điểm số: " + this.point);
    }
}
