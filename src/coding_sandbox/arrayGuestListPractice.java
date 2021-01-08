package coding_sandbox;
import java.util.ArrayList;

/**
 * We're throwing a party!

        We need you to help us make a list of the guests.

        First create and initialize an ArrayList called guests.

        Then add the following names to the list: "Arnold", "Gerald", "Eugene", "Helga" and "Phoebe".

        Print the list using a For-Each loop

        Whoops! It seems Eugene had an little accident and won't be able to make it to the party. Remove Eugene from the list.

        Print the list again.
*/
public class arrayGuestListPractice {
    public static void main (String[] args){

        ArrayList<String> guests = new ArrayList<String>();

        guests.add("Arnold");
        guests.add("Gerald");
        guests.add("Eugene");
        guests.add("Helga");
        guests.add("Phoebe");

        for(String s: guests)
            System.out.println(s);

        System.out.println();

        guests.remove(2);

        for(String s: guests)
            System.out.println(s);
    }
}
