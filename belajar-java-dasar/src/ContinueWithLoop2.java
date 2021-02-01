public class ContinueWithLoop2 {
    public static void main(String[] args) {
        for (int port = 1; port <= 48; port++) {
            if (port % 2 == 1) { // dgn kata lain, kalo habis dibagi 2, jangan print, tapi ulang
                continue;
            }
            System.out.println("Interface 1/" + port);
        }
    }
}
