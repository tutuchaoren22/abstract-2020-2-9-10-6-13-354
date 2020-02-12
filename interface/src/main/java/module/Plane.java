package module;

public class Plane implements Vehicle {
    @Override
    public double getCost() {
        return 1000;
    }

    @Override
    public String getVehicle() {
        return "plane";
    }
}
