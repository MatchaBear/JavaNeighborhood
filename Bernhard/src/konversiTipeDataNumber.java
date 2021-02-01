public class konversiTipeDataNumber {


    public static void main(String[] args) {

    byte iniByte = 10;
    short iniShort = iniByte;
    int iniInt = iniShort;

        // ini ga bisa     byte iniByte2 = iniInt

        // tidak number overflow int iniInt2 = 127;
    int iniInt2 = 128; // number overflow
    byte iniByte2 = (byte) iniInt2;
        System.out.println(iniByte2);
    }

}