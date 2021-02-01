public class forLoop {
    public static void main(String[] args) {

        // nonstop BEGIN:   for (;;){
        // nonstop END:          System.out.println("Perulangan");

        // dengan hanya kondisi yang dideclare:
        var counter = 1;
        for (; counter <= 10; ) { // for statement = selama variabel counter nilainya kurang dari sama dengan 10, lakukan block code di bawahnya;
            System.out.println("Perulangan " + counter);
            counter++;

        }
        System.out.println(counter + " Udah Gak Masuk 10"); // bisa kek gini karna var counter dideclare di luar for;

        // dengan init statement dan kondisi yang dideclare:
        for (var counter2 = 1; counter2 <= 10; ) {
            System.out.println("Loop " + counter2);
            ++counter2;
        }
        // gak bisa kek gini: (karna counter2 dideclare di dalam for) >> System.out.println(counter2 + " Udah Gak Masuk 10");

            // dengan init statement, kondisi, dan post statement yang dideclare:
            for (var counter3 = 1; counter3 <= 10; counter3++) {
                System.out.println("All " + counter3);
            }
        // gak bisa kek gini: (karna counter3 dideclare di dalam for) >> System.out.println(counter3 + " Udah Gak Masuk 10");
        }
    }

