import java.util.Scanner;

class Echo2 {
    public static void main(String[] args) {

        Scanner scan2 = new Scanner(System.in);             // create new object (object reference variable nya = "scan2").
        System.out.println("Enter the data: ");             // print ke monitor

        String inData = new String(scan2.nextLine());       // scan2 = System.in <- keknya artinya nunggu input.

        System.out.println("You entered: " + inData);
    }
}
