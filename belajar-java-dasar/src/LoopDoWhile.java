public class LoopDoWhile {
    public static void main(String[] args) {
        int counter = 10;
        do {
            System.out.println("Perulangan " + counter);
            counter++;
        } while (counter == 10); // ingat bahwa while condition = boolean statement yg hasilnya true/false.

        do {
            System.out.println("Perulangan " + counter);
            counter++;
        } while (counter <= 14);

        do {
            System.out.println("Perulangan " + counter);
            // kalo gak ada counter++ di sini, loop non-stop.
            ++counter;
        } while (counter <= 19);
    }
}
