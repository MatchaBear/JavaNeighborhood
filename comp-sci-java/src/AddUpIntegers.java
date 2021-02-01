import java.util.Scanner;

public class AddUpIntegers {
    public static void main(String[] args) {

        int n, count, sumOdd, sumEven, sumAll;
        sumAll = 0;
        sumOdd = 0;
        sumEven = 0;

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter limit value: ");
        n = scan.nextInt();
        count = 1;

        while (count <= n) {
            sumAll = sumAll + count;
            if (count % 2 == 0) {
                sumEven = sumEven + count;
            }
            if (count % 2 == 1) {
                sumOdd = sumOdd + count;
            }
            count = count + 1;
        }
        System.out.print("Sum of all: " + sumAll);
        System.out.print("\tSum of even: " + sumEven);
        System.out.println("\tSum of odd: " + sumOdd);
    }
}
