import java.util.Scanner;

class Echo {
    public static void main(String[] args) {

        String inData;                                      // initialize variable inData.
        Scanner scan = new Scanner(System.in);              // create new object (object reference variable nya = "scan").

        System.out.println("Enter the data: ");             // print ke monitor
        inData = scan.nextLine();                           // scan.nextLine() disimpan di inData.

        System.out.println("You entered: " + inData);
    }
}
