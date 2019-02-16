public class Bus implements Transport{
        @Override
        public void chooseTransport(int money) {
            if(money >= 300) {
                System.out.println("大巴");
            }
        }

    }

