public class Method3 {
    public static void main(String[] args) {
        operasiPenjumlahan(100, 200);
        operasiPenjumlahan(1000, 2000);
    }

    static int operasiPenjumlahan(int angkaPertama, int angkaKedua) {
        var hasil = angkaPertama + angkaKedua;
        System.out.println(hasil); // ini gak ada di contoh. di contoh bang Eko, print nya di 'main' function.
        return hasil;
    }
}
