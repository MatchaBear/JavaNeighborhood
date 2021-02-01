public class LoopFor3 {
    public static void main(String[] args) {
        int nomorUrut = 1;
        for (; nomorUrut<=10;nomorUrut++){ // ingat bahwa while condition = boolean statement yg hasilnya true/false.
            System.out.println(nomorUrut); // ingat bahwa by default, ketika coding, gak ada yg di-print, unless lu do 'print'.
            System.out.println();

        }; // ga perlu titik koma di sini juga gpp.

        String startShout = " Grak";
        for (var gerakanSenam =1; gerakanSenam<=8; ++gerakanSenam){
            System.out.println(gerakanSenam + startShout);
        }

        System.out.println();

        for (int gerakanSenam =1; gerakanSenam<=8; gerakanSenam++){
            System.out.println(gerakanSenam + startShout);
        }
    }
}
