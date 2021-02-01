public class LoopFor2 {
    public static void main(String[] args) {
        int StokOpname = 20;
            for(;StokOpname<=25;){
                System.out.println(StokOpname);
                StokOpname++;
            }
        System.out.println(StokOpname); // di sini (=di luar loop) nilai StokOpname udah = 26.
    }
}
