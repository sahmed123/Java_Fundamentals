package labs_examples.datatypes_operators.labs;

/**
 * Please demonstrate the use of all relational operators below. These include:
 *
 * less than, less than or equal to, greater than, greater than or equal to, and equal to
 *
 */
class RelationalOperators {

    public static void main(String[] args) {

        // example of "less than"
        int a = 1;
        int b = 2;
        int c = 3;
        int d = 4;
        int e = 3;

        if (a < b){
            System.out.println("a is less than b");
        }

        if(a <= c){
            System.out.println("a is less than or equal to c");
        }

        if(b > a){
            System.out.println("b is greater than a");
        }

        if(c >= e){
            System.out.println("c is greater than or equal to e");
        }

        if(c == e){
            System.out.println("c and e have equal values");
        }

        // write your code below



    }

}

