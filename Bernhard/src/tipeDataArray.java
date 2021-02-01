public class tipeDataArray {
    public static void main(String[] args) {
        String[] arrayString;
        arrayString = new String[3];

        String[] stringArray = new String[4];
        stringArray[0] = "B.ernhard";
        stringArray[1] = "Be.rnhard";
        stringArray[2] = "Ber.nhard";
        stringArray[3] = "Bern.hard";

        stringArray[3] = null;


        System.out.println(stringArray[0]);
        System.out.println(stringArray[1]);
        System.out.println(stringArray[2]);
        System.out.println(stringArray[3]);

        int[] arrayInt = new int[]{
                10, 20, 30, 40, 50, 60};
        int[] arrayInt2 = {
                11, 13, 17, 19, 23, 29, 31, 37};
        long[] arrayLong = {
                1000000L, 2002312L, 203203230L, 20323023159L};
        arrayLong[2] = 0;

        System.out.println(arrayLong[2]);
        System.out.println(arrayLong.length);

        String[][] arrayMembers = {
                {"Budi", "Arto"}, {"Meme", "Gaga"}, {"Bernhard", "Hustomo", "Budiarto"}
        };
        System.out.println(arrayMembers[1][1]);
        System.out.println(arrayMembers[2][2]);

        // var[][]  arrayMembers2 = {  -- ERROR

    }
}
