public class RemainderExample {
    public static void main(String[] args) {
        int quotient, remainder;
        quotient = 1793 / 4;
        remainder = 1793 % 4;
        System.out.println("The quotient: " + quotient);
        System.out.println("The remainder: " + remainder);
        System.out.println("The original: " + (quotient * 4 + remainder));
        System.out.println("The original: " + quotient * 4 + remainder);
    }
}
