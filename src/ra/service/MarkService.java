package ra.service;

import ra.model.Mark;

import java.util.ArrayList;

import java.util.List;

public class MarkService {
    public static List<Mark> marks = new ArrayList<>();

    public static List<Mark> getMarks() {
        return marks;
    }

    public static void addMark(Mark mark) {
        marks.add(mark);
    }


}
