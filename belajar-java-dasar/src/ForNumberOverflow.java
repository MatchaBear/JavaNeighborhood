public class ForNumberOverflow {
    public static void main(String[] args) {
        short iniShort = 128;
        byte a = (byte)iniShort;
        System.out.println(a);
        for(;a<iniShort;a++){
            // System.out.println(a);
        }
    }
}
