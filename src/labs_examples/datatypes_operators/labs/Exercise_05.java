package labs_examples.datatypes_operators.labs;

/**
 * Please demonstrate the use of all logical operators below. These include:
 *
 * AND, short-circuit AND, OR, short-circuit OR, XOR, NOT
 *
 */
class LogicalOperators {

    public static void main(String[] args) {

        // example of "OR"
        boolean a = true;
        boolean b = false;
        boolean c = true;

        //Example of OR
        if (a | b){
		B
            System.out.println("a or b is true");
        }

        // Example of AND
        if(a & c){
            System.out.println("both a and c are true");
        }

        //Example of &&
        if(a == true && c == true){
            System.out.println("short-circuit && evaluates to true");
	    B
        }

        //Example of ||
        if(a || b){
            System.out.println("One of a or b are true");
        }

	//B
	//B
        //Example of ^
        if(a ^ b){
            System.out.println("One of a or b is true, but not both of them");
        }

        //Example of !
        if(a != b){
            System.out.println("a and b are not the same value");
        }
    }
}
