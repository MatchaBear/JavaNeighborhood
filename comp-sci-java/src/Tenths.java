public class Tenths {
    public static void main(String[] args) {

        double value;
        int tenths, inc;
        tenths = 0;
        inc = 1;

        while (tenths <= 100) {
            value = tenths / 10.0;
            System.out.println("Value: " + value);
            tenths = tenths + inc;
        }
    }
}
