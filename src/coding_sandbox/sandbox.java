package coding_sandbox;

import java.sql.SQLOutput;
import java.util.Locale;

public class sandbox {
    public static void main (String[] args){
        String str1 = "Hello String 1!";
        String str2 = "Hello String 1!";

        //String concatenation
        System.out.println("Here is the first part " + "and here is the second!");

        //Method to figure out the length of a given string
        System.out.println("The length of the string is " + str1.length());

        //Boolean check as to whether the two strings are the same
        boolean sameString = str1.equalsIgnoreCase(str2);
        System.out.println("Are the strings the same? Answer: " + sameString);

        //Using substring method to display part of a given string
        String fragment = str1.substring(8,12);
        System.out.println("The substring section is: " + fragment);

        //Utilizing the charAt() method to return the char at a given location on the string
        char letterLocation = str1.charAt(8);
        System.out.println("The character at position 8 on string str1 is " + letterLocation);

        //Using toUpperCase() and toLowerCase() to test and view strings converted to each display
        System.out.println("str1 in uppercase looks like: " + str1.toUpperCase());
        System.out.println("str2 in lowercase looks like: " + str2.toLowerCase());
    }
}
