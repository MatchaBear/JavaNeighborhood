import java.util.Scanner;

public class LoopExample2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int count, limit;

        System.out.println("Enter initial value: ");
        count = scan.nextInt();
        System.out.println("Enter limit   value: ");
        limit = scan.nextInt();

        while (count < limit) {
            System.out.println("count is: " + count);
            count++;
        }
        System.out.println("Done with the loop.");
    }
}
