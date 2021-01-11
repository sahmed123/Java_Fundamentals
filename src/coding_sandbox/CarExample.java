package coding_sandbox;

/**
 * In this example I demonstrate the "Has A" relationship between objects
 * In this case, the Car has an engine and stereo
 *
 * The car consists of objects that are the engine, a stereo and two strings
 *
 * Composition is used to model everyday objects allowing a great amount of flexibility
 * when it comes to clearly representing things in Java
 */
class Engine{
    double horsepower;
    Engine(double horsepower){
        this.horsepower = horsepower;
    }
}

class Stereo{
    String brand;
    Stereo(String brand){
        this.brand = brand;
    }
}

class Car{
    Engine engine;
    Stereo stereo;
    String model;
    String color;

    Car(Engine engine, Stereo stereo, String model, String color){
        this.engine = engine;
        this.stereo = stereo;
        this.model = model;
        this.color = color;
    }
}

public class CarExample {
    public static void main(String[] args){
        Engine myEngine = new Engine(400);
        Stereo myStereo = new Stereo("Sony");
        Car myCar = new Car(myEngine, myStereo, "Toyota", "Gray");

        System.out.println("I drive a " + myCar.color + " " + myCar.model + " with a sweet " +
                myStereo.brand + " brand stereo that has " + myEngine.horsepower + " horsepower!");
    }
}
