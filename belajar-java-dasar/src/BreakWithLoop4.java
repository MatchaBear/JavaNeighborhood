public class BreakWithLoop4 {
    public static void main(String[] args) {
        int counter = 1;
        while (counter <= 4) {
            System.out.println(counter);
            counter++;
        }

        int countress = 1;
        while (true) {
            System.out.println(countress);
            countress++;
            if (countress > 9) { break; // artinya baris ini: ketika nilai countress uda lebih dari 9, jgn ngulang lagi ke atas.
            }
        }
    }
}
