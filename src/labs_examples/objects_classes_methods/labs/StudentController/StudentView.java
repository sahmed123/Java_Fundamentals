package labs_examples.objects_classes_methods.labs.StudentController;

/**
 * Strictly prints out details; there is no logic being performed here
 *
 * The View is asked by the Controller to display and print out data, the actual data is
 * worked upon within the Model. All the view exists to do is return what is asked of it via Controller
 */
public class StudentView {
    public void printStudentDetails(String studentName, String studentRollNo){
        System.out.println("Student: ");
        System.out.println("Name: " + studentName);
        System.out.println("Roll No: " + studentRollNo);
        System.out.println();
    }
}
