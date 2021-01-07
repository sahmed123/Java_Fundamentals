package labs_examples.conditions_loops.labs;

/**
 * Conditions and Loops Exercise 7: First vowel
 *
 *      Take in a word from the user and using a "while" loop, find the first vowel in the word.
 *      Once you find the vowel, print out the word and the first vowel.
 *
 *      Hints:
 *          - there are a few helpful methods in the String class called length(), charAt() and indexOf()
 *          - you'll likely want to use a String that contains all the vowels:
 *              - ie: String vowels = "aeiou";
 *
 */

/** Want to have a string of vowels as a reference to check against
 *  Use length() to create a loop max = to length of the word being passed in
 *  Use charAt() to pull the char value at a given location; use with loop value to log
 *  Use indexOf() to return the position of the first match of what you're checking against
 */

public class Exercise_07 {

    static String vowels = "aeiou";

    public static void main (String[] args){
        findVowel("dog");
    }

    public static void findVowel(String input){

        int vowelTraversal = 0;

        while(vowelTraversal < input.length()){
            //Go through the word, move up one
        }
    }
}
