package ua.lviv.iot.buildingproject.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import ua.lviv.iot.buildingproject.models.Building;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import lombok.Data;
import ua.lviv.iot.buildingproject.service.BuildingService;

import java.util.*;

@RequestMapping("/building")
@RestController
public class BuildingController {
    private BuildingService buildingService;
    @Autowired
    public BuildingController(BuildingService buildingService){
        this.buildingService = buildingService;

    }
    @PostMapping
    public ResponseEntity<Object> addBuildings(@RequestBody Building building){

        return ResponseEntity.ok(Collections.singletonMap("id", buildingService.addBuildings(building)));
    }

    @GetMapping
    public Collection<Building>getBuildings(){
        return buildingService.getBuildings();
    }

    @GetMapping("{id}")
    public ResponseEntity<Building> getBuilding(@PathVariable("id") int id){
        Building building = buildingService.getBuilding(id);
        if(building != null)
            return ResponseEntity.ok(building);
        return ResponseEntity.notFound().build();
    }

    @DeleteMapping("{id}")
    public ResponseEntity<Object> deleteBuilding(@PathVariable("id") int id){
        if(buildingService.deleteBuilding(id) != -1)
            return ResponseEntity.ok(Collections.singletonMap("id", id));
        return ResponseEntity.notFound().build();
    }

    @PutMapping("{id}")
    public ResponseEntity<Building> updateBuilding(@RequestBody Building newBuilding, @PathVariable("id") int id){
        Building oldBuilding = buildingService.updateBuilding(newBuilding, id);
        if(oldBuilding != null)
            return ResponseEntity.ok(oldBuilding);
        return ResponseEntity.notFound().build();
    }

}
