// Base class
class Animal {
    String name;
    int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void showDetails() {
        System.out.println("Name: " + name + ", Age: " + age + " years");
    }
}

// Subclass: Dog
class Dog extends Animal {
    String breed;

    public Dog(String name, int age, String breed) {
        super(name, age);
        this.breed = breed;
    }

    public void showDog() {
        showDetails();
        System.out.println("Breed: " + breed);
    }
}

// Subclass: Bird
class Bird extends Animal {
    boolean canFly;

    public Bird(String name, int age, boolean canFly) {
        super(name, age);
        this.canFly = canFly;
    }

    public void showBird() {
        showDetails();
        System.out.println("Can Fly: " + canFly);
    }
}

// Demo class
public class AnimalDemo {
    public static void main(String[] args) {
        Dog dog = new Dog("Buddy", 3, "Golden Retriever");
        Bird bird = new Bird("Tweety", 1, true);

        dog.showDog();
        bird.showBird();
    }
}
