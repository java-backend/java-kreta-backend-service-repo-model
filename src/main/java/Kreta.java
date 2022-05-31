import model.Parent;
import model.Teacher;
import repo.ParentsRepo;
import repo.StudentRepo;

import java.util.List;

public class Kreta {
    public static void main(String[] args) {

        ParentsRepo parentsRepo=new ParentsRepo();
        // 3. feladat eredmenye
        List<Parent> results = parentsRepo.getParents(true);
        //for (Parent result : results ){
        //    System.out.println(result.toStringIdFullName());
        //}

        results.stream().forEach(System.out::println);
    }
}
