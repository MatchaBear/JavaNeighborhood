import java.util.Scanner;

class RestaurantBill {
    public static void main(String[] args) {
        double basicCost;
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter meal price: ");
        basicCost = scan.nextDouble();

        System.out.println("Basic Cost: " + basicCost + " Total Cost: " + (basicCost + basicCost * 0.06 + basicCost * 0.2));
    }
}
