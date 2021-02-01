public class LoopWhile {
    public static void main(String[] args) {

        // maunya kluarin angka ganjil mulai dari 1 - 13.

        int angkaGanjil = 1;

        while (angkaGanjil<=13){ // ingat bahwa while condition = boolean statement yg hasilnya true/false.
            System.out.println("Angka Ganjil "+angkaGanjil);
            ++angkaGanjil;
        }
        ++angkaGanjil;
        ++angkaGanjil;
    // logicnya adl: ketika (while) angkaGanjil kurang dari 13 dibagi 2 hasil sisa baginya = 1, print that angkaGanjil.
    }
}
