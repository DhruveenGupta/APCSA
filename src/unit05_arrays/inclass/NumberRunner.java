package unit05_arrays.inclass;

public class NumberRunner {
    public static void main(String[] args) {
        int[] nums = {7, 28, 496, 1111, 199, 201, 17, -212, -211};
        Number number = new Number();
        for (int num : nums) {
            number = new Number(num);
            if (number.isOdd()) {
                System.out.println(num + " is odd.");
            }
            else {
                System.out.println(num + " is even.");
            }
            if (number.isPerfect()) {
                System.out.println(num + " is perfect.");
            }
            else {
                System.out.println(num + " is not perfect.");
            }
        }
    }
}

