public class MethodVariableArgument2 {
    public static void main(String[] args) {

sayCongrats("Berry",75,84,83,14,93,82,76,77);
    }


    static void sayCongrats(String name, int... nilai2x) {
        var total = 0;
        for (var nilai : nilai2x) {
            total += nilai;
        }
        var rataRata = total / nilai2x.length;
        if (rataRata >= 75) {
            System.out.println("Selamat " + name + ", Anda lulus!");
        } else {
            System.out.println("Maaf " + name + ", Anda belum saatnya lulus.");
        }
    }
}
