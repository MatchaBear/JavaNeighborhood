public class DecrementLoopCount {
    public static void main(String[] args) {
        int count, decrement;
        count = 6;
        // decrement = -1; // careful this loop is going to last forever.
        decrement = 7;
        while (count >= 0) {
            System.out.println("count " + count);
            count = count - decrement;
        }
        System.out.println("Count was " + count + " when it failed the test");
    }
}
