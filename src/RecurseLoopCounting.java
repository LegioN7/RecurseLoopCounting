// CST-283
// Aaron Pelto
// Winter 2024

// Complete the following java algorithms
// Sum all positive even numbers between 2 and n iteratively (with loops)
// Sum all positive even numbers between 2 and n recursively (with recursion)

public class RecurseLoopCounting
{
    public static void main(String[] args)
    {

        System.out.println(sumEvenNumbers(1000));
        System.out.println(sumEvenNumbersRecurse(1000));
    }

    // Write Java method that sums all positive even numbers between 2 and n iteratively.
    public static int sumEvenNumbers(int n)
    {
        int sum = 0;

        for (int i = 2; i <= n; i += 2)
        {
            sum += i;
        }

        return sum;
    }

    // Write Java method that sums all positive even numbers between 2 and n iteratively.
    // Preconditions:  n is even and n > 2
    public static int sumEvenNumbersRecurse(int n)
    {
        int sum = 0;

        if (n == 2)
        {
            return 2;
        }
        else
        {
            sum = n + sumEvenNumbersRecurse(n - 2);
        }

        return sum;
    }
}
