public class TipeDataBukanPrimitif {
    public static void main(String[] args) {

        Byte byteBukanPrimitif1 = 100;
        Short shortBukanPrimitif1 = 32766;

        // ERROR integer number too large:
        // Integer intBukanPrimitif1 = 2_000_000_000_999;

        Integer intBukanPrimitif = 1_999_999_999;
        Long longBukanPrimitif = 2_999_999_999L;

        Long long1;
        long1 = 3_000_000_000L;

        Long long2;

        // ERROR ketika dipanggil:
        // variabel long2 belum di-inisialisasi.
        // System.out.println(long2);

        Long long3 = 4_000_000_000L;
        System.out.println(long3);

        Byte byte01 = null;
        System.out.println(byte01);

        

    }
}
