package coding_sandbox;
import java.util.ArrayList;

public class arrayListPractice {
    public static void main (String[] args){

        ArrayList<String> list = new ArrayList<String>();

        list.add("Hello");
        list.add("World");
        list.add("Check");
        list.add("This");
        list.add("Out!");

        //list.clear();

        String val = list.get(2);
        //System.out.println(val);

        boolean check = list.contains("Dog");
        //System.out.println(check);

        if(!list.isEmpty()){
            for(String s: list){
                System.out.println(s + " ");
            }
        }else
            System.out.println("The list is empty!");
    }
}
