package repo;

import model.Parent;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import static java.util.stream.Collectors.toList;

public class ParentsRepo {
    private List<Parent> parents;

    public ParentsRepo() {
        parents = new ArrayList<>();
        MakeTestData();
    }

    private void MakeTestData() {
        parents.add(new Parent(1, "Kis", "Szonja", true, new Date(1974, 1, 13)));
        parents.add(new Parent(2, "Nagy", "Imre", false, new Date(1974, 7, 7)));
        parents.add(new Parent(3, "Szabó", "Ida", true, new Date(1974, 8, 9)));
        parents.add(new Parent(4, "Szabó", "Sándor", false, new Date(1974, 11, 24)));
        parents.add(new Parent(5, "Kis", "Éva", true, new Date(1974, 9, 9)));
        parents.add(new Parent(6, "Kertész", "Zoltán", false, new Date(1974, 10, 19)));
        parents.add(new Parent(7, "Olajos", "Magdolna", true, new Date(1974, 8, 30)));
        parents.add(new Parent(8, "Izgalmas", "Márk", false, new Date(1974, 5, 9)));
        parents.add(new Parent(9, "Faégető", "Vilmos", false, new Date(1974, 3, 2)));
        parents.add(new Parent(10, "Törödő", "Tekla", true, new Date(1974, 2, 19)));
        parents.add(new Parent(11, "Magyar", "Helga", true, new Date(1974, 7, 8)));
        parents.add(new Parent(12, "Kertész", "László", false, new Date(1974, 3, 12)));
    }

    public List<Parent> getParents(boolean isWoman) {
        return parents
                .stream()
                .filter(x -> x.isWooman() == isWoman)
                .collect(ArrayList::new, ArrayList::add, ArrayList::addAll);
    }

    public List<String> getNameOfParents(boolean isWoman)	{
        return parents
                .stream()
                .filter(Parent::isWooman)
                .map(x -> x.getFirstName() + " " + x.getLastName())
                .collect(toList());
    }
}