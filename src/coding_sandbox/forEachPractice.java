package coding_sandbox;

public class forEachPractice {
    public static void main (String[] args){
        int[] values = new int[5];

        for(int i = 0; i < values.length; i++){
            values[i] = i * 2;
        }
        //After execution, values looks like {0, 2, 4, 6, 8}

        //A For-Each loop to iterate through the  array and print out each stored value
        for(int i : values){
            System.out.println(i);
        }

        //Initiate 2-d array for ints
        int[][] nums = new int[5][10];

        //iterate through the array and store value at each location
        for(int i = 0;i < nums.length; i++){
            for(int j = 0; j <nums[i].length; j++){
                nums[i][j] = (i * j) * 7/3;
            }
        }
        //for every array outer, go through the 2-d array
        //for every value in outer loop, print it out
        for(int[] outer: nums){
            for(int value: outer){
                System.out.print(value + " -> ");
            }
            System.out.println();
        }
    }
}
