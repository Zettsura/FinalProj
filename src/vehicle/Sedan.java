package vehicle;

public class Sedan extends Vehicle implements rent{
    public boolean offRoadCap;
    @Override
    public void calcRent(float basePrice) {
        basePrice = 20000.1f;


    }
}
