public class Segitiga2 {
    public static void main(String[] args) {

        String triangle = "#";

        for (int count = 0; count < 7; count++) {
            System.out.println(triangle += triangle);
        }
    }
}