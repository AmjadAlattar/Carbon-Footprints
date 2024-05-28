interface CarbonFootprint {
    double getCarbonFootprint();
}

class Building implements CarbonFootprint {
    private int numberOfFloors;
    private double squareFootage;
    private boolean hasRenewableEnergy;

    public Building(int numberOfFloors, double squareFootage, boolean hasRenewableEnergy) {
        this.numberOfFloors = numberOfFloors;
        this.squareFootage = squareFootage;
        this.hasRenewableEnergy = hasRenewableEnergy;
    }

    public int getNumberOfFloors() {
        return numberOfFloors;
    }

    public double getSquareFootage() {
        return squareFootage;
    }

    public boolean hasRenewableEnergy() {
        return hasRenewableEnergy;
    }

    public double getCarbonFootprint() {
        double carbonFootprint = 0.0;
        if (!hasRenewableEnergy) {
            carbonFootprint += (numberOfFloors * 100) + (squareFootage * 10);
        }
        return carbonFootprint;
    }
}

class Car implements CarbonFootprint {
    private String make;
    private String model;
    private int year;
    private double milesPerGallon;
    private double milesDriven;

    public Car(String make, String model, int year, double milesPerGallon, double milesDriven) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.milesPerGallon = milesPerGallon;
        this.milesDriven = milesDriven;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public double getMilesPerGallon() {
        return milesPerGallon;
    }

    public double getMilesDriven() {
        return milesDriven;
    }

    public double getCarbonFootprint() {
        return milesDriven / milesPerGallon * 19.6;
    }
}

class Bicycle implements CarbonFootprint {
    private String type;
    private boolean hasElectricAssist;

    public Bicycle(String type, boolean hasElectricAssist) {
        this.type = type;
        this.hasElectricAssist = hasElectricAssist;
    }

    public String getType() {
        return type;
    }

    public boolean hasElectricAssist() {
        return hasElectricAssist;
    }

    public double getCarbonFootprint() {
        return hasElectricAssist ? 0.0 : 10.0;
    }
}


