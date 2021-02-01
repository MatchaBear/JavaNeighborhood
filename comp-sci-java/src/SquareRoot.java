import java.util.*;

class SquareRoot {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        double value;

        System.out.println("Enter a double: ");
        value = scan.nextDouble();
        double result = Math.sqrt(value);

        System.out.println("Square root of " + value + " is " + result);
    }
}
