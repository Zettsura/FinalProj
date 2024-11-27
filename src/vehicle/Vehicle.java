package vehicle;
interface payment{

}
interface rent{
    public void calcRent(double basePrice);
}


public class Vehicle {
    public long vehicleId;      // Id ng shop
    public String carModel;     //brand
    public String carType;      //suv, electric, etc
    public String color;        // Red, White, Blue, Yellow, Black, Pink, Green
    public String fuelType;
    public boolean isAutomatic;
    public int modelId;
    public int passLim;
    public double mileageLim;
    public static double basePrice;
    public static boolean isRented;

    public Vehicle() {
    }

    public Vehicle(long vehicleId, String carModel, String carType, String color, String fuelType, boolean isAutomatic, int modelId, int passLim, float mileageLim) {
        this.vehicleId = vehicleId;
        this.carModel = carModel;
        this.carType = carType;
        this.color = color;
        this.fuelType = fuelType;
        this.isAutomatic = isAutomatic;
        this.modelId = modelId;
        this.passLim = passLim;
        this.mileageLim = mileageLim;
    }

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

    public double getMileageLim() {
        return mileageLim;
    }

    public void setMileageLim(double mileageLim) {
        this.mileageLim = mileageLim;
    }

    public double getBasePrice() {
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
//    public double batteryCap;
//    public double chargeTime;
//}
//
//class pickUpTruck extends Vehicle implements rent{
//    public double towingCap;
//    public double truckBedCap;
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