import java.util.ArrayList;

public class CarbonFootprintApp {
    public static void main(String[] args) {
        ArrayList<CarbonFootprint> carbonFootprints = new ArrayList<>();

        Building building = new Building(5, 10000.0, true);
        carbonFootprints.add(building);

        Car car = new Car("Toyota", "Prius", 2020, 50.0, 10000.0);
        carbonFootprints.add(car);

        Bicycle bicycle = new Bicycle("Road", false);
        carbonFootprints.add(bicycle);

        for (CarbonFootprint c : carbonFootprints) {
            System.out.printf("%s has a carbon footprint of %.2f kgCO2e%n",
                    c.getClass().getSimpleName(), c.getCarbonFootprint());
        }
    }
}

