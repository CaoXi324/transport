
public class Result {
    public static void main(String[] args) {
        Transport bus = new Bus();
        Transport drive = new Drive();
        Transport airplane = new Airplane();
        Transport train = new Train();
        System.out.println("可选择的交通方式有：");
        bus.chooseTransport(500);
        drive.chooseTransport(500);
        airplane.chooseTransport(500);
        train.chooseTransport(500);
    }


}
