package module;

public class Bus implements Vehicle {
    @Override
    public double getCost() {
        return 300;
    }

    @Override
    public void isChooseIt(double money) {
        if(money >= getCost()){
            System.out.println("选择大巴车");
        }
    }
}
