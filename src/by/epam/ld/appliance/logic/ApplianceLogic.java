package by.epam.ld.appliance.logic;

import by.epam.ld.appliance.entity.Appliance;

import java.util.ArrayList;
import java.util.List;

public class ApplianceLogic {

    public List<Appliance> findByContext(List<Appliance> appliances, String context) {

        List<Appliance> appList = new ArrayList<Appliance>();

        for (Appliance appliance : appliances) {
            if (appliance.getName().contains(context) || String.valueOf(appliance.getPrice()).contains(context)) {
                appList.add(appliance);
            }
        }

        return appList;
    }

    public List<Appliance> findByPrice(List<Appliance> appliances, int price1, int price2) {
        List<Appliance> appList = new ArrayList<Appliance>();

        for (Appliance appliance : appliances) {
            if (appliance.getPrice() >= price1 && appliance.getPrice() <= price2) {
                appList.add(appliance);
            }
        }

        return appList;
    }

}
