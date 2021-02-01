public class Method4 {
    public static void main(String[] args) {

        System.out.println(basicCalculator(200, "*", 2));
        System.out.println(basicCalculator(1000, "/", 500));
        System.out.println(basicCalculator(237, "%", 37));
        System.out.println(basicCalculator(100, "+", 200));
        System.out.println(basicCalculator(1000, "-", 2000));
        System.out.println(basicCalculator(1000, "lol", 2000));

    }

    static int basicCalculator(int angkaPertama, String operasi, int angkaKedua) {
        switch (operasi) {
            case "+":
                return angkaPertama + angkaKedua;
            case "-":
                return angkaPertama - angkaKedua;
            case "*":
                return angkaPertama * angkaKedua;
            case "/":
                return angkaPertama / angkaKedua;
            case "%":
                return angkaPertama % angkaKedua;
            default:
                return angkaPertama;
        }
    }
}
