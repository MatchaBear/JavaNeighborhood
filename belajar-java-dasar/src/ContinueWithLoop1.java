public class ContinueWithLoop1 {
    public static void main(String[] args) {
        // perulangan output bilangan ganjil <=100
        for (var counter = -2; counter <= 100; counter++) {
            if (counter % 2 == 0) { continue; // di sini artinya: kalo bilangannya habis dibagi, jgn lanjutin ke bawah tapi ulang ke atas ke if.
            }
            System.out.println("Perulangan Ganjil " + counter);
        }
    }
}
