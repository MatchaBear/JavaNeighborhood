public class Komentar {
    public static void main(String[] args) {
        tambahin(1, 2);
        System.out.println(tambahin(1, 4)); // outputs dobel karna di method nya sendiri udah ada println .
    }
    /*
    keterangan baris 1
    keterangan baris 2
     */

    /**
     * @param value1 angka pertama
     * @param value2 angka kedua
     * @return hasil penjumlahan value1 dan value2
     */


    static int tambahin(int value1, int value2) {
        System.out.println(value1 + value2);
        // tambahin value1 dengan value2
        return value1 + value2;
    }

}
