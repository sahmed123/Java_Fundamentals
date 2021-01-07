package labs_examples.conditions_loops.labs;

import java.util.Scanner;

/**
 * Conditions and Loops Exercise 2: Days of the week
 *
 *      Take in a number from the user and print "Monday", "Tuesday", ... "Sunday", or "Other"
 *      if the number from the user is 1, 2,... 7, or other respectively. Use an if-else statement
 *      to accomplish this task.
 * 
 *      Bonus Tricky Challenge: Use a "nested-if" statement.
 *
 */

public class Exercise_02 {

    public static void main(String[] args) {

        // 1) create scanner (don't forget to import Scanner!)
        Scanner scanner = new Scanner(System.in);
        // 2) prompt user
        System.out.println("Enter a number representing a day of the week from 1-7: ");
        // 3) assign input to variable as int
        int dayOfWeek = scanner.nextInt();
        // 4) write completed code here
        /**
         * if/else implementation; a bit messy but it works
        if(dayOfWeek == 1){
            System.out.println("The day of the week is Monday.");
        }else if (dayOfWeek == 2){
            System.out.println("The day of the week is Tuesday.");
        }else if (dayOfWeek == 3){
            System.out.println("The day of the week is Wednesday.");
        }else if (dayOfWeek == 4){
            System.out.println("The day of the week is Thursday.");
        }else if (dayOfWeek == 5){
            System.out.println("The day of the week is Friday.");
        }else if (dayOfWeek == 6){
            System.out.println("The day of the week is Saturday.");
        }else if (dayOfWeek == 7){
            System.out.println("The day of the week is Sunday.");
        }else{
            System.out.println("You have entered an incorrect number.");
        } */

        //Switch Implementation instead of if-else
        switch(dayOfWeek){
            case 1:
                System.out.println("The day of the week is Monday");
                break;
            case 2:
                System.out.println("The day of the week is Tuesday");
                break;
            case 3:
                System.out.println("The day of the week is Wednesday");
                break;
            case 4:
                System.out.println("The day of the week is Thursday");
                break;
            case 5:
                System.out.println("The day of the week is Friday");
                break;
            case 6:
                System.out.println("The day of the week is Saturday");
                break;
            case 7:
                System.out.println("The day of the week is Sunday");
                break;
            default:
                System.out.println("Your input does not match one of our options.");
        }
    }
}
