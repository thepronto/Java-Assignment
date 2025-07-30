class DemoAccess {
    public int pubVar = 1;
    private int privVar = 2;
    static int staticVar = 3;

    public void show() {
        System.out.println("Public variable: " + pubVar);
        System.out.println("Private variable: " + privVar);
        System.out.println("Static variable: " + staticVar);
    }
}

public class AccessModifiers {
    public static void main(String[] args) {
        DemoAccess obj = new DemoAccess();
        obj.show();
        System.out.println("Accessing static variable: " + DemoAccess.staticVar);
    }
}
