package models;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import enums.Country;
import enums.Purpose;

@EqualsAndHashCode(callSuper = true)
@Data
@ToString(callSuper = true)
public class Rink extends Building{
    private boolean open_air;
    private String material;

    public Rink(String name, int price, Country country, int year, int capasity,
                Purpose purpose, int size_in_sq_m, boolean open_air, String material) {
        super(name, price, country, year, capasity, purpose, size_in_sq_m);
        this.open_air = open_air;
        this.material = material;
    }
}
