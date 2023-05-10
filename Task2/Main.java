package homework12.Task2;

import java.util.ArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;

public class Main {

    public static void main(String[] args) {

        ArrayList<CurrentNumber> numberList = NumberGenerator.generate(100);


        Thread thread1 = new Thread(new NumberChecker(3, numberList));
        Thread thread2 = new Thread(new NumberChecker(5, numberList));
        Thread thread3 = new Thread(new NumberChecker(15, numberList));



        thread1.start();
        thread2.start();
        thread3.start();


        
        number(numberList);
    }

    public static void number(ArrayList<CurrentNumber> numbers) {
        for(CurrentNumber i: numbers ) {
            while (i.getIsBuzz() == 0 & i.getIsFizz() == 0) {
                try {
                    Thread.sleep(1);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
            System.out.println(i.getNumberToString());

        }
    }

}
