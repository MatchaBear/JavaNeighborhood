import java.util.Scanner;

class DoubleDouble {
    public static void main(String[] args) {
        double value;
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a double: ");
        value = scan.nextDouble();

        System.out.println("Value = " + value + ", and its twice value = " + 2 * value);
    }
}
