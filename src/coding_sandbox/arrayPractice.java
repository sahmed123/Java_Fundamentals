package coding_sandbox;

public class arrayPractice {
    public static void main (String[] args){

        //An array is a collection of variables of the same type, referred to by a common name

        //Initializing an array with empty values
        int[] vals = new int[5];

        //Initializing an array with values filled in
        //int[] vals = {10,225,35,74,58};

        System.out.println("The length of the int array is: " + vals.length);

        for(int i = 0; i < vals.length; i++){
            vals[i] = i;
            System.out.println("The array at index of " + i + " is: " + vals[i]);
        }

        System.out.println();
        printArray(vals);

        //for(int i = 0; i < vals.length; i++){
        //    vals[i] = i; //populate each array index with the associated value of i
        //}

        //For each int in the vals array, print out the value
        //for(int i: vals){
        //    System.out.println(i);
        //}
    }

    public static void printArray(int[] vals){
        for(int i = 0; i > vals.length; i++){
            System.out.println(vals[i]);
        }
    }
}
