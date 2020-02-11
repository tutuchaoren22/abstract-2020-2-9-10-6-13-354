package module;

public class Application {
    public static void main(String[] args) {
        Drive drive=new Drive();
        Bus bus=new Bus();
        Train train=new Train();
        Plane plane=new Plane();
        double hasMoney=500;
        drive.isChooseIt(hasMoney);
        bus.isChooseIt(hasMoney);
        train.isChooseIt(hasMoney);
        plane.isChooseIt(hasMoney);
    }
}
