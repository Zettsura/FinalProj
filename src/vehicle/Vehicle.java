package vehicle;

public class Vehicle {
    public long vehicleId;
    public String carModel;
    public String carType;
    public String color;
    public String fuelType;
    public String transType;
    public int modelId;
    public int storageLim;
    public int passLim;
    public float mileageLim;
    public float basePrice;
    public boolean isRented;
    public boolean hasTintedWindows;
    public boolean hasFuel;
}

class Sedan extends Vehicle{
    public boolean offRoadCap;
}

class Electric extends Vehicle{
    public float batteryCap;
    public float chargeTime;
}

class pickUpTruck extends Vehicle{
    public float towingCap;
    public float truckBedCap;
    public int torque;
}

class Van extends Vehicle{
    public boolean hasExtraSeats;
}

class offRoad extends Vehicle{
    public String approachAngle;
}




