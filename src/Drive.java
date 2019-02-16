public class Drive implements Transport{
    @Override
    public void chooseTransport(int money) {
        if(money >= 500) {
            System.out.println("自驾");
        }
    }

}
