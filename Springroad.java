package models;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import enums.Country;
import enums.Purpose;

@EqualsAndHashCode(callSuper = true)
@Data
@ToString(callSuper = true)
public class Springroad extends Building {
    private int hight_in_sq_m;
    private int steepness;

    public Springroad(String name, int price, Country country, int year, int capasity,
                      Purpose purpose, int size_in_sq_m, int hight_in_sq_m, int steepness) {
        super(name, price, country, year, capasity, purpose, size_in_sq_m);
        this.hight_in_sq_m = hight_in_sq_m;
        this.steepness = steepness;
    }
}

