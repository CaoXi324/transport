public class Train implements Transport {
        @Override
        public void chooseTransport(int money) {
            if(money >= 400) {
                System.out.println("飞机");
            }
        }

    }

