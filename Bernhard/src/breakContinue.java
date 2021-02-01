public class breakContinue {
    public static void main(String[] args) {

        var counter = 1;
        while (true){
            System.out.println("Perulangan "+counter);
            counter++;

            if (counter>10){
                break;
            }
        }
        System.out.println("Perulangan Berhenti");

        for(int counter2=1; counter2<=100;counter2++) {
            System.out.println("Perulangan All " + counter2); // hasil = keluar semua angka dari 1 - 100;
        }

        for(int counter3=1; counter3<=100;counter3++){
            if (counter3 % 2 == 0){ // baris ini = exclude semua angka genap;
                continue;
            }
            System.out.println("Perulangan Ganjil "+counter3); // hasil = show semua angka Ganjil;
        }

        for(int counter4=1; counter4<=100;counter4++){
            if (counter4 % 2 == 1){ // baris ini = exclude semua angka ganjil;
                continue;
            }
            System.out.println("Perulangan Genap "+counter4); // hasil = show semua angka Genap;
        }

    }
}
