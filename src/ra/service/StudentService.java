package ra.service;

import ra.model.Student;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class StudentService {
    public static List<Student> students = new ArrayList<>();

    public static List<Student> getStudents() {
        return students;
    }

    public static void addStudent(Student student) {
        students.add(student);

    }


    public static void deleteStudent(int studentId) {
        boolean check = false;
        Iterator<Student> iterator = students.iterator();

        while (iterator.hasNext()) {
            Student student = iterator.next();
            if (student.getStudentId() == studentId) {
                iterator.remove();
               check = true;
                break;
            }else {
               check = false;
            }
        }

        if(check){
            System.out.println("xóa thành công");
        }else {
            System.out.println("không tìm thấy sinh viên cần xóa: ");
        }
    }
    public static void updateStudent(int id, Student updatedStudent) {
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getStudentId() == id) {
                students.set(i, updatedStudent);
                break;
            }
        }
    }
}