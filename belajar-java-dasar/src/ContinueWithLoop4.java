public class ContinueWithLoop4 {
    public static void main(String[] args) {
        for (var counter = 1; counter <= 10; counter++) {
            if (counter % 2 == 1) {
                continue;
            }
            System.out.println(counter);
        }
    }
}
