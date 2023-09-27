package ra.service;

import ra.model.Subject;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class SubjectService {
    public static List<Subject> subjects = new ArrayList<>();

    public static List<Subject> getSubjects() {
        return subjects;
    }

    public static void addSubject(Subject subject) {
        subjects.add(subject);
    }

    public static void updateSubject(String subjectId, Subject updatedSubject) {
        boolean check = false;
        for (Subject subject : subjects) {
            if (subject.getSubjectId().equals(subjectId)) {

                subject.setSubjectName(updatedSubject.getSubjectName());
                check = true;
                break;
            }
        }
         if(!check){
             System.out.println("ko tìm thấy điểm cần update !!!");

         }
    }

    public static void deleteSubject(String subjectId) {
        boolean check = false;
        Iterator<Subject> iterator = subjects.iterator();
        while (iterator.hasNext()) {
            Subject subject = iterator.next();
            if (subject.getSubjectId().equals(subjectId)) {
                check= true;
                System.out.println("Xóa thành công !!");
                iterator.remove();

            }else {
                check= false;

            }
        }

        if(!check){
            System.out.println("không tìm thấy id môn học cần xóa !!");
        }
    }
}
