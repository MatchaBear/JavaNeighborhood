import java.util.Scanner;

class CarPurchase {
    public static void main(String[] args) {
        final int basePrice = 20000;
        final int pinPrice = 250;
        final int brakePrice = 800;

        Scanner scan = new Scanner(System.in);
        int answer;
        int totalCost = basePrice;

        System.out.print("Do you want pin stripes? (0 or 1): ");
        answer = scan.nextInt();
        if (answer == 1)
            totalCost = totalCost + pinPrice;

        System.out.print("Do you want anti-lock brakes? (0 or 1): ");
        answer = scan.nextInt();
        if (answer == 1)
            totalCost = totalCost + brakePrice;

        System.out.println("Total cost is: $" + totalCost);
    }
}
