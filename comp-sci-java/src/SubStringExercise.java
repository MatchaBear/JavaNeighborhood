public class SubStringExercise {
    public static void main(String[] args) {
        String str = new String ("Golf is a good walk spoiled"); // create the original object.
        String sub = str.substring(1); // create a new object from the original.
        System.out.println(sub);
        /* character numbering starts at zero.
        Golf is a good walk spoiled
        012345678901234567890123456
        */
    }
}
