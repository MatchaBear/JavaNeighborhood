public class LoopWhile2 {
    public static void main(String[] args) {
        int playNumber1 = 1;
        // begin loop
        while (playNumber1 <= 10) { // ingat bahwa while condition = boolean statement yg hasilnya true/false.
            System.out.println(playNumber1);
            ++playNumber1;
        }
        playNumber1 = 2;
        // end loop
    }
}
