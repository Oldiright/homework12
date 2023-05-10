package homework12.Task2;

import java.util.ArrayList;

public class NumberGenerator {

    public static ArrayList<CurrentNumber> generate(int counter) {
        ArrayList<CurrentNumber> result = new ArrayList<>(counter);
        for (int i = 1; i <= counter;i++) {
            result.add(new CurrentNumber(i));

        }
        return result;
    }

}
