import java.util.Scanner;

class RestaurantBill2 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        double basicCost;
        double tipPercent;
        final double fixedTax = .07;

        System.out.print("Enter the basic cost: ");
        basicCost = scan.nextDouble();
        System.out.print("Enter the tip percent: ");
        tipPercent = scan.nextDouble();
        System.out.print("Basic Cost: " + basicCost + " Total Cost: " + (basicCost + basicCost * fixedTax + basicCost * tipPercent / 100));

    }
}
