package unit05_arrays.inclass;

public class Number {
    private int num;

    public Number(){
        num = 0;
    }

    public Number(int num) {
        this.num = num;
    }

    public boolean isOdd() {
        return num % 2 != 0;
    }

    public boolean isPerfect() {
        int sum = 0;
        for (int i = 1; i < num; i++) {
            if (num % i == 0) {
                sum += i;
            }
        }
        return sum == num;
    }
}
