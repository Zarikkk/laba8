package models;
import enums.Country;
import enums.Purpose;
import lombok.Data;

@Data
public abstract class Building {
    public String name;
    public int price;
    public Country country;
    public int year;
    public int capasity;
    public Purpose purpose;
    public int size_in_sq_m;

    Building(String name, int price, Country country, int year, int capasity,
             Purpose purpose, int size_in_sq_m) {
        this.name = name;
        this.price = price;
        this.country = country;
        this.year = year;
        this.capasity = capasity;
        this.purpose = purpose;
        this.size_in_sq_m = size_in_sq_m;
    }

    protected Building() {
    }
}
