public class TernaryOperator {
    public static void main(String[] args) {
        // tanpa TernaryOperator:
        var nilai = 75;
        String ucapan;

        if(nilai>=75){
            ucapan = "Selamat Anda Lulus";
        } else {
            ucapan = "Maaf, silakan coba lagi";
        }
        System.out.println(ucapan);

        // dengan TernaryOperator:
        String ucapan2 = nilai >= 75 ? "Selamat Anda Lulus" : "Maaf, silakan coba lagi";
        System.out.println(ucapan2);

        String ucapan3 = nilai >= 85 ? "Selamat Anda Lulus Cum Laude!" : "Maaf, silakan coba lagi";
        System.out.println(ucapan3);
    }
}
