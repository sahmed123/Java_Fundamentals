package labs_examples.objects_classes_methods.labs.InheritanceExample;

public class RestaurantTester {
    public static void main(String[] args){
        //creates a new Gourmet object with specified parameters
        Gourmet fancyFood = new Gourmet(100,250,"Italian",20);

        //creates new Gourmet object with default constructors
        Gourmet normalFood = new Gourmet();

        fancyFood.foodInfo();
    }
}
