import java.util.ArrayList;

public class Rent {
    private ArrayList<Vehicle> vehicleList = new ArrayList<>();
    private ArrayList<Vehicle> rentedVehicleList = new ArrayList<>();
    public java.time.LocalTime dateRented = java.time.LocalTime.now();

    public void mileageLim(float miles){

    }

    public void calcPay(float miles){


    }

    public boolean checkAvailVehicle(){
        if(vehicleList == vehicleList)
            return true;
        else
            return false;
    }

    public float getTotalPay(){
        float pay = 0;

        return pay;
    }
}
