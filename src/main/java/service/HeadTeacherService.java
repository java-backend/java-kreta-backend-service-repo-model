package service;

import model.Teacher;
import repo.SchoolClassesRepo;
import repo.TeachersRepo;

public class HeadTeacherService {
    private SchoolClassesRepo schoolClassesRepo;
    private TeachersRepo teachersRepo;

    public HeadTeacherService() {
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
