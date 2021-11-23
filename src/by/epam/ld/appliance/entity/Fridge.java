package by.epam.ld.appliance.entity;

import java.util.Objects;

public class Fridge extends Appliance {

    private String type;
    private Boolean freezer;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Boolean getFreezer() {
        return freezer;
    }

    public void setFreezer(Boolean freezer) {
        this.freezer = freezer;
    }

    public Fridge(String name, int price, String type, Boolean freezer) {
        super(name, price);
        this.type = type;
        this.freezer = freezer;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Fridge)) return false;
        if (!super.equals(o)) return false;
        Fridge fridge = (Fridge) o;
        return Objects.equals(getType(), fridge.getType()) && Objects.equals(getFreezer(), fridge.getFreezer());
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getType(), getFreezer());
    }

    public String toString() {
        return super.toString() + ", type= " + type + ", freezer needed=" + freezer + ';';
    }
}
