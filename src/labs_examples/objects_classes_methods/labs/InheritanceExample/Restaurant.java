package labs_examples.objects_classes_methods.labs.InheritanceExample;

public class Restaurant {
    private int area;
    private int capacity;
    private String style;

    //define the default constructor for Restaurant
    public Restaurant(){
        area = 0;
        capacity = 0;
        style = "";
    }

    //define a constructor with parameters that should be passed in
    public Restaurant(int area, int capacity, String style){
        this.area = area;
        this.capacity = capacity;
        this.style = style;
    }
}
