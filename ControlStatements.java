public class ControlStatements {
    public static void main(String[] args) {
        int num = 3;

        // if-else
        if (num > 0) {
            System.out.println("Positive number");
        } else {
            System.out.println("Non-positive number");
        }

        // switch
        switch (num) {
            case 1:
                System.out.println("One");
                break;
            case 2:
                System.out.println("Two");
                break;
            case 3:
                System.out.println("Three");
                // No break; will fall through
            default:
                System.out.println("Default case");
        }

        // for loop
        for (int i = 0; i < 3; i++) {
            if (i == 1) continue; // Skips when i is 1
            System.out.println("for: " + i);
        }

        // while loop
        int w = 0;
        while (w < 2) {
            System.out.println("while: " + w);
            w++;
        }

        // do-while loop
        int dw = 0;
        do {
            System.out.println("do-while: " + dw);
            dw++;
        } while (dw < 2);
    }
}
