public class BreakWithLoop3 {
    public static void main(String[] args) {
        int counter = 1;
        // gak bisa kalo false:            while (false) {
        // unreachable statement:          System.out.println(counter);
        while (true) {
            System.out.println(counter);
            counter++;
            if (counter > 10) { // sampe 10 baris. 11 gak di-print karna begitu > 10 dihentikan (di-break).
                break;
            }
        }

    }
}
