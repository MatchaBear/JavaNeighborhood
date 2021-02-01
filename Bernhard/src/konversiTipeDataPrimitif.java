public class konversiTipeDataPrimitif {

    public static void main(String[] args) {

        Integer iniInteger = 3000;
        Long iniLong = 200000000L;

        int iniInt = 100;
        Integer iniInteger2 = iniInt; // konversi Primitif ke Bukan Primitif;

        System.out.println(iniInteger2);
       // Byte iniByte = iniInteger;


        int umur = 32;
        Integer umurObject = umur; // konversi Primitif ke Bukan Primitif;

        // int umurObject = umurLagi; (KEBALIK BOS) ;

        int umurLagi = umurObject; // konversi kembali dari Bukan Primitif ke Primitif;

        long umur2 = umur;
        // long iniLong2 = umurLagi; GAK ERROR karena ini dari Primitif ke Primitif & dari rendah (int) ke tinggi (long);
        Long longUmur = umur2;
        System.out.println(longUmur); // hasil = 32

        short shortUmur = (short) umur2; // umur2 adalah long (Primitif) jadi GA ERROR;
        byte byteUmur = longUmur.byteValue();
        short shortUmur2 = longUmur.shortValue();
        float floatUmur = longUmur.floatValue();
        double doubleUmur = longUmur.doubleValue();

        Long amount = 10_000_000L;
        amount.byteValue();
        amount.shortValue();

        System.out.println(shortUmur); // hasil = 32
        System.out.println(byteUmur); // hasil = 32
        System.out.println(shortUmur2); // hasil = 32
        System.out.println(floatUmur); // hasil = 32.0
        System.out.println(doubleUmur); // hasil = 32.0

        System.out.println(amount); // hasil = 10,000,000




    }
}
