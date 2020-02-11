package module;

import java.sql.SQLOutput;

public class Train implements Vehicle {
    @Override
    public double getCost() {
        return 400;
    }

    @Override
    public void isChooseIt(double money) {
        if(money >= getCost()){
            System.out.println("乘坐火车");
        }
    }
}
