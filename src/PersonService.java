import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class PersonService {
    HashSet<PersonDAO> daos = new HashSet<>();

    // 1 task

    protected void setItems(PersonDAO person) {
        daos.add(person);
    }

    protected HashSet<PersonDAO> getItems() {
        return daos;
    }

    protected void getItemsByIterator() {
        Iterator<PersonDAO> list = daos.iterator();
        while (list.hasNext()) {
            PersonDAO person = list.next();
            System.out.println(person);
        }
    }

    protected List<PersonDAO> getItemsByDesc() {
        List<PersonDAO> newList = new ArrayList<>(daos);
        newList.sort(Comparator.comparing(PersonDAO::getId).reversed());

        return newList;
    }

    // 2 task

    protected int getSizeList() {
        return daos.size();
    }

    protected boolean checkHashSet() {
        return daos.isEmpty();
    }

    protected String clearHashSet() {
        daos.clear();
        return "Full cleared Hash set";
    }

    // 3 task

    protected HashSet<PersonDAO> cloneItems() {
        return (HashSet<PersonDAO>) daos.clone();
    }

    protected ArrayList<PersonDAO> getItemsWithArrayList() {
        return new ArrayList<>(daos);
    }

    protected ArrayList<PersonDAO> getItemsByEven() {
        ArrayList<PersonDAO> list = getItemsWithArrayList();
        return IntStream.range(0, list.size())
                .filter(i -> i % 2 == 0)
                .mapToObj(list::get)
                .collect(Collectors.toCollection(ArrayList::new));
    }

    // 4 Task

    protected ArrayList<Integer> getSimilarItems() {
        HashSet<Integer> firstSet = new HashSet<>(List.of(1, 2, 3, 4, 5, 6));
        HashSet<Integer> secondSet = new HashSet<>(List.of(4, 5, 6, 7));

        HashSet<Integer> set = new HashSet<>(firstSet);
        set.retainAll(secondSet);
        return new ArrayList<>(set);
    }

    protected ArrayList<Integer> getNotSimilarItems() {
        HashSet<Integer> firstSet = new HashSet<>(List.of(1, 2, 3, 4, 5, 6));
        HashSet<Integer> secondSet = new HashSet<>(List.of(4, 5, 6, 7));

        HashSet<Integer> onlyFirstSet = new HashSet<>(firstSet);
        onlyFirstSet.removeAll(secondSet);

        HashSet<Integer> onlySecondSet = new HashSet<>(secondSet);
        onlySecondSet.removeAll(firstSet);

        onlyFirstSet.addAll(onlySecondSet);

        return new ArrayList<>(onlyFirstSet);
    }

    // 5 task

    protected ArrayList<Integer> getFirstItemsList() {
        HashSet<Integer> firstList = new HashSet<>(List.of(1, 2, 3));
        HashSet<Integer> secondList = new HashSet<>(List.of(3, 4, 5));

        HashSet<Integer> onlyFirst = new HashSet<>(firstList);
        onlyFirst.removeAll(secondList); // [1, 2];

        return new ArrayList<>(onlyFirst);
    }

    protected ArrayList<Integer> getSecondItemsList() {
        HashSet<Integer> firstList = new HashSet<>(List.of(1, 2, 3));
        HashSet<Integer> secondList = new HashSet<>(List.of(3, 4, 5));

        HashSet<Integer> onlySecond = new HashSet<>(secondList);
        onlySecond.removeAll(firstList);

        return new ArrayList<>(onlySecond);
    }

    protected ArrayList<Integer> getEvenDigitItems() {
        HashSet<Integer> firstList = new HashSet<>(List.of(1, 2, 3, 6));
        HashSet<Integer> secondList = new HashSet<>(List.of(3, 4, 5));

        firstList.addAll(secondList);

        return firstList.stream()
                .filter(item -> item % 2 == 0)
                .collect(Collectors
                        .toCollection(ArrayList::new));
    }

}
