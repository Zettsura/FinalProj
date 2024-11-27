package file;

import vehicle.Vehicle;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

// TODO: add explicit throw if file operation fails
public class VehicleFileHandler extends FileManager {
    private File vehicleListFile;
    public VehicleFileHandler() {
        super();
        vehicleListFile = new File(getFilePath() + "/user_list.txt");
        try {
            boolean status;
            if (!vehicleListFile.exists()) {
                status = vehicleListFile.createNewFile();
            }
        } catch (IOException ex) {
            System.out.println("ERROR: " + ex.getMessage());
        }
    }

    public void save(Vehicle vehicle) {
        String test = "tes\nt";
        try (FileWriter fw = new FileWriter(vehicleListFile, true);){
            fw.write(
                    ""
            );

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void load(ArrayList<Vehicle> vehicleList) {

    }
}
