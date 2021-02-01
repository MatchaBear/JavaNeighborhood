import java.util.Scanner;

class MathLog {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        double value;

        System.out.println("Enter a double: ");
        value = scan.nextDouble();
        double result = Math.log(value);

        System.out.println("Logarithm of " + value + " is " + result);
    }
}
