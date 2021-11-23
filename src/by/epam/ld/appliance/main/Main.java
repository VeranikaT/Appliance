package by.epam.ld.appliance.main;


import by.epam.ld.appliance.entity.Appliance;
import by.epam.ld.appliance.entity.Fridge;
import by.epam.ld.appliance.entity.TV;
import by.epam.ld.appliance.logic.ApplianceLogic;
import by.epam.ld.appliance.print.PrintView;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Appliance> appList = new ArrayList<Appliance>();

        appList.add(new TV("TV-LG", 100, "Color"));
        appList.add(new TV("TV-Horizont", 10, "Black"));
        appList.add(new TV("TV-Samsung", 200, "Color"));
        appList.add(new Fridge("Fridge-LG", 100, "Large", true));
        appList.add(new Fridge("Fridge-Samsung", 5000, "Medium", true));
        appList.add(new Fridge("Fridge-Horizont", 500, "Small", false));

        ApplianceLogic logic = new ApplianceLogic();
        PrintView appPrint = new PrintView();

        List<Appliance> findLG = logic.findByContext(appList, "LG");
        List<Appliance> findFridge = logic.findByContext(appList, "Fridge");
        List<Appliance> findPrice = logic.findByContext(appList, "100");
        List<Appliance> findFromTo = logic.findByPrice(appList, 10, 5000);

        appPrint.print(appList);
        appPrint.print(findLG);
        appPrint.print(findFridge);
        appPrint.print(findPrice);
        appPrint.print(findFromTo);

    }
}
