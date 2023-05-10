package homework12.Task1;

public class TimeKeeper {

    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        Thread timeCounter2 = new Thread(() -> {

            while (!Thread.interrupted()) {
                try {
                    Thread.sleep(5000);
                } catch (InterruptedException e) {

                }
                System.out.println("Минулo 5 секунд");
            }
        });
        timeCounter2.start();

        int currentTimePassed = 1;
        while (!Thread.interrupted()) {
            try {
                Thread.sleep(1000l);
            } catch (InterruptedException e) {

            }
            System.out.println((System.currentTimeMillis() - startTime)/1000 + " секунд(a) від старту програми");

            currentTimePassed++;
        }
    }
}
