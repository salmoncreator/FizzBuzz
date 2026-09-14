package lab1;

/**
 * Solve the lab1.FizzBuzz challenge.
 */
class FizzBuzz {

    public static void main(String[] args) {
        int n = 1;

        while (n <= 100) {

            n = doFizzBuzz(n);
        }
    }

    private static int doFizzBuzz(int n) {
        // Find out which numbers divide i.
        boolean divisibleBy3 = n % 3 == 0;
        boolean divisibleBy5 = n % 5 == 0;

        // Print our appropriate result.
        if (divisibleBy3 && divisibleBy5) {

            System.out.println("Fizz Buzz");

        } else if (divisibleBy3) {

            System.out.println("Fizz");

        } else if (divisibleBy5) {

            System.out.println("Buzz");

        } else {

            System.out.println(n);

        }
        n += 1;
        return n;
    }
}
