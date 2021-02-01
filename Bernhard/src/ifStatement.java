public class ifStatement {
    public static void main(String[] args) {
        // cara pendek
        var nilai = 70;
        var absen = 80;

        if (nilai >= 75 && absen >= 75) {
            System.out.println("Selamat Anda Lulus"); // hasil = False makanya gak keliatan apa2 di output;
        } else {
                System.out.println("Maaf Anda Kurang Beruntung"); // dgn adanya ini, hasil False ada outputnya;
            }
        var nilaiKompleks = 70;
        var absenKompleks = 70;

        if (nilaiKompleks>=90 && absenKompleks>=85) {
            System.out.println("Nilai Anda A");
        }
        else if (nilaiKompleks>=80 && absenKompleks>=75) {
            System.out.println("Nilai Anda B");
        }
        else if (nilaiKompleks>=70 && absenKompleks>=65) {
            System.out.println("Nilai Anda C");
        }
        else if (nilaiKompleks>=60 && absenKompleks>=55) {
            System.out.println("Nilai Anda D");
        }
        else {
            System.out.println("Nilai Anda E");
        }


        // cara panjang
        var nilai2 = 75;
        var absen2 = 80;

        var lulusNilai2 = nilai2 >= 70;
        var lulusAbsen2 = absen2 >= 70;

        var lulus2 = lulusNilai2 && lulusAbsen2;
        if (lulus2) {
            System.out.println("Selamat Anda Lulus");
        }

        // cara harafiah dan panjang
        var nilai3 = 75;
        var absen3 = 80;

        boolean lulusNilai3 = nilai3 >= 70;
        boolean lulusAbsen3 = absen3 >= 70;

        boolean lulus3 = lulusNilai3 && lulusAbsen3;
        if (lulus3) {
            System.out.println("Selamat Anda Lulus");
        }
    }
}
