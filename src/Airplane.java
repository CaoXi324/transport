public class Airplane implements Transport{
    @Override
    public void chooseTransport(int money) {
        if(money >= 1000) {
            System.out.println("飞机");
        }
    }

}

