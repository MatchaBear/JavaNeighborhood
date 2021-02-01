public class operasiTernary {
    public static void main(String[] args) {

        // gunanya: untuk mempersingkat ifStatement;

        // tanpa Ternary operator:
        var nilai = 69;
        String ucapan;

        if(nilai >= 70) {
            ucapan = "Selamat Anda Lulus";
        }
            else {
                ucapan = "Silakan Coba Lagi";
            }
        System.out.println(ucapan);

        // operasi Ternary mulai dari sini
            var nilai2 = 77;
            String ucapan2 = nilai2 >= 70 ? "Selamat Anda Lulus" : "Silakan Coba Lagi";

        System.out.println(ucapan2);

    }

}
