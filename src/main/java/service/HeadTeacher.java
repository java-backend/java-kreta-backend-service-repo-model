package service;

import model.Teacher;
import repo.SchoolClassesRepo;
import repo.TeachersRepo;

public class HeadTeacher {
    private SchoolClassesRepo schoolClassesRepo;
    private TeachersRepo teachersRepo;

    public HeadTeacher() {
        schoolClassesRepo=new SchoolClassesRepo();
        teachersRepo=new TeachersRepo();
    }

    public Teacher getHeadTeacherOfClass(int schoolClass, char classType) {
        //return this.teachersRepo
        //   .getTeacherById(this.schoolClassesRepo.getHeadTeacherIdByClass(schoolClass, gradeType));
        long headTeacherId=schoolClassesRepo.getHeadTeacherIdByClass(schoolClass,classType);
        return teachersRepo.getTeacherById(headTeacherId);

    }
}
