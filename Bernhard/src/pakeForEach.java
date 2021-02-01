public class pakeForEach {
    public static void main(String[] args) {

        System.out.println("Tanpa For Each");
        String[] namaGue = {
                "Berry","Berak","Bernhard",
                "Bermek","Bertolo","BerBer"
        };
        for(int a=0;a<=5;++a){
            System.out.println(namaGue[a]);
        }



        System.out.println("Dengan For Each");
        for(String nama:namaGue){ // each of namaGue itu sama dengan "nama";
            System.out.println(nama);
        }
    }
}
