
class Instrument {
    public void play() {
        System.out.println("Instrument is being played");
    }
}

// Concrete subclasses
class Guitar extends Instrument {
    @Override
    public void play() {
        System.out.println("Guitar is strummed");
    }
}

class Piano extends Instrument {
    @Override
    public void play() {
        System.out.println("Piano keys are played");
    }
}

class Drums extends Instrument {
    @Override
    public void play() {
        System.out.println("Drums are beaten");
    }
}

// Demo class
public class InstrumentDemo {
    public static void main(String[] args) {
        Instrument i1 = new Guitar();
        Instrument i2 = new Piano();
        Instrument i3 = new Drums();

        i1.play();
        i2.play();
        i3.play();

        // Using polymorphism in an array
        Instrument[] instruments = { new Guitar(), new Piano(), new Drums() };
        for (Instrument i : instruments) {
            i.play();
        }
    }
}
