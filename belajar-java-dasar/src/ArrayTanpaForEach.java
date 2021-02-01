public class ArrayTanpaForEach {
    public static void main(String[] args) {
        // tanpa for each:
        String[] names = { // ini declare array of String "names"
                "Berry", "Bernhard", "Hustomo",
                "Agus", "Sunata", "Budiarto",
                "Bernadette", "Budiarsih", "Daud"
        };
        for (var i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }

        System.out.println("FOR EACH");

        // dengan for each:
        for (var name : names) {
            System.out.println(name);
        }
    }
}
