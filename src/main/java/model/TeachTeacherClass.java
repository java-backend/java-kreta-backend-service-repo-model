package model;

import java.util.Date;

public class TeachTeacherClass {
        private int teacherId;
        private int classId;
        private int numberOfTeachingHours;

    public int getTeacherId() {
        return teacherId;
    }

    public int getClassId() {
        return classId;
    }

    public int getNumberOfTeachingHours() {
        return numberOfTeachingHours;
    }

    public void setTeacherId(int teacherId) {
        this.teacherId = teacherId;
    }

    public void setClassId(int classId) {
        this.classId = classId;
    }

    public void setNumberOfTeachingHours(int numberOfTeachingHours) {
        this.numberOfTeachingHours = numberOfTeachingHours;
    }
}

