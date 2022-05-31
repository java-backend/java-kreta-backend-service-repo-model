package repo;

import model.Subject;

import java.util.List;

public class SubjectRepo {
    private List<Subject> subjects;



    public void MakeTestData() {

        subjects.add(new Subject(1, "Informatika"));
        subjects.add(new Subject(2, "Angol"));
        subjects.add(new Subject(3, "Matematika"));
        subjects.add(new Subject(4, "Fizika"));
        subjects.add(new Subject(5, "Testnevelés"));
        subjects.add(new Subject(6, "Történelem"));
        subjects.add(new Subject(7, "Magyar nyelv és Irodalom"));
    }


}

