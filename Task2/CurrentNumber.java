package homework12.Task2;

public class CurrentNumber {
    private int isFizz = 0;
    private  int isBuzz = 0;
    private int number;
    private String numberToString;

    public CurrentNumber(int number) {
        setNumber(number);
        setNumberToString(Integer.toString(number));
    }

    @Override
    public String toString() {
        return getNumberToString() ;
    }


    public String getNumberToString() {
        return numberToString;
    }

    public void setNumberToString(String numberToString) {
        this.numberToString = numberToString;
    }

    public int getIsFizz() {
        return isFizz;
    }

    public void setIsFizz(int fizz) {
        isFizz = fizz;
    }

    public int getIsBuzz() {
        return isBuzz;
    }

    public void setIsBuzz(int buzz) {
        isBuzz = buzz;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
}

