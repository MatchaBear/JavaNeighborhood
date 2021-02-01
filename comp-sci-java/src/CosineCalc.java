import java.util.Scanner;

class CosineCalc {
    public static void main(String[] args) {

        double value;
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter radians: ");
        value = scan.nextDouble();

        double result = Math.cos(value);
        System.out.println("Cosine: " + result);
    }
}
