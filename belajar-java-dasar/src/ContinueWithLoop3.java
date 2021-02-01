public class ContinueWithLoop3 {
    public static void main(String[] args) {
        for (var counter = 1; counter <= 10; counter++) {
            if (counter % 2 == 0) { // kalo habis dibagi 2 jangan print (jgn ke bawah, tapi cek lagi ke atas).
                continue;
            }
            System.out.println(counter);
        }
        System.out.println();
    }
}
