public class RecursiveMethod {
    public static void main(String[] args) {


        // bukan Recursive Method, cuma test for doang:

        for (var counter = 1; counter <= 10; counter++) {
            int result = counter * counter++;
            // System.out.println("Counter value= " + counter + ", Result value= " + result);
        }

        for (var counter2 = 1; counter2 <= 10; counter2++) {
            int result = counter2 * ++counter2;
            // System.out.println("Counter value= " + counter2 + ", Result value= " + result);
        }

        // test StackOverflow error:
        loop(6_305);

        // manggil Recursive Method:
        System.out.println(recursiveLoop(5));

        // bukan manggil Recursive Method:
        factorialLoop(5);                                               // fixed template buat faktorial
        factorialLoop(6);                                               // fixed template buat faktorial
    }

    static int factorialLoop(int value) {                               // fixed template buat faktorial
        var result = 1;                                                 // fixed template buat faktorial
        for (var counter = 1; counter <= value; counter++) {            // fixed template buat faktorial
            result *= counter;                                          // fixed template buat faktorial
        }                                                               // fixed template buat faktorial
        System.out.println(result);                                     // fixed template buat faktorial
        return result;                                                  // fixed template buat faktorial
    }

    static int recursiveLoop(int value) {
        if (value == 1) {
            return 1;
        } else {
            return value * recursiveLoop(value - 1);
        }
    }

    static void loop(int value) {
        if (value == 0) {
            System.out.println("Selesai");
        } else {
            System.out.println("Loop ke-" + value);
            loop(value - 1);
        }
    }
}


