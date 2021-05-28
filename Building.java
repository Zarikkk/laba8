package ua.lviv.iot.buildingproject.models;
import lombok.NoArgsConstructor;
import ua.lviv.iot.buildingproject.enums.Country;
import ua.lviv.iot.buildingproject.enums.Purpose;

import lombok.AllArgsConstructor;
import lombok.Data;
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Building {
    private int id;
    public String name;
    public int price;
    public Country country;
    public int year;
    public int capasity;
    public Purpose purpose;
    public int size_in_sq_m;
}