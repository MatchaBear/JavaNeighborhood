import java.util.Scanner;

public class SweaterPurchaseReverse {
    public static void main(String[] args) {

        final int price = 4495;

        Scanner scan = new Scanner(System.in);

        int cash;

        System.out.println("How much do you have, in pennies?");
        cash = scan.nextInt();

        if (price > cash) {
            System.out.println("You can't buy the sweater.");
            System.out.println("You need " + (price - cash) + " extra pennies.");
        } else
            System.out.println("You can buy the sweater.");
    }
}
