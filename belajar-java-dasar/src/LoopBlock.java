public class LoopBlock {
    public static void main(String[] args) {
        int i = 1;
        while (i < 6){
            System.out.println(i);
            i++;
        }
        // tricky code to follow. sampe di sini, nilai si i sudah = 6.
        System.out.println(" ");

        System.out.println(i); // jadi ketika disuru print di sini, outputnya 6

        do{
            System.out.println(i); // di sini juga outputnya 6, karna nilai bawaan dari hasil di atas udah = 6 dan 'perintah' print ada di atasnya while.
            i++; // di sini hasilnya udah 7, tapi gak diulang lagi karna i sudah lebih besar dari 6 alias 7.
        } while (i<6);
        System.out.println(i); // ini hasilnya 7 karna di atas nilainya udah jadi 7.

        System.out.println(" ");

        int k = 2;
        do{
            System.out.println(k);
            k++;
        } while (k<6);
    }
}
