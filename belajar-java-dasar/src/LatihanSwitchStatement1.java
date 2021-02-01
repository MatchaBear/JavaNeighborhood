public class LatihanSwitchStatement1 {
    public static void main(String[] args) {
        String nilai = "A";
        switch (nilai) {
            case "A":
                System.out.println("Wow, Anda lulus dengan nilai sangat baik");
            case "B":
            case "C":
                System.out.println("Nilai Anda cukup baik");
            default:
                System.out.println("Silakan coba lagi tahun depan");
        }
    }
}

