package module;

public class Drive implements Vehicle {
    @Override
    public double getCost() {
        return 500;
    }

    @Override
    public String getVehicle() {
        return "drive-self";
    }
}
