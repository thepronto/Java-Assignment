// Abstract class
abstract class Vehicle {
    public abstract void move(double distance);
}

// Concrete subclasses
class Car extends Vehicle {
    @Override
    public void move(double distance) {
        System.out.println("Car moved " + distance + " kilometers on the road.");
    }
}

class Bike extends Vehicle {
    @Override
    public void move(double distance) {
        System.out.println("Bike moved " + distance + " kilometers on the road.");
    }
}

class Airplane extends Vehicle {
    @Override
    public void move(double distance) {
        System.out.println("Airplane flew " + distance + " kilometers in the sky.");
    }
}

// Demo class
public class VehicleDemo {
    public static void main(String[] args) {
        Vehicle v1 = new Car();
        Vehicle v2 = new Bike();
        Vehicle v3 = new Airplane();

        v1.move(50);
        v2.move(20);
        v3.move(500);

        // Using polymorphism in an array
        Vehicle[] vehicles = { new Car(), new Bike(), new Airplane() };
        for (Vehicle v : vehicles) {
            v.move(100);
        }
    }
}
