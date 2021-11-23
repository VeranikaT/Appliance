package by.epam.ld.appliance.print;

import by.epam.ld.appliance.entity.Appliance;

import java.util.List;

public class PrintView {
    public static void print (List<Appliance> appliance) {
        for (int i = 0; i < appliance.size(); i++) {
            Appliance appliances = appliance.get(i);
            System.out.println(appliances.toString());
        }
        System.out.println();
    }
}
