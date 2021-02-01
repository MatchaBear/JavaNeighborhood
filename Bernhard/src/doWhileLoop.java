public class doWhileLoop {
    public static void main(String[] args) {
        var counter = 100;
        // dengan while:

        while(counter <=10) {
            System.out.println("Perulangan " + counter);
            counter++; // hasil tidak ada, karena dari awal udah 100 (di atas 10);
        }
        // dengan do while loop:
        do{
            System.out.println("Perulangan "+counter); // counter nilainya masih 100;
            counter++;
        } while (counter<=10);


        var counter2 = 103;
        do{
            System.out.println("Loop "+counter2);
            counter2+=2;
        } while (counter2<105);
    }
}
