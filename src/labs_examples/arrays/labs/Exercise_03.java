package labs_examples.arrays.labs;

/**
 *  2D Array
 *
 *      Create and populate a 5x5 2D array with multiples of 3, starting with 3. Once populated, print out the results.
 *
 *      The output should look something like this:
 *
 *      3 6 9 12 15
 *      18 21 24 27 30
 *      ...
 *      ...
 *      ...
 *
 */

public class Exercise_03 {

    public static void main(String[] args) {
        int[][] twoDimArray = new int[5][5]; //initialize two dimensions 5 x 5 array
        int threeMults = 3; //first multiple of 3

        for(int i = 0; i < twoDimArray.length; i++){
            for(int j = 0; j < twoDimArray[i].length; j++){
                twoDimArray[i][j] = threeMults;
                threeMults += 3;
                System.out.print(twoDimArray[i][j] + " ");
            }
            System.out.println();
        }

    }
}
