package labs_examples.variables;

public class Person {
    String name;
    int age;
    static int numPersonsCreated; //all object have access to this variable in memory

    public Person (String name, int age){
        this.name = name;
        this.age = age;
        numPersonsCreated++;
    }

    // This method overrides the typical output for the toString() method that is called in our main file
    // This will print out the specified variables that are relegated for each particular object of class Person
    // that is being called
    @Override
    public String toString() {
        return "Person{" +
                "name ='" + name + '\'' +
                ", age = " + age +
                ", numPersonCreated = " + numPersonsCreated +
                '}';
    }
}