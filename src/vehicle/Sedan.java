package vehicle;

import java.util.Objects;

public class Sedan extends Vehicle implements rent, payment{
    public boolean canOffRoad;

    public Sedan(long vehicleId, String carModel, String color, String fuelType, boolean isAutomatic, String modelId, int passLim, float mileageLim, boolean offRoadCap) {
        super(vehicleId, carModel, color, fuelType, isAutomatic, modelId, passLim, mileageLim);
        this.canOffRoad = offRoadCap;
    }

    public Sedan(){
        super();
    }

    @Override
    public void calcRent(Vehicle car, double basePrice) {
        basePrice = 20000.1;

        if (Objects.equals(car.getColor(), "Black") || Objects.equals(car.getColor(), "Blue"))
            basePrice *= 1.03;

    }
}
