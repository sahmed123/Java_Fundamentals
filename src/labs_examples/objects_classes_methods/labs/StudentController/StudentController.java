package labs_examples.objects_classes_methods.labs.StudentController;

/**
 * The Controller calls the Model to perform Logic accordingly and the the View to display results
 *
 * This is the main area where requests are made, it controls the flow of data throughout the various
 * java files. This is pretty much the place from which you redirect commands and set up the overall flow
 * of your program.
 *
 */

public class StudentController {
    //Create objects based upon the Model and View files we've made
    private Student model;
    private StudentView view;

    //Controller constructor to set model and view appropriately
    public StudentController(Student model, StudentView view){
        this.model = model;
        this.view = view;
    }

    //Followed by a variety of methods to set and also return the requested variables
    public void setStudentName(String name){
        model.setName(name);
    }

    public String getStudentName(){
        return model.getName();
    }

    public void setStudentRollNo(String rollNo){
        model.setRollNo(rollNo);
    }

    public String getStudentRollNo(){
        return model.getRollNo();
    }

    //Print method that will be called from the main MVC program to print out stored data
    public void updateView(){
        view.printStudentDetails(model.getName(), model.getRollNo());
    }
}
