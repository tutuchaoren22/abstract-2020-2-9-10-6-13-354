package module;

public class Plane implements Vehicle{
    @Override
    public double getCost() {
        return 1000;
    }

    @Override
    public void isChooseIt(double money) {
        if(money >= getCost()){
            System.out.println("选择飞机");
        }
    }
}
