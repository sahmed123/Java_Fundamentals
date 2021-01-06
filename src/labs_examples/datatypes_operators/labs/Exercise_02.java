package labs_examples.datatypes_operators.labs;

/**
 * Data Types and Operators Exercise 2: Type conversion and casting
 *
 *      Write the necessary code to demonstrate type conversion:
 *
 *      Widening:
 *      1. Declare and initialize an int with the value 10
 *      2. Declare a double and set it equal to the int
 *      3. Print out the double
 *
 *      Narrowing (with casting):
 *      1. Declare and initialize a new double with the value 10.5
 *      2. Declare a new int and set it equal to the double (make sure to cast the double to an int)
 *      3. Print out the int
 *
 *      Notice how each type is converted. In which direction is information lost?
 *
 */

public class Exercise_02 {

    public static void main(String[] args) {

        // write code here

        //There is added precision in the final result with the inclusion of a decimal place
        int initial = 10;
        double initD = initial;
        System.out.println("The value of initD is " + initD);

        //There is a loss of precision by dropping the .5 when converting from double to int
        double doubleVal = 10.5;
        int narrow = (int) doubleVal;
        System.out.println("The value of narrow is " + narrow);
    }
}
