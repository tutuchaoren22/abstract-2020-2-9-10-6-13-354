package module;

import java.sql.SQLOutput;

public class Train implements Vehicle {
    @Override
    public double getCost() {
        return 400;
    }

    @Override
    public String getVehicle() {
        return "train";
    }
}
