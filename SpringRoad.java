package ua.lviv.iot.buildingproject.models;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import ua.lviv.iot.buildingproject.enums.Country;
import ua.lviv.iot.buildingproject.enums.Purpose;

@EqualsAndHashCode(callSuper = true)
@Data
@ToString(callSuper = true)
public class SpringRoad extends Building {
    private int hight_in_sq_m;
    private int steepness;

    public SpringRoad(int id, String name, int price, Country country, int year, int capasity,
                      Purpose purpose, int size_in_sq_m, int hight_in_sq_m, int steepness) {
        super(id, name, price, country, year, capasity, purpose, size_in_sq_m);
        this.hight_in_sq_m = hight_in_sq_m;
        this.steepness = steepness;
    }
}

