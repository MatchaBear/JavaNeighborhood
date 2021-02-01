public class FloatLoopControlVariable {
    public static void main(String[] args) {

        float inc = 0.1F;
        float value = 0.0f;

        float limit = 10.100003f;

        while (value < limit) {
            System.out.println("Value: " + value);
            value = value + inc;
        }
        System.out.println("Value was " + value + " when the loop ended.");
    }
}
