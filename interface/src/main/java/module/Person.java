package module;

import java.util.ArrayList;

public class Person {
    private String name;
    private int money;

    public Person() {
    }

    public Person(String name, int money) {
        this.name = name;
        this.money = money;
    }
    public void chooseVehicle(ArrayList<Vehicle> Vehicles){
        for (Vehicle vehicle:Vehicles){
            if(getMoney() >= vehicle.getCost()){
                System.out.println(getName()+" choose to travel from Wuhan to Beijing by "+vehicle.getVehicle()+".");
            }
        }

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMoney() {
        return money;
    }

    public void setHasMoney(int money) {
        this.money = money;
    }
}
