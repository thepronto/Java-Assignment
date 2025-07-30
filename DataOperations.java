public class DataOperations {
    public static void main(String[] args) {
        int a = 10, b = 5;

        // Arithmetic
        int sum = a + b, diff = a - b, prod = a * b, quot = a / b;

        // Logical
        boolean logic = (a > b) && (b < 20);

        // Bitwise
        int andOp = a & b, orOp = a | b, xorOp = a ^ b;

        System.out.println("Sum: " + sum);
        System.out.println("Difference: " + diff);
        System.out.println("Product: " + prod);
        System.out.println("Quotient: " + quot);
        System.out.println("Logical (a > b && b < 20): " + logic);
        System.out.println("Bitwise AND: " + andOp);
        System.out.println("Bitwise OR: " + orOp);
        System.out.println("Bitwise XOR: " + xorOp);
    }
}
