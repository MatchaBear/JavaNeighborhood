public class WisataApp {
    public static void main(String[] args) {

        Wisata order1 = new Wisata("Bali", 2, "Pak Togel");
        Wisata order2 = new Wisata("Lombok", 4, "Pak Ahmed");

        System.out.println("Halaman Kesimpulan");
        System.out.println("Tujuan Wisata: " + order1.lokasi);
        System.out.println("Jumlah Peserta: " + order1.jumlahPeserta + " orang");
        System.out.println("Pemandu Wisata dengan " + order1.pemanduWisata);
        order1.totalBiaya();

        System.out.println("Halaman Kesimpulan");
        System.out.println("Tujuan Wisata: " + order2.lokasi);
        System.out.println("Jumlah Peserta: " + order2.jumlahPeserta + " orang");
        System.out.println("Pemandu Wisata dengan " + order2.pemanduWisata);
        order2.totalBiaya();
    }

}
