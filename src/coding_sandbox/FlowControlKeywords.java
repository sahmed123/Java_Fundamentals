package coding_sandbox;

public class FlowControlKeywords {
    public static void main(String[] args) {

        //Flow Control
        //continue, break, return

        //continue keyword forces an early iteration of the loop; runs through next iteration if conditions met
        /*for (int i = 0; i < 3; i++) {
            for (int x = 0; x < 10; x++) {
                if (x == 3 || x == 7) {
                    continue;
                }
                System.out.println("x = " + x);
            }
            System.out.println("i = " + i);
        }*/

        //break keyword; allows for the termination of execution and "breaking out" of a loop
        /*for(int i = 0; i < 10; i++){
            //exits the nearest loop
            if (i == 3 || i == 7) {
                break;
            }
            System.out.println("i = " + i);
        }
        System.out.println("Done with loop"); */
        int i = someMethod(3);
        System.out.println("i = " + i);

    }

    //return keyword: immediately exit current method, returns a value is the method requires it
    public static int someMethod(int val){
        if(val == 0){
            System.out.println("1) will this print?");
            return 0;
        }else if (val == 1){
            System.out.println("2) will this print?");
            return 1;
        }
            System.out.println("3) will this print?");
            return -1;

    }
}