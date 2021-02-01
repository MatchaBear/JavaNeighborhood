import java.util.Scanner;

class EchoSquare {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num, num2, num3, square;
        System.out.println("Enter an integer: ");
        num = scan.nextInt();
        square = num * num;
        System.out.println("The square of " + num + " is " + square + ".");
        num2 = scan.nextInt();
        System.out.println("The next digit: " + num2);
    }
}
