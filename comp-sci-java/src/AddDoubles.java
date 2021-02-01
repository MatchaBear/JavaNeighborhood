import java.util.Scanner;

class AddDoubles {
    public static void main(String[] args) {

        double first, second, sum;
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the first double: ");
        first = scan.nextDouble();

        System.out.println("Enter the second double: ");
        second = scan.nextDouble();

        sum = first + second;
        System.out.println("The sum of " + first + " and " + second + " is " + sum);
    }
}
