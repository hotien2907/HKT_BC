package ra.run;

import ra.model.Mark;
import ra.model.Student;

import ra.model.Subject;
import ra.service.MarkService;
import ra.service.StudentService;
import ra.service.SubjectService;


import java.util.List;
import java.util.Scanner;

import static ra.service.MarkService.marks;
import static ra.service.StudentService.students;
import static ra.service.SubjectService.subjects;


public class SchoolManagement {
  static   Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int choice;
        do{
            System.out.println("************************MUSIC-MANAGEMENT*************************");
            System.out.println("1. Quản lý học sinh");
            System.out.println("2. Quản lý môn học");
            System.out.println("3. Quản lý điểm thi");
            System.out.println("4. Thoát");

            System.out.print("Chọn: ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    handleStudentMenu(scanner,students );
                    break;
                case 2:
                    handleSubjectMenu(scanner,subjects);
                    break;
                case 3:
                    handleMarkMenu(scanner,marks);
                    break;
                case 4:
                    System.out.println("Thoát khỏi chương trình.");
                   break;
                default:
                    System.out.println("Chọn không hợp lệ. Vui lòng chọn lại.");
                    break;
            }
        }while (choice !=4);
    }

    private static void handleStudentMenu(Scanner scanner, List<Student> students) {
        while (true) {
            System.out.println("**********************STUDENT-MANAGEMENT************************");
            System.out.println("1. Thêm mới học sinh");
            System.out.println("2. Hiển thị danh sách tất cả học sinh đã lưu trữ");
            System.out.println("3. Thay đổi thông tin học sinh theo mã id");
            System.out.println("4. Xóa học sinh theo mã id");
            System.out.println("5. Thoát");

            System.out.print("Chọn: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    Student student = new Student();
                    student.inputData(scanner);
                    StudentService.addStudent(student);

                    break;
                case 2:

                    for (Student s : students) {
                        s.displayData();
                        System.out.println("-------------------------");

                    }

                    break;
                case 3:

                    System.out.print("Nhập ID học sinh cần cập nhật: ");
                    int studentId = scanner.nextInt();
                    scanner.nextLine();
                    Student studentToUpdate = null;
                    for (Student s : StudentService.getStudents()) {
                        if (s.getStudentId() == studentId) {
                            studentToUpdate = s;
                            break;
                        }
                    }
                    if (studentToUpdate != null) {
                        studentToUpdate.inputData(scanner);
                        StudentService.updateStudent(studentId, studentToUpdate);
                    } else {
                        System.out.println("Không tìm thấy học sinh có ID " + studentId);
                    }
                    break;
                case 4:
                    System.out.print("Nhập ID học sinh cần xóa: ");
                    int studentIdToDelete = scanner.nextInt();
                    scanner.nextLine();

                    StudentService.deleteStudent(studentIdToDelete);
                    break;
                case 5:
                    System.out.println("Quay lại menu chính.");
                    return;
                default:
                    System.out.println("Chọn không hợp lệ. Vui lòng chọn lại.");
                    break;
            }
        }
    }



    public static void handleSubjectMenu(Scanner scanner, List<Subject> subjects) {
        while (true) {
            System.out.println("**********************SUBJECT-MANAGEMENT************************");
            System.out.println("1. Thêm mới môn học");
            System.out.println("2. Hiển thị danh sách tất cả môn học đã lưu trữ");
            System.out.println("3. Thay đổi thông tin môn học theo mã id");
            System.out.println("4. Xóa môn học theo mã id");
            System.out.println("5. Thoát");

            System.out.print("Chọn: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    Subject subject = new Subject();
                    subject.inputData(scanner);
                    SubjectService.addSubject(subject);
                    break;
                case 2:

                    for (Subject su : subjects) {
                        su.displayData();
                        System.out.println("-------------------------");
                    }
                    break;
                case 3:
                    System.out.print("Nhập ID môn học cần cập nhật: ");
                    String subjectIdToUpdate = scanner.nextLine();

                    Subject updatedSubject = new Subject();

                    SubjectService.updateSubject(subjectIdToUpdate, updatedSubject);
                    updatedSubject.inputData(scanner);
                    break;
                case 4:
                    System.out.print("Nhập ID môn học cần xóa: ");
                    String subjectIdToDelete = scanner.nextLine();

                    SubjectService.deleteSubject(subjectIdToDelete);
                    break;
                case 5:
                    System.out.println("Quay lại menu chính.");
                    return;
                default:
                    System.out.println("Chọn không hợp lệ. Vui lòng chọn lại.");
                    break;
            }
        }
    }




    private static void handleMarkMenu(Scanner scanner, List<Mark> marks) {
        while (true) {
            System.out.println("*********************MARK-MANAGEMENT************************");
            System.out.println("1. Thêm mới điểm thi cho 1 sinh viên");
            System.out.println("2. Hiển thị danh sách tất cả điểm thi theo thứ tự điểm tăng dần");
            System.out.println("3. Thay đổi điểm theo mã id");
            System.out.println("4. Xóa điểm theo mã id");
            System.out.println("5. Hiển thị danh sách điểm thi theo mã môn học");
            System.out.println("6. Hiển thị đánh giá học lực của từng học sinh theo mã môn học");
            System.out.println("7. Thoát");

            System.out.print("Chọn: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:


                    Mark mark1 = new Mark();
                    mark1.inputData(scanner);
                    MarkService.addMark(mark1);

                    break;
                case 2:
                    for (Mark s : marks) {
                        s.displayData();
                        System.out.println("-------------------------");

                    }
                    break;
                case 3:

                    break;
                case 4:

                    break;
                case 5:

                    break;
                case 6:

                    break;
                case 7:
                    System.out.println("Quay lại menu chính.");
                    return;
                default:
                    System.out.println("Chọn không hợp lệ. Vui lòng chọn lại.");
                    break;
            }
        }
    }
}
