public class MethodReturnValue {
    public static void main(String[] args) {

        var a = 100;
        var b = 200;
        var c = tambah(a,b);
        System.out.println(c);
    }

        static int tambah(int value1, int value2){
            var total = value1 + value2;
            return total;


    }
}
