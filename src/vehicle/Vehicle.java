package vehicle;

interface rent{
    public void calcRent(float basePrice);
}


public class Vehicle {
    public long vehicleId; // Id ng shop
    public String carModel; //brand
    public String carType; //suv, electric, etc
    public String color;
    public String fuelType;
    public boolean isAutomatic;
    public int modelId;
    public int passLim;
    public float mileageLim;
    public static float basePrice;
    public static boolean isRented;

    public long getVehicleId() {
        return vehicleId;
    }

    public void setVehicleId(long vehicleId) {
        this.vehicleId = vehicleId;
    }

    public String getCarModel() {
        return carModel;
    }

    public void setCarModel(String carModel) {
        this.carModel = carModel;
    }

    public String getCarType() {
        return carType;
    }

    public void setCarType(String carType) {
        this.carType = carType;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getFuelType() {
        return fuelType;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }

    public boolean isAutomatic() {
        return isAutomatic;
    }

    public void setTransType(boolean transType) {
        this.isAutomatic = transType;
    }

    public int getModelId() {
        return modelId;
    }

    public void setModelId(int modelId) {
        this.modelId = modelId;
    }

    public int getPassLim() {
        return passLim;
    }

    public void setPassLim(int passLim) {
        this.passLim = passLim;
    }

    public float getMileageLim() {
        return mileageLim;
    }

    public void setMileageLim(float mileageLim) {
        this.mileageLim = mileageLim;
    }

    public float getBasePrice() {
        return basePrice;
    }

    public static boolean isIsRented() {
        return isRented;
    }

    public static void setIsRented(boolean isRented) {
        Vehicle.isRented = isRented;
    }
}

//class Electric extends Vehicle implements rent{
//    public float batteryCap;
//    public float chargeTime;
//}
//
//class pickUpTruck extends Vehicle implements rent{
//    public float towingCap;
//    public float truckBedCap;
//    public int torque;
//    public int storageLim;
//}
//
//class Van extends Vehicle implements rent{
//    public boolean hasExtraSeats;
//}
//
//class offRoad extends Vehicle implements rent{
//    public String approachAngle;
//}