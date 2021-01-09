package labs_examples.arrays.labs;
import  java.util.Scanner;

/**
 * Arrays calculator
 *
 *      Take in 10 numbers from the user. Place the numbers in an array. Using the loop of your choice,
 *      calculate the sum of all of the numbers in the array as well as the average.
 *
 *      Print the results to the console.
 *
 */

public class Exercise_01 {
    public static void main (String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter total # of numbers that will be input: ");
        int numScanned = scanner.nextInt();

        int[] storedNums = new int[numScanned];
        int sum = 0;

        System.out.println("Enter the numbers that will be summed up: ");

        for(int i = 0; i < storedNums.length; i++){
            storedNums[i] = scanner.nextInt();
            sum += storedNums[i];
        }

        System.out.println("The Sum of the entered numbers is: " + sum);

    }

}