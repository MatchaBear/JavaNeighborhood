class Wisata {
    String lokasi;
    int jumlahPeserta;
    String pemanduWisata;

    Wisata(String lokasi, int jumlahPeserta, String pemanduWisata) {
        this.lokasi = lokasi;
        this.jumlahPeserta = jumlahPeserta;
        this.pemanduWisata = pemanduWisata;
        System.out.println(this.lokasi);
    }

    double totalBiaya() {
        switch (lokasi) {
            case "Bali":
                double biayaPerjalanan = 0.85 * jumlahPeserta * 4_000_000;
                System.out.println("Total biaya perjalanan Anda: " + biayaPerjalanan);
                return biayaPerjalanan;
            case "Lombok":
                biayaPerjalanan = 0.80 * jumlahPeserta * 4_500_000;
                System.out.println("Total biaya perjalanan Anda: " + biayaPerjalanan);
                return biayaPerjalanan;
            case "Raja Ampat":
                biayaPerjalanan = 0.70 * jumlahPeserta * 9_000_000;
                System.out.println("Total biaya perjalanan Anda: " + biayaPerjalanan);
                return biayaPerjalanan;
            default:
                return 0;

        }
    }
}
