// Base class
class Gadget {
    String brand;
    int batteryLife; // in hours

    public Gadget(String brand, int batteryLife) {
        this.brand = brand;
        this.batteryLife = batteryLife;
    }

    public void displayInfo() {
        System.out.println("Brand: " + brand + ", Battery Life: " + batteryLife + " hours");
    }
}

// Subclass: Smartphone
class Smartphone extends Gadget {
    int cameraMP;

    public Smartphone(String brand, int batteryLife, int cameraMP) {
        super(brand, batteryLife);
        this.cameraMP = cameraMP;
    }

    public void displaySmartphoneInfo() {
        displayInfo();
        System.out.println("Camera: " + cameraMP + " MP");
    }
}

// Subclass: Laptop
class Laptop extends Gadget {
    double screenSize; // in inches

    public Laptop(String brand, int batteryLife, double screenSize) {
        super(brand, batteryLife);
        this.screenSize = screenSize;
    }

    public void displayLaptopInfo() {
        displayInfo();
        System.out.println("Screen Size: " + screenSize + " inches");
    }
}

// Demo class
public class GadgetDemo {
    public static void main(String[] args) {
        Smartphone phone = new Smartphone("Apple", 20, 12);
        Laptop laptop = new Laptop("Dell", 10, 15.6);

        phone.displaySmartphoneInfo();
        laptop.displayLaptopInfo();
    }
}
