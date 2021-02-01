public class KonversiPrimitifKeBukanPrimitif {
    public static void main(String[] args) {

        byte byte01 = 100;
        short short01 = byte01;

        Short shortObject = short01;
        Byte byteObject = shortObject.byteValue();

        byte byte02 = (byte) short01;

        byte umur = 32;
        Short umurObject = (short) umur;

        System.out.println(umurObject);

        byte jumlahKamar = 3;
        short jmlKamar = (short) jumlahKamar;
        Short jmlKamarObject = jmlKamar;
        byte jumlahKamarLagi = jmlKamarObject.byteValue();
        System.out.println(jumlahKamarLagi);

        int tissueSebungkus = 200;
        Short tissueSebungkusObject = (short) tissueSebungkus;

        byte stokAqua = 6;
        // salah provide tipe data: Short stokAquaObject2 = stokAqua; <-- stokAqua adalah tipe data byte.
        Short stokAquaObject2 = (short) stokAqua; // baris ini ubah paksa dari data byte ke data short lalu konvert ke tipe data Bukan Primitif / object.

        // mestinya konversi yg normal itu kek di bawah:
        short stokAquaShort = stokAqua; // baris ini ngikutin Widening Casting (konversi otomatis).
        Short stokAquaObject1 = stokAquaShort; // stokAquaShort yg adalah short dikonvert ke Short.

        // ERROR, karena stokAquaObject1 adlh Short: Byte stokAquaByteObject = stokAquaObject1;
        Byte stokAquaByteObject = stokAquaObject1.byteValue(); // ingat bahwa si stokAquaObject1 adlh Short; dan ini adalah konversi ke Bukan Primitif.
        System.out.println(stokAquaByteObject);
        byte stokAquaBytePrimitif = stokAquaObject1.byteValue(); // ini sama dengan atas, hanya saja ini konversi ke tipe data Primitif.
        // ini dari atas (short) ke bawah (byte).
        System.out.println(stokAquaBytePrimitif);

        int stokAquaIntPrimitif = stokAquaObject1.intValue(); // ini sama dengan atas, cuman dari bawah (short) ke atas (int).
        long stokAquaLongPrimitif = stokAquaObject1.longValue(); // sama dgn atas, ke atasnya lagi (long).
        float stokAquaFloatPrimitif = stokAquaObject1.floatValue(); // sama dgn atas, ke atasnya lagi (float).
        double stokAquaDoublePrimitif = stokAquaObject1.doubleValue(); // sama dgn atas, ke atasnya lagi (double).

        Long amount = 1_000_000L;
        System.out.println(amount.intValue());
        amount.floatValue(); // ini apa ya ?? kenapa gak error, padahal ga diapa2in.
        amount.doubleValue(); // ini apa ya ?? kenapa gak error, padahal ga diapa2in.





    }
}
