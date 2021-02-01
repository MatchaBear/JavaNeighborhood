public class SwitchYield {
    public static void main(String[] args) {
        String mobil = "Wuling";
        switch (mobil){
            case "Toyota":
                System.out.println("Anda Menang!");
                // jadi sebenernya di sini perlu dikasi "break".
            case "Wuling":
                System.out.println("Anda Juara Ke-2!");
                // setelah ditambahin break di sini jadi normal outputnya.
            case "Suzuki":
                System.out.println("Anda Juara Ke-3!");
                // jadi sebenernya di sini perlu dikasi "break".
            default:
                System.out.println("Maaf Anda Kurang Beruntung!");
        } // switch ga perlu titik koma kah ?
// sout 1

        String ucapan;
        switch (mobil){
            case "Toyota" -> ucapan = "Anda Menang!";
            case "Wuling"-> ucapan = "Anda Juara Ke-2!";
            case "Suzuki"-> ucapan = "Anda Juara Ke-3!";
            default->ucapan="Maaf Anda Kurang Beruntung!";
        } // switch ga perlu titik koma kah ?
        System.out.println(ucapan);
// sout 2 --> ini kenapa juara ke - 3 ???

        ucapan = switch (mobil){
            case "Toyota":
                yield "Anda Menang!";
            case "Wuling":
                yield "Anda Juara Ke-2!";
            case "Suzuki":
                yield "Anda Juara Ke-3!";
            default:
                yield "Maaf Anda Kurang Beruntung!";
        };
        System.out.println(ucapan);
// sout 3

        ucapan = switch (mobil){
            case "Toyota": yield "Anda Menang!";
            case "Wuling": yield "Anda Juara Ke-2!";
            case "Suzuki": yield "Anda Juara Ke-3!";
            default: yield "Maaf Anda Kurang Beruntung!";
        };
        System.out.println(ucapan);
// sout 4

        String ucapan2;
        ucapan2 = switch (mobil){
            case "Toyota","Wuling": yield "Anda Juara 1!";
            case "Suzuki": yield "Anda Juara 2!";
            default: yield "Maaf Anda Kurang Beruntung!";
        };
        System.out.println(ucapan2);
// sout 5

    }
}
