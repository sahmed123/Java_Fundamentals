package labs_examples.arrays.labs;

import java.util.ArrayList;

/**
 *  ArrayLists
 *
 *      Please demonstrate how to create an ArrayList, populate an array list, access elements within an ArrayList.
 *      Also take a moment to explore the many methods that are available to you when you use an ArrayList. By simply
 *      typing the dot operator (".") after the ArrayList object that you create. You should see a menu pop up that
 *      shows a list of methods.
 *
 */
public class Exercise_07 {
    public static void main (String[] args){

        ArrayList<String> bballTeams = new ArrayList<String>();

        bballTeams.add("Lakers");
        bballTeams.add("Mavericks");
        bballTeams.add("Clippers");
        bballTeams.add("Celtics");

        System.out.println(bballTeams);

        System.out.println("Are the Bucks currently in the list? " + bballTeams.contains("Bucks"));
        System.out.println("Are the Celtics currently in the list? " + bballTeams.contains("Celtics"));

        bballTeams.remove("Celtics");
        bballTeams.add("Bucks");

        System.out.println(bballTeams);

        System.out.println("Are the Bucks currently in the list? " + bballTeams.contains("Bucks"));
        System.out.println("Are the Celtics currently in the list? " + bballTeams.contains("Celtics"));

        bballTeams.remove(2);
        System.out.println(bballTeams);

        bballTeams.clear();

        System.out.println("Is the ArrayList now empty? " + bballTeams.isEmpty());
    }
}
