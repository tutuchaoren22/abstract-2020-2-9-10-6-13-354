package module;

public class Bus implements Vehicle {
    @Override
    public double getCost() {
        return 300;
    }

    @Override
    public String getVehicle() {
        return "bus";
    }
}
