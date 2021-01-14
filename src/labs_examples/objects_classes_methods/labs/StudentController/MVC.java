package labs_examples.objects_classes_methods.labs.StudentController;

/**
 * Full MVC program
 */

public class MVC {
    public static void main (String[] args){

        //Fetch student record based upon the roll # in the database
        Student model = retrieveStudentFromDatabase();

        StudentView view = new StudentView();

        StudentController controller = new StudentController(model, view);

        controller.updateView();

        controller.setStudentName("Shaina");

        controller.updateView();
    }

    private static Student retrieveStudentFromDatabase(){
        Student student = new Student();
        student.setName("Shamim");
        student.setRollNo("10A");
        return student;
    }
}
