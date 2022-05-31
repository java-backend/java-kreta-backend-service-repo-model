package model;


public class SchoolClass {
    private int id;
    private int schoolClass;
    private char classType;
    private int teacherId;

    public SchoolClass(int id, int schoolClass, char classType, int teacherId) {
        this.id = id;
        this.schoolClass = schoolClass;
        this.classType = classType;
        this.teacherId = teacherId;
    }

    public int getId() {
        return id;
    }

    public int getSchoolClass() {
        return schoolClass;
    }

    public char getClassType() {
        return classType;
    }

    public int getTeacherId() {
        return teacherId;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setSchoolClass(int schoolClass) {
        this.schoolClass = schoolClass;
    }

    public void setClassType(char classType) {
        this.classType = classType;
    }

    public void setTeacherId(int teacherId) {
        this.teacherId = teacherId;
    }
}


