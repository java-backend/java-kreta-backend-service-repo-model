package service;

import model.LearnClassSubject;
import model.SchoolClass;
import model.Subject;
import repo.LearnClassSubjectRepo;
import repo.SchoolClassesRepo;
import repo.SubjectRepo;

public class LearnClassSubjectService {

    private SubjectRepo subjectRepo;
    private SchoolClassesRepo schoolClassesRepo;
    private LearnClassSubjectRepo learnClassSubjectRepo;

    public LearnClassSubjectService() {
        subjectRepo=new SubjectRepo();
        schoolClassesRepo=new SchoolClassesRepo();
        learnClassSubjectRepo=new LearnClassSubjectRepo();
    }

    public Subject getSubjectByClass(int schoolClass, char schoolType) {
        //1. Osztály id az évfolyam és osztálytípus alapján
        long schoolClassId=schoolClassesRepo.getId(schoolClass,schoolType);

        //2. A LearClassSubject repoból azon tantáryg azonosítók listája
        //   amelyek az osztály id-hez tartoznak



        //3. Tantárgyak listája a megkapott tantárgy azonosítók alapján


        return null;
    }

}
