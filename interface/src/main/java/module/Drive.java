package module;

public class Drive implements Vehicle{
    @Override
    public double getCost() {
        return 500;
    }

    @Override
    public void isChooseIt(double money) {
        if(money >= getCost()){
            System.out.println("选择自驾");
        }
    }
}
