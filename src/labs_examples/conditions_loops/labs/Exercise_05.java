package labs_examples.conditions_loops.labs;

/**
 * Conditions and Loops Exercise 5: Calculator
 *
 *      Take two numbers from the user, an upper and lower bound. Using a "for-loop", calculate the sum
 *      of numbers from the lower bound to the upper bound. Also, calculate the average of numbers.
 *      Print the results to the console.
 *
 *      For example, if a user enters 1 and 100, the output should be:
 *
 *      The sum is: 5050
 *      The average is: 50.5
 *
 *
 */

public class Exercise_05 {
    public static void main(String[] args){

        calculateBounds(1, 100 );
    }

    public static void calculateBounds (int lower, int upper){
        double sum = 0;
        double avg = 0.0;

        for(int i = lower; i <= upper; i++){
            sum += i;
            //System.out.println(sum);
        }

        avg = sum/upper;

        System.out.println("The sum of numbers from " + lower + " to " + upper + " are: " + sum);
        System.out.println("The average of numbers from " + lower + " to " + upper + " are: " + avg);
    }
}
