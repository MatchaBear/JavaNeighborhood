import java.util.Scanner;

class CosineCalc2 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter degrees: ");
        double degrees = scan.nextDouble();

        double result = Math.cos(Math.toRadians(degrees));

        System.out.println("Cosine: " + result);

        System.out.println("Cosine: " + Math.cos(Math.toRadians(degrees)));

    }
}
