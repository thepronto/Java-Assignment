class DemoAccess {
    public int publicVariable = 1;
    private int privateVariable = 2;
    static int staticVariable = 3;

    public void show() {
        System.out.println("Public variable: " + publicVariable);
        System.out.println("Private variable: " + privateVariable);
        System.out.println("Static variable: " + staticVariable);
    }

    public void showContributorInfo() {
        System.out.println("Srihari");
        System.out.println("Accessing variables with different access modifiers.");
    }
}

public class AccessModifiers {
    public static void main(String[] args) {
        DemoAccess obj = new DemoAccess();
        obj.show();
        System.out.println("Accessing static variable: " + DemoAccess.staticVariable);
        obj.showContributorInfo();
    }
}
