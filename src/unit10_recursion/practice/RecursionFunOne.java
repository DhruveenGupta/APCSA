package unit10_recursion.practice;

import static java.lang.System.*;

public class RecursionFunOne
{
	public static int countOddDigits(int num)
	{
    if (num == 0) {
        return 0;
    }
    int digit = num % 10;
    int count = (digit % 2 == 0) ? 1 : 0;
    return count + countOddDigits(num / 10);
	}
}