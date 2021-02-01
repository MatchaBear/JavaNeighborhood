public class BreakWithLoop2 {
    public static void main(String[] args) {
        int a = 1;
        while (true) {
            System.out.println("Loop " + a);
            ++a;
            if (a == 10) {
                break; // outputs 9 baris. angka 10 nya gak ke-print karna begitu di sini 10, berhenti (break).
            }
        }
    }
}
