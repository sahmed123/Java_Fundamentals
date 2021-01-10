package labs_examples.arrays.labs;

/**
 *  Irregular Arrays
 *
 *      Create and populate a 2 dimensional irregular array of size and contents of your choosing. Using a nested
 *      "for-each" loop, iterate and print out each element of the array.
 *
 */

public class Exercise_04 {
    public static void main (String[] args) {

        /*int[][] twoDimsTwoFurious = {
                {5,6,7,8},
                {6,7},
                {9,8,7}
        }; */

        String[][] twoDimstwoStrings = {
                {"Hello","This","Is","The","First","Array!"},
                {"Now","We","Are","In","The","Second!"},
                {"Number","Three!"}
        };

        /*for (int[] i : twoDimsTwoFurious) { //first loop checks for each array within 2-d array
            for (int j : i) { //2nd loop goes through for each element within the array
                System.out.print(j + " "); //print out each of the elements within the array
            }
            System.out.println();
        }*/

        for (String[] i : twoDimstwoStrings) { //first loop checks for each array within 2-d array
            for (String j : i) { //2nd loop goes through for each element within the array
                System.out.print(j + " "); //print out each of the elements within the array
            }
            System.out.println();
        }
    }
}
