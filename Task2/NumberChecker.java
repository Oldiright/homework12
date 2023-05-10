package homework12.Task2;

import java.util.ArrayList;

public class NumberChecker implements Runnable {
    private final int divisor;
    private final ArrayList<CurrentNumber> number;

    public NumberChecker( int divisor, ArrayList<CurrentNumber> number) {
        this.divisor = divisor;
        this.number = number;
    }

    @Override
    public void run() {
    if(divisor == 3) fizz(number);
    if(divisor == 5) buzz(number);
    if (divisor == 15) fizzbuzz(number);

    }

    public void fizz(ArrayList<CurrentNumber> i) {
        for (CurrentNumber number : i) {
            if (number.getNumber() % divisor == 0) {
                number.setNumberToString("Fizz");
                number.setIsFizz(1);
            } else {
                number.setIsFizz(-1);
            }
        }
    }

    public void buzz(ArrayList<CurrentNumber> i) {
        for (CurrentNumber number : i) {
            if (number.getNumber() % divisor == 0) {
                number.setNumberToString("buzz");
                number.setIsBuzz(1);
            } else {
                number.setIsBuzz(-1);
            }
        }
    }


    public void fizzbuzz(ArrayList<CurrentNumber> i) {
        for (CurrentNumber number : i) {
            while (number.getIsFizz() == 0 || number.getIsBuzz() == 0) {
                try {
                    Thread.sleep(1);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
            if (number.getIsFizz() == 1 & number.getIsBuzz() == 1) {
                number.setNumberToString("fizzbuzz");
            }

        }
    }



}
