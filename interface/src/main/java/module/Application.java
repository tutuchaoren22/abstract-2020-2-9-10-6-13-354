package module;

import java.util.ArrayList;

public class Application {
    public static void main(String[] args) {
        Person person = new Person("Ming", 300);
        Drive drive = new Drive();
        Bus bus = new Bus();
        Train train = new Train();
        Plane plane = new Plane();
        ArrayList<Vehicle> vehicles = new ArrayList();
        vehicles.add(drive);
        vehicles.add(bus);
        vehicles.add(train);
        vehicles.add(plane);
        person.chooseVehicle(vehicles);
    }
}
