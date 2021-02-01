public class BreakWithLoop {
    public static void main(String[] args) {
        var counter = 10;
        while (true) {
            System.out.println("Perulangan " + counter); // pasti ini angka 10 nya ke-print, tapi di bawah ditambahin.
            counter++; // di sini ditambahin 1 jadi 10+1=11.

            if (counter <= 10) { // 11 gak <=10, jadi gak dihentikan (gak di-break).
                break;
            }
        }
    }
}
