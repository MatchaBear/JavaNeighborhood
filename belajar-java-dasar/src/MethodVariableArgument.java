public class MethodVariableArgument {
    public static void main(String[] args) {
        int[] values = {74, 74, 74, 74, 74}; // nilai2x dari si array harus di-declare di sini.
        sayCongrats("Berry", values); // di sini tidak bisa declare nilai2x si array.
    }

    // variable argument: hanya bisa ditempatkan di posisi akhir parameter.
    // tanpa variable argument
    static void sayCongrats(String name, int[] values) { // si "int[] values bisa diganti dengan variable argument.
        int total = 0;
        for (int value : values) { // nilai dari tiap 'values' disimpan dalam 'value'.
            total += value; // nilai si total = 0+74+74+74+74+74.

        }
        var finalValue = total / values.length; // nilai akhir = total / values.length;
        // outputs = average dari si total.

        if (finalValue >= 75) {
            System.out.println("Selamat " + name + " Anda lulus!");
        } else                                                          // not mandatory to insert " { " after 'else'. ??
            System.out.println("Maaf " + name + " Anda belum lulus.");  // no " } " as well behind the statement. ??
        System.out.println("Nilai akhir Anda = " + finalValue);
    }
}
