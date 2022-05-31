package model;

import java.util.Date;
import java.util.List;

public class Grade {
    private int teacherId;
    private int subjectId;
    private int studentId;

    private List<Integer> grades;

    public Grade(int teacherId, int subjectId, int studentId, List<Integer> grades) {
        this.teacherId = teacherId;
        this.subjectId = subjectId;
        this.studentId = studentId;
        this.grades = grades;
    }
}