package ua.lviv.iot.buildingproject.models;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import ua.lviv.iot.buildingproject.enums.Country;
import ua.lviv.iot.buildingproject.enums.Purpose;

@EqualsAndHashCode(callSuper = true)
@Data
@ToString(callSuper = true)
public class Stadium extends Building {
    private boolean real_grass;
    private boolean open_air;

    public Stadium(int id, String name, int price, Country country, int year, int capasity,
                   Purpose purpose, int size_in_sq_m, boolean real_grass, boolean open_air) {
        super(id, name, price, country, year, capasity, purpose, size_in_sq_m);
        this.real_grass = real_grass;
        this.open_air = open_air;
    }
}
