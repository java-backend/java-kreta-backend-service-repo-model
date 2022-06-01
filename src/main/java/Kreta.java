import model.Parent;
import model.TeacherInfo;
import repo.LearnClassSubjectRepo;
import repo.ParentsRepo;
import repo.SchoolClassesRepo;
import repo.TeachersRepo;
import service.HeadTeacherService;
import service.LearnClassSubjectService;

import java.util.List;

public class Kreta {
    public static void main(String[] args) {

        // Repository
        SchoolClassesRepo schoolClassesRepo=new SchoolClassesRepo();
        ParentsRepo parentsRepo=new ParentsRepo();
        TeachersRepo teachersRepo=new TeachersRepo();

        //Service
        HeadTeacherService headTeacherService=new HeadTeacherService();
        LearnClassSubjectService learnClassSubjectService = new LearnClassSubjectService();

        //SchoolClass
        long numberOfClass=schoolClassesRepo.getNumberOfSchoolClass(9);
        long numberOfClassType=schoolClassesRepo.getNumberOfSchoolType('c');

        //Parent
        List<Parent> resultParents = parentsRepo.getParents(true);
        resultParents.stream().forEach(System.out::println);

        //Teacher
        List<TeacherInfo> resultTeacherInfo=teachersRepo.getTeacherInfo(false);
        resultTeacherInfo.stream().forEach(System.out::println);
        System.out.println(headTeacherService.getHeadTeacherOfClass(9,'b'));

        learnClassSubjectService.getSubjectsByClass(9,'a').stream().forEach(System.out::println);

    }
}
