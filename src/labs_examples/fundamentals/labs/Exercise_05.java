package labs_examples.fundamentals.labs;


/**
 * Fundamentals Exercise 5: Working with Strings
 *
 *      Please follow the instructions in the comments below
 *
 */

public class Exercise_05 {

    public static void main(String[] args) {

        String str = "hello!";
        // please declare an int variable below, and set it to the value of the length of "str"

        int strLength = str.length();

        String str2 = "hello";
        // please initialize a boolean variable and test whether str is equal to str2

        boolean match = str.equals(str2);

        // please concatenate str & str2 and set the result to a new String variable below

        String combined = str + str2;

        // please demonstrate the use of any other method that is available to us in the String class
        // for example, replace(), substring(), contains(), indexOf() etc

        //expecting output of "hella! after replacing the 'o' in hello! with 'a'"
        String replaced = str.replace('o','a');
        String substring = str.substring(0,4);
        boolean isItHere = str.contains("ello");
        int location= str.indexOf('e');

        System.out.println("The length of string str is " + strLength);
        System.out.println("Is str the same length as str2? Answer: " + match);
        System.out.println("The combination of str + str2 is: " + combined);
        System.out.println("Replacing 'o' with 'a' turns hello! into " + replaced);
        System.out.println("Substring of str hello! first 4 chars is " + substring);
        System.out.println("Is there an string ello in the main string? Answer: " + isItHere);
        System.out.println("The location where 'e' is located is numbered: " + location);

    }


}