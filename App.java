package org.example;
import enums.Country;
import enums.Purpose;
import models.Building;
import models.Rink;
import models.Springroad;
import models.Stadium;
import manager.OlympicsManager;

import java.util.List;

public class App {
    public static void main(final String[] args) {
        List<Building> allObjects = List.of(
                new Rink("Ice arena", 250000, Country.BRAZILL, 2009,
                        500, Purpose.ICE_SCATING,100, true, "plastic"),
                new Springroad("Springer", 3000, Country.ENGLAND, 2012,
                        350, Purpose.SKIING, 60, 150, 60),
                new Stadium("Ali arena", 6000, Country.CHINA, 2020,
                        1001, Purpose.FOOTBALL, 100,false, false )
        );

        OlympicsManager olympicsManager = new OlympicsManager(allObjects);

        System.out.println("Sorting by name\n");
        OlympicsManager.printSortedObjects(olympicsManager.sortByName(true));
        System.out.println("--------------------------------------------");

        System.out.println("Sorting by capasity\n");
        OlympicsManager.printSortedObjects(olympicsManager.sortByCapasity());
        System.out.println("--------------------------------------------");


    }
}
