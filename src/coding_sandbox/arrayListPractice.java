package coding_sandbox;
import java.util.ArrayList;

public class arrayListPractice {
    public static void main (String[] args){

        ArrayList<String> list = new ArrayList<>();

        list.add("Hello");
        list.add("Dog");
        list.add("Yoyoyo");
        //list.clear();

        if(!list.isEmpty()){
            for(String s: list){
                System.out.println(s + " ");
            }
        }else
            System.out.println("The list is empty!");
    }
}
