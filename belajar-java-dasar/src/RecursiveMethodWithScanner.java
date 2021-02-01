import java.util.Scanner;

public class RecursiveMethodWithScanner {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Please enter a number: ");
        int angkaInput = scan.nextInt();
        System.out.println(factorialLoop(angkaInput));
    }

    static int factorialLoop(int value) {
        int result = 1;
        for (int counter = 1; counter <= value; counter++) {
            result *= counter;
        }
        return result;
    }
}
