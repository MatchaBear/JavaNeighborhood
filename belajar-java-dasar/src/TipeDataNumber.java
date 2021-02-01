public class TipeDataNumber {
    public static void main(String[] args) {

        byte iniByte = 100;
        short iniShort = 1000;
        int iniInt = 100000000;
        long iniLong = 1000000000;
        long iniLong2 = 1000000000L;

        byte iniByte2;
        short iniShort2;
        int iniInt2;
        long iniLong3;
        long iniLong4;

        iniByte2 = 102;
        iniShort2 = 1003;
        iniInt2 = 100000002;
        iniLong3 = 1000000000;
        iniLong4 = 1000000000L;

        float iniFloat = 10.2222f;
        double iniDouble = 10.2222;

        int decimalInt=25;
        int hexInt = 0xa132b;
        int binaryInt = 0b10101010101011;

        System.out.println(binaryInt);

        final String application = "Belajar Java";
        // application = "Belajar Python"; // error: variabel final gak bisa diganti valuenya;
        // String application = "Belajar Python"; // error: variable "application" is already defined in the scope;
    }
}
