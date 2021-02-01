import java.util.Scanner;

class SweaterPurchase {
    public static void main(String[] args) {
        final int sweaterPrice = 4495;
        Scanner scan = new Scanner(System.in);

        int cash;

        System.out.println("How much do you have, in pennies?");
        cash = scan.nextInt();

        if (cash >= sweaterPrice)
            System.out.println("You can buy the sweater.");
        else {
            System.out.println("You can't buy the sweater.");
            System.out.println("You need " + (sweaterPrice - cash) + " pennies extra.");
        }
    }
}
