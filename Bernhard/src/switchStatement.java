public class switchStatement {
    public static void main(String[] args) {

        var nilai = "A";

        switch (nilai) {

            case "A":
                System.out.println("Anda Lulus Dengan Baik");
                break;
            case "B":
            case "C":
                System.out.println("Nilai Anda Cukup Baik");
                break;
            case "D":
                System.out.println("Nilai Anda Tidak Cukup Untuk Lulus");
            default:
                System.out.println("Mungkin Anda Salah Jurusan");
        }

        // contoh switch lambda 1
        var nilai2 = "Z";
        switch (nilai2) {
            case "A" -> System.out.println("nilai2 - Anda Lulus Dengan Baik");
            case "B", "C" -> System.out.println("nilai2 - Nilai Anda Cukup Baik");
            case "D" -> System.out.println("nilai2 - Nilai Anda Tidak Cukup Untuk Lulus");
            default -> {
                System.out.println("nilai2 - Mungkin Anda Salah Jurusan");
                System.out.println("nilai2 - Anda Bandel");
            }
        }

        // contoh switch lambda 2
        var nilai3 = "K";
        String ucapan;
        switch (nilai3) {
            case "A" -> ucapan = "Anda Lulus Dengan Baik";
            case "B", "C" -> ucapan = "Nilai Anda Cukup Baik";
            case "D" -> ucapan = "Nilai Anda Tidak Cukup Untuk Lulus";
            default -> {
                ucapan = "Mungkin Anda Salah Jurusan";
            }
        }                        // gak perlu titik koma di sini ???
        System.out.println(ucapan);

        // contoh switch yield;

        var nilai4 = "C";
        String ucapan2 = switch (nilai4) {
            case "A":
                yield "nilai4 - Anda Lulus Dengan Baik";
            case "B", "C":
                yield "nilai4 - Nilai Anda Cukup Baik";
            case "D":
                yield "nilai4 - Nilai Anda Tidak Cukup Untuk Lulus";
            default:
                yield "nilai4 - Mungkin Anda Salah Jurusan";
        };
        System.out.println(ucapan2);

    }
}

