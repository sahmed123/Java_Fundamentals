package labs_examples.objects_classes_methods.labs.methods;

/**
 * VarArgs allows you to pass many arguments, in any number and combinations of strings, to method
 *
 * This allows you to deploy method overloading and receive various different types of inputs hence
 * "variable" arguments. It's pretty much an array, similar in concept to what we use in the main method
 */

public class VarArgsExample {
    public static void main(String[] args){
        int count1 = countArgs("one", "two", "three");
        int count2 = countArgs("one", "two");
        int count3 = countArgs("one", "two", "three");

        System.out.println("count1 is: " + count1);
        System.out.println("count2 is: " + count2);
        System.out.println("count3 is: " + count3);

    }

    public static int countArgs(String arg, String... args){
        int count = 0;

        for(String S: args){
            count++;
        }

        return count;
    }
}
