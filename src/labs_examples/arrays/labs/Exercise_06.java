package labs_examples.arrays.labs;

/**
 *  Reversing an array in place
 *
 *
 *      This is a very common interview challenge.
 *
 *      Using a for loop, please demonstrate how to reverse the nums[] array in place using only one extra variable. Please note,
 *      you cannot use a second array and you cannot instantiate any new variables in the class below.
 *
 *      Hint: you have two index
 *
 */
public class Exercise_06 {

    public static void main(String[] args){
        int[] nums = {45, 87, 62, 99, 1, 42, 12};

        int temp;

        // Question: in the for loop below, why do we divide "nums.length" by 2?
        for(int i = 0; i < nums.length / 2; i++){
            temp = nums[i];
            nums[i] = nums[nums.length - 1 - i];
            nums[nums.length - 1 - i] = temp;
            // swap elements at indexes in array
            // you have two indices readily available for you to use "i" (which increments) and "nums.length"
            // you've also got this "temp" variable you can use to hold a value temporarily

            /** My solution would be to use a temp variable to store a value, change the value at [i] (first elem) to be
              * whatever is at index [nums.length - 1 - i] (the last element). Then with each increment of i we move over
              * by one number forward, one number backwards
              *
              * We only run through this halfway to avoid just moving everything back as we loop through the 2nd half
              */
        }
        System.out.print("Contents of array after for loop - ");
        // print each element of the array to verify reverse order
        for(int i : nums){
            System.out.print(i + " ");
        }
    }

}
