package labs_examples.classes;

public class PersonController {
    public static void main(String[] args){
        Person somePerson = new Person(28, 67, "Shamim");
        Person otherPerson = new Person(26, 64, "Shaina");

        /*
        somePerson.age = 28;
        somePerson.name = "Shamim";
        somePerson.height = 66;

        otherPerson.age = 26;
        otherPerson.name = "Shaina";
        otherPerson.height = 64; */

        personalInfo(somePerson);
        personalInfo(otherPerson);
    }

    public static void personalInfo (Person person){
        System.out.println("This person's name is " + person.name + ", their age is " + person.age + ", and their height"
                + " is " + person.height + " inches tall.");
    }
}
