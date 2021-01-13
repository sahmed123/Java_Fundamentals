package labs_examples.objects_classes_methods.labs.objects;

/**
 * Lab Assignment on building an Airplane Object modeled off the CarExample.java
 *
 * Build and Airplane Class with 3-4 classes and a few primitives
 */

public class AirplaneObject {
    public static void main(String[] args){

        PlaneEngine myEngine = new PlaneEngine(5000);
        NavigationSystem myNav = new NavigationSystem("Alexa");
        Manufacturer myModel = new Manufacturer("Boeing");

        Airplane myPlane = new Airplane(myModel, 50000, 45000, myEngine, myNav);
    }
}

class Airplane{
    double fuelCapacity;
    double currentFuelLevel;
    PlaneEngine engine;
    NavigationSystem gps;
    Manufacturer make;

    public Airplane(Manufacturer make, double fuelCapacity, double currentFuelLevel, PlaneEngine engine, NavigationSystem gps){
        this.make = make;
        this.fuelCapacity = fuelCapacity;
        this.currentFuelLevel = currentFuelLevel;
        this.engine = engine;
        this.gps = gps;
    }
}

class PlaneEngine{
    double horsePower;

    public PlaneEngine(int horsePower){
        this.horsePower = horsePower;
    }

}

class NavigationSystem{
    String gps;

    public NavigationSystem(String gps){
        this.gps = gps;
    }
}

class Manufacturer{
    String manufacturer;

    public Manufacturer(String manufacturer){
        this.manufacturer = manufacturer;
    }
}
