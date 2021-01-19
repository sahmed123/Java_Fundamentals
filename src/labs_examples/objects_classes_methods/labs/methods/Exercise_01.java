package labs_examples.objects_classes_methods.labs.methods;

/**
 * Created by ryandesmond - https://codingnomads.co
 */
public class Exercise_01 {

    public static void main(String[] args) {

        // please create the methods as instructed below then
        // call each of those methods from here, within the main()

        int a = 2;
        int b = 3;
        int c = 6;

        int answer = multiply(a,b);
        System.out.println("Multiply solution is: " + answer);

        int answer2 = divide(c,b);
        System.out.println("Divide solution is: " + answer2);

        iGotJokes();

        int totalSeconds = yearsToSeconds(a);
        System.out.println(a + " years is equal to " + totalSeconds + " seconds.");

        int VarArgsLength = arrayLength("dog", "cat", "frog");
        System.out.println("The number of arrays passed into VarArgs is: " + VarArgsLength);

    }

    // 1) Create a static multiply() method below that takes two int arguments (int a, int b) and
    //    returns the result of a * b

    public static int multiply(int a, int b){
        int answer = a * b;
        return answer;
    }


    // 2) Create a static divide() method below that takes two int arguments (int a, int b) and
    //    returns the result of a / b

    public static int divide (int a, int b){
        int answer = a / b;
        return answer;
    }


    // 3) Create a static void method that will print of joke of your choice to the console

    public static void iGotJokes(){
        System.out.println("What did 5 fingers say to the face?");
        System.out.println("SLAP!");
    }


    // 4) Create a static method that takes in a number in years (int years) as an argument
    //    and returns the number of seconds that number in years represents
    public static int yearsToSeconds(int years){
        int convertedSeconds = years * 31556952;
        return convertedSeconds;
    }


    // 5) Create a varargs method that will return the length of the varargs array passed in
    public static int arrayLength(String... VarArgs){
        int length = VarArgs.length;
        return length;
    }

}
