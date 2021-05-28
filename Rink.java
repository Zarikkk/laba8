package ua.lviv.iot.buildingproject.models;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import ua.lviv.iot.buildingproject.enums.Country;
import ua.lviv.iot.buildingproject.enums.Purpose;

@EqualsAndHashCode(callSuper = true)
@Data
@ToString(callSuper = true)
public class Rink extends Building{
    private boolean open_air;
    private String material;

    public Rink(int id, String name, int price, Country country, int year, int capasity,
                Purpose purpose, int size_in_sq_m, boolean open_air, String material) {
        super(id, name, price, country, year, capasity, purpose, size_in_sq_m);
        this.open_air = open_air;
        this.material = material;
    }
}
