package labs_examples.objects_classes_methods.labs.StudentController;

/**
 * Create the model for the Student class; this is where all the data is manipulated and different
 * variables are set. This is pretty much where all your logic will take place to ensure that the
 * program is functional
 */

public class Student {

    //Set variables
    private String rollNo;
    private String name;

    //The set and get methods allow you to assign values to this object and also return them
    public String getRollNo(){
        return rollNo;
    }

    public void setRollNo(String rollNo){
        this.rollNo = rollNo;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }
}
