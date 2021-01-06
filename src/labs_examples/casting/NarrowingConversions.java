package labs_examples.casting;

public class NarrowingConversions {
    public static void main(String[] args){

        double x = 10.23;
        System.out.println("x = " + x);

        float f = (float) x;
        System.out.println("f = " + f);

        //Here we convert the double x into an int z
        int z = (int) x;
        System.out.println("z = " + z);

        double d = 100.04;
        long l = (long) d;

        int i = (int) l;

        System.out.println("Long value = " + l);
        System.out.println("int value = " + i);
    }
}
