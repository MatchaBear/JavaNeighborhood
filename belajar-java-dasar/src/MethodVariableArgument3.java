public class MethodVariableArgument3 {
    public static void main(String[] args) {

        jancuk("Yudhis", 25, 50, 45, 39, 27, 44);
        jancuk("Suryadi", 53, 24, 65, 32, 66, 55);

    }

    static void jancuk(String name, int... nilai2x) {
        int total = 0;
        for (int i = 0; i < nilai2x.length; i++) {
            total += nilai2x[i];
        }
        int rata2 = total / nilai2x.length;
        if (rata2 >= 75) {
            System.out.println("Selamat, " + name + " Anda lulus cemerlang! Rata-rata nilai Anda " + "= " + rata2);
        } else if (rata2 >= 60) {
            System.out.println("Selamat, " + name + " Anda lulus dengan nilai pas-pasan. Rata-rata nilai Anda " + "= " + rata2);
        } else {
            System.out.println("Maaf, " + name + " Anda harus mengulang lagi tahun depan. Rata-rata nilai Anda " + "= " + rata2);
            System.out.println("Maaf sekali lagi, saudara " + name);
        }
    }
}
