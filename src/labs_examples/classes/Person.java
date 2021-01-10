package labs_examples.classes;

/**
 *
 * This class is called a POJO
 * Plain Old Java Object
 * It is a representative piece of data
 */
public class Person {

    // instance variables - each object of this class type gets a copy
     int age;
     double height;
     String name;

    // constructors
    public Person(){};

    public Person(int age, double height, String name){
        this.age = age;
        this.name = name;
        this.height = height;
    }

    // methods
    // ...
}

//File always has the same name as a the class