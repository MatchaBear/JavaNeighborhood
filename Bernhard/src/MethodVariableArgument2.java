public class MethodVariableArgument2 {
    // dengan variable argument
    public static void main(String[] args) {

        congratulations("Eko",90,49,50,39,50,70,69,70,89,98,67,99); // dengan variable argument, ga perlu bikin array;
    }

    static void congratulations(String nama, int... semuaNilai){ // void karena gak ada "return" di bawah ??
        var totalNilai = 0;
        for(var nilai:semuaNilai){ // kalo di-hover di semuaNilai, tipe datanya mengikuti, jadi gak ada perubahan kode di bawah;
            totalNilai+=nilai;
        }
        var rataRata = totalNilai/ semuaNilai.length;

        if(rataRata >= 70) {
            System.out.println("Selamat " + nama + ", Anda Lulus");
        } else if(rataRata >=90) {
            System.out.println("Selamat " + nama + ", Anda Lulus Cum Laude");
        } else {
            System.out.println("Maaf " + nama + ", Anda Kurang Beruntung");
        }
    }

}
