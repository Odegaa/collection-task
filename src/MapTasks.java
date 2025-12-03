import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

public class MapTasks {

    // 1 task

    protected HashMap<Integer, String> setMap() {
        HashMap<Integer, String> map = new HashMap<>();
        map.put(1, "One");
        map.put(2, "Two");
        map.put(3, "Three");
        map.put(4, "Four");
        map.put(5, "Five");
        return map;
    }

    protected void getMap() {
        setMap().forEach((s, v) -> System.out.println("Key: " + s + " value = " + v));
    }

    protected void mapSize() {
        System.out.println("Map size: " + setMap().size());
    }

    // 2 task

    protected HashMap<Integer, Integer> sliceMaps() {
        HashMap<Integer, Integer> firstMap = new HashMap<>();

        firstMap.put(1, 10);
        firstMap.put(2, 20);
        firstMap.put(3, 30);
        firstMap.put(4, 40);
        firstMap.put(5, 50);

        HashMap<Integer, Integer> secondMap = new HashMap<>(firstMap);

        secondMap.put(4, 40);
        secondMap.put(5, 50);
        secondMap.put(6, 60);
        secondMap.put(7, 70);

        return secondMap;
    }

    protected void getValues() {
        sliceMaps().forEach((_, v) -> System.out.println("Value = " + v));
    }

    protected void clearMap() {
        setMap().clear();
    }

    // 3 task

    protected HashMap<Integer, Integer> cloneMap() {
        HashMap<Integer, Integer> firstMap = new HashMap<>();
        firstMap.put(1, 10);
        firstMap.put(2, 20);
        firstMap.put(3, 30);
        firstMap.put(4, 40);
        firstMap.put(5, 50);

        return new HashMap<>((HashMap<Integer, Integer>) firstMap.clone());
    }

    protected ArrayList<Integer> mapToArrayList() {
        ArrayList<Integer> list = new ArrayList<>();
        cloneMap().forEach((k, v) -> {
            list.add(v);
        });

        return list;
    }

    // 4 task

    protected TreeMap<Integer, String> setTreeMap() {
        TreeMap<Integer, String> treeMap = new TreeMap<>();
        treeMap.put(1, "Alex");
        treeMap.put(2, "Bernard");
        treeMap.put(3, "Edward");
        treeMap.put(4, "Odegaa");

        return treeMap;
    }

    protected void getFirstLastItems() {
        System.out.println(setTreeMap().firstEntry());
        System.out.println(setTreeMap().lastEntry());
    }

    protected void getKeysByDescSort() {
        System.out.println(setTreeMap().descendingKeySet());
    }

    // 5 task

    protected void getItemsWithParameterKey(int tempKey) {
        System.out.println(setTreeMap().headMap(tempKey));
    }

    protected void changeToSet() {
        System.out.println(new TreeSet<>(setTreeMap().keySet()));
    }

    protected void clearTreeMap() {
        HashMap<Integer, String> map = new HashMap<>();
        map.put(1, "One");
        map.put(2, "Two");
        map.put(3, "Three");
        map.put(4, "Four");
        map.put(5, "Five");

        map.clear();

        System.out.println(map);
    }
}
