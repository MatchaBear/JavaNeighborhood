public class KonversiNumber {
    public static void main(String[] args) {
        byte iniByte = 100;
        short iniShort = iniByte;
        int iniInt = iniShort;


        // byte iniByte2= iniInt; ERROR

        // short iniShort2 = iniInt; ERROR

        byte iniByte2 = (byte) iniInt;
        short iniShort2 = (short) iniInt;

        short iniShort3 = 130;
        byte iniByte3 = (byte) iniShort3;

        System.out.println(iniByte3);

        int iniInt2 = 1000;
        char iniChar = (char) iniInt2; // tes konversi dari tipe data int ke tipe data char.
        System.out.println(iniChar);
    }
}
