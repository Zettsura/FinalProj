package vehicle;

import java.util.Objects;

public class Sedan extends Vehicle implements rent, payment{
    public boolean offRoadCap;

    public Sedan(long vehicleId, String carModel, String carType, String color, String fuelType, boolean isAutomatic, int modelId, int passLim, float mileageLim, boolean offRoadCap) {
        super(vehicleId, carModel, carType, color, fuelType, isAutomatic, modelId, passLim, mileageLim);
        this.offRoadCap = offRoadCap;
    }

    public Sedan(){
        super();
    }

    @Override
    public void calcRent(double basePrice) {
        basePrice = 20000.1;

        if (!Objects.equals(getColor(), "Black") || !Objects.equals(getColor(), "Blue"))
            basePrice *= 1.03;

    }
}
