package by.epam.ld.appliance.entity;

import java.util.Objects;

public class TV extends Appliance{

    private String type;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public TV(String name, int price, String type) {
        super(name, price);
        this.type=type;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof TV)) return false;
        if (!super.equals(o)) return false;
        TV tv = (TV) o;
        return getType().equals(tv.getType());
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getType());
    }

    public String toString() {
        return super.toString() +", type= " + type + ';';
    }

}
