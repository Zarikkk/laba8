package ua.lviv.iot.buildingproject.service;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.context.annotation.ApplicationScope;
import ua.lviv.iot.buildingproject.models.Building;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

@Service
@ApplicationScope
public class BuildingService {
    private AtomicInteger id = new AtomicInteger(0);
    private final Map<Integer, Building> buildings = new HashMap<>();


    public int addBuildings(Building building){
        int id = this.id.incrementAndGet();
        building.setId(id);
        buildings.put(building.getId(), building);
        return id;
    }


    public Collection<Building> getBuildings(){
        return buildings.values();
    }


    public Building getBuilding( int id){
        return buildings.get(id);
    }

    public int deleteBuilding( int id){
        Building building = buildings.get(id);
        if(building != null) {
            buildings.remove(id);
            return id;
        }
        return -1;
    }

    public Building updateBuilding(Building newBuilding, int id){
        Building oldBuilding = buildings.get(id);
        if(oldBuilding != null){
            newBuilding.setId(id);
           return buildings.replace(id, newBuilding);
        }
        return null;
    }
}
