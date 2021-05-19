package manager;
import lombok.AllArgsConstructor;
import models.Building;
import enums.Country;
import enums.Purpose;


import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

@AllArgsConstructor
public class OlympicsManager {
    private final List<Building> allObjects;

    public List<Building> sortByName(boolean sortOrder) {
        List<Building> allObjectsSorted = new ArrayList<>(allObjects);
        if (sortOrder) {
            allObjectsSorted.sort(Comparator.comparing(Building::getName));
        } else {
            allObjectsSorted.sort((object1, object2) -> object2.getName().compareTo(object1.getName()));
        }
        return allObjectsSorted;
    }

    public List<Building> sortByCapasity() {
        return allObjects.stream().filter(object -> object.getCapasity() >= 100 && object.getCapasity() <= 1000).collect(Collectors.toList());
    }


    public static void printSortedObjects(List<Building> allObjects) {
        allObjects.forEach(System.out::println);
    }
}
