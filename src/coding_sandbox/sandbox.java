package coding_sandbox;

import java.sql.SQLOutput;
import java.util.Locale;

public class sandbox {
    public static void main (String[] args){
        int i = 7;

        switch(i){
            case 0:
                System.out.println("i is 0");
                break;
            case 1:
                System.out.println("i is 1");
                break;
            case 2:
                System.out.println("i is 2");
                break;
            case 3:
                System.out.println("i is 3");
                break;
            case 4:
                System.out.println("i is 4");
                break;
            case 5:
                System.out.println("i is 5");
                break;
            default:
                System.out.println("default was hit");
                break;
        }

        String str = "gold";

        System.out.println("Your membership gives you access to the following levels");
        // No break statements; cascading effect to go through each subsequent case
        switch(str){
            case "gold":
                System.out.println("gold level");
            case "silver":
                System.out.println("silver level");
            case "bronze":
                System.out.println("bronze level");

        }
        System.out.println("Finished running the switch statement");
    }
}
