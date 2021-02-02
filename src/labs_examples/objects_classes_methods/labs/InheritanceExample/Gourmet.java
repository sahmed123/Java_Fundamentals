package labs_examples.objects_classes_methods.labs.InheritanceExample;

public class Gourmet extends Restaurant{
    private int waitTime;

    public Gourmet(){
        //invokes the empty parent constructor Restaurant()
        super();
        waitTime = 0;
    }

    public Gourmet(int area, int capacity, String style, int wt){
        //invokes parent constructor from Restaurant and passes in the expected values
        super(area,capacity,style);
        waitTime = wt;
    }
}
