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

/**   Want to have a string of vowels as a reference to check against --> "aeiou"
 *    Use length() to create a loop max var = to length of the word being passed in, go through each letter
 *    Use charAt() to pull the char value at a given location; use with loop value to log
 *    Check this char against the vowel string. If the char is in the string, then we've found the first vowel
 *    Use indexOf() to return the position of the first match of what you're checking against
 *
 *    Iterate through an input string checking if the character at a given position matches ANY of the characters
 *    in our reference string. If you hit a match, then return both the vowel that was matched up with and the
 *    input string. Exit the loop.
 */

public class Exercise_07 {

    static String vowels = "aeiou";

    public static void main (String[] args){
        findVowel("caribou");
    }

    public static void findVowel(String input){

        char firstVowel = ' '; // placeholder for the first vowel that we run into
        char currentLetter = ' '; // keep track of the current letter that you're comparing

        int i = 0; //counter as we traverse across the inputted word

        while(i < input.length()){
            currentLetter = input.charAt(i); //set currentLetter to char at index i
            if(vowels.indexOf(currentLetter) != -1){ //check if the currentLetter is a vowel
                firstVowel = input.charAt(i); //if vowel, then set as first vowel

                System.out.println("The submitted word was " + input + " and the first vowel is: "
                + firstVowel);
                break; //exit loop, no longer necessary b/c first vowel found
            }
            i++; //iterate to next character
        }
    }
}
