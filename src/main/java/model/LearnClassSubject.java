package model;


public class LearnClassSubject {
    private int classId;
    private int SubjectId;

    public LearnClassSubject(int classId, int subjectId) {
        this.classId = classId;
        SubjectId = subjectId;
    }

    public void setClassId(int classId) {
        this.classId = classId;
    }

    public void setSubjectId(int subjectId) {
        SubjectId = subjectId;
    }

    public int getClassId() {
        return classId;
    }

    public int getSubjectId() {
        return SubjectId;
    }
}

