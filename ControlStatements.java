public class ControlStatements {
    public static void main(String[] args) {
        int customNum = 3;

        if (customNum > 0) {
            if (customNum % 2 == 0) {
                System.out.println("Positive Even number");
            } else {
                System.out.println("Positive Odd number");
            }
        } else if (customNum < 0) {
            if (customNum % 2 == 0) {
                System.out.println("Negative Even number");
            } else {
                System.out.println("Negative Odd number");
            }
        } else {
            System.out.println("Zero (neither positive nor negative)");
        }

        switch (customNum) {
            case 1:
                System.out.println("One");
                break;
            case 2:
                System.out.println("Two");
                break;
            case 3:
                System.out.println("Three");
            default:
                System.out.println("Default case");
        }

        for (int i = 0; i < 3; i++) {
            if (i == 1) continue;
            System.out.println("for: " + i);
        }

        int customW = 0;
        while (customW < 2) {
            System.out.println("while: " + customW);
            customW++;
        }

        int customDW = 0;
        do {
            System.out.println("do-while: " + customDW);
            customDW++;
        } while (customDW < 2);

    }
}
