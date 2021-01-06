package labs_examples.variables;

/* Quick look at variable scope within a program
 */

public class Variables {

    //Variable declared outside of any given method, thus usable in any methods in this class
    //Must be declared static in order to "persist" between methods
    static double val = 123.45;

    public static void main (String [] args){

        Person myPerson = new Person("Shamim", 28);
        Person yourPerson = new Person("Monster", 30);
        Person smartMan = new Person ("Einstein", 85);
        Person ellen = new Person ("Ellen", 52);

        System.out.println(myPerson.toString());
        System.out.println(yourPerson.toString());
        System.out.println(smartMan.toString());
        System.out.println(ellen.toString());

        //myPerson object has an age of 29, and a name of Shamim
        myPerson.age = 29;

        //double x = multiply(val,val * 2);
    }

    //int a, int b are parameters that are being based into the method multiply
    public static double multiply (double a, double b){
        //local variable, only exists within the scope of multiply
        //the nearest curly brackets determine the area in which the variable is defined and usable
        double result = a * b;

        if(result > 0){
            double testVal = result * 2;
            System.out.println(testVal);
        }
        printNum(result);
        return result;
    }

    //result isn't defined within this method, therefore cannot be returned
    public static void printNum(double output){
        System.out.println(output);
    }
}
