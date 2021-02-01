public class MobilApp {
    public static void main(String[] args) {
        Mobil mobil1 = new Mobil();
        mobil1.brand = "Toyota";
        mobil1.name = "Kijang";
        mobil1.color = "Biru";
        mobil1.lotereMingguan(2);

        Mobil mobil2 = new Mobil();
        mobil2.brand = "Honda";
        mobil2.name = "Mobilio";
        mobil2.color = "Hitam";
        mobil2.lotereMingguan(1);

        Mobil mobil3 = new Mobil();
        mobil3.brand = "Mercedes";
        mobil3.name = "Benz";
        mobil3.color = "Maroon";
        mobil3.lotereMingguan(4);

        Mobil mobil4 = new Mobil("Mitsubishi","Eclipse Cross","Merah");
        mobil4.lotereMingguan(1);

        var mobil5 = new Mobil("Renault","Triber","Kuning");
        mobil5.lotereMingguan(2);

        Mobil mobil6;
        mobil6 = new Mobil("KIA", "Seltos");
        mobil6.lotereMingguan(1);

    }
}
