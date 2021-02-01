import java.util.Date;

public class expressionStatement {
    public static void main(String[] args) {

        int value; // ini adalah expression , karena masih belum lengkap
        value = 10; // ini adalah expression, karena masih belum lengkap

        System.out.println(value = 100); // ini adalah statement

        // assignment statement
        double aValue = 8933.234;

        // increment statement
        aValue++;

        // method invocation statement
        System.out.println("Hello World!");

        // object creation statement
        Date date = new Date();

    }
}
