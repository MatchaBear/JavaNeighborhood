public class operasiBoolean
{
    public static void main(String[] args) {
        // && AND -- hanya TRUE kalo kiri kanan both TRUE
        // || OR -- hanya FALSE kalo kiri kanan both FALSE

        var absen = 70;
        var nilaiAkhir = 80;

        boolean lulusAbsen = absen >= 75; // karena && || ! fungsinya dan hasilnya TRUE / FALSE, maka pake boolean
        boolean lulusNilai = nilaiAkhir >= 75;

        var lulus = lulusAbsen && lulusNilai; // operasi perbandingan (&& || ! itu gunanya membandingkan nilai TRUE & FALSE
        System.out.println(lulus);


        var absen2 = 60;
        var nilaiAkhir2 = 70;

        boolean lulusAbsen2 = absen >= 70;
        boolean lulusNilai2 = absen >= 70;

        var lulus2 = lulusAbsen2 || lulusNilai2;
        System.out.println(lulus2);


    }
}
