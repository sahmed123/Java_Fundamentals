package labs_examples.recursion;

/**
 * Recursive methods call themselves and update the passed parameters each time until they hit a point where
 * they trigger the exit condition. If there is no exit condition that can be reached across future iterations,
 * then you end up with a StackOverflow error.
 *
 * They can be useful in a handful of scenarios (like tree traversal), but for the most, they should be avoided
 * as corner cases can lead to faulty errors that might be difficult to re-trace and figure out when sifting
 * through your program.
 */

public class RecursiveFactorial {
    public static void main (String[] args){
        int x = factorial(5);
        System.out.println(x);
    }

    static int factorial (int x){
        int finalAnswer;

        //base case to terminate recursive calls
        if(x == 1)
            return 1;

        //otherwise recursive call is executed each time
        finalAnswer = x * factorial(x - 1);
        System.out.println("finalAnswer while x = " + x + " is: " + finalAnswer);

        return finalAnswer;
    }
}

/**
 * 2 * 1! -> 2
 * 3 * 2! -> 6
 * 4 * 3! -> 24
 * 5 * 4! -> 120
 * 5! = 120
 *
 *
 */
