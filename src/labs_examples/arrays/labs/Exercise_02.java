package labs_examples.arrays.labs;
import java.util.Scanner;

/**
 *  More labs_examples.arrays
 *
 *      Using the array below, take in a number from 1-10 from the user and print out the index of that
 *      element.
 *
 */

public class Exercise_02 {

    public static void main(String[] args) {

        int[] array = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};

        System.out.println("Please enter a number from 1-10: ");
        Scanner scanner = new Scanner(System.in);

        int storedNumber = scanner.nextInt();

        if(storedNumber > 10 | storedNumber < 1){
            System.out.println("The number you have entered is outside of range. Please try again.");
            return;
        } //catch any incorrect inputs from user

        for(int i = 0; i < array.length; i++){
            if(array[i] == storedNumber){
                System.out.println("The index where " + storedNumber + " is located is: index " + i);
            }
        }
    }
}