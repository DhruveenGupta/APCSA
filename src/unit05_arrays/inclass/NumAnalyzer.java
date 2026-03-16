package unit05_arrays.inclass;

public class NumAnalyzer {
    public static boolean isOdd(int num) {
        return num % 2 != 0;
    }

    public static boolean isPerfect(int num) {
        int sum = 0;
        for (int i = 1; i < num; i++) {
            if (num % i == 0) {
                sum += i;
            }
        }
        return sum == num;
    }

    public static void main(String[] args) {
        int number = 28;
        
        System.out.println(number + " is odd: " + isOdd(number));
        System.out.println(number + " is perfect: " + isPerfect(number));
    }
}
