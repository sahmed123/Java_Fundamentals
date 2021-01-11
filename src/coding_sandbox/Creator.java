package coding_sandbox;

class MyFirstConstructor {
    int x;

    MyFirstConstructor(){
        x = 42;
    }
}

public class Creator{
    public static void main(String[] args){

        //creates a new object of the class MyFirstConstructor
        MyFirstConstructor objectOne = new MyFirstConstructor();
        System.out.println("The value of x for objectOne is: " + objectOne.x);

        MySecondConstructor objectTwo = new MySecondConstructor(10);
        System.out.println("The value of x for objectTwo is: " + objectTwo.x);

    }
}

class MySecondConstructor{
    int x;
    MySecondConstructor(int inputParam){
        x = inputParam;
    }
}
