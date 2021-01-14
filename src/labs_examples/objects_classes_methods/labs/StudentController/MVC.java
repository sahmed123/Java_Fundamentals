package labs_examples.objects_classes_methods.labs.StudentController;

/**
 * Full MVC program
 */

public class MVC {
    public static void main (String[] args){

        //Fetch student record based upon the roll # in the database
        Student model = retrieveStudentFromDatabase();

        //Create the View and Controller classes
        StudentView view = new StudentView();
        StudentController controller = new StudentController(model, view);

        //Use the controller to print data, update internal data, and then reprint the data
        controller.updateView();
        controller.setStudentName("Shaina");
        controller.setStudentRollNo("1B");
        controller.updateView();
    }

    //Method to initially populate the student object
    private static Student retrieveStudentFromDatabase(){
        Student student = new Student();
        student.setName("Shamim");
        student.setRollNo("10A");
        return student;
    }
}
