public class MethodVariableArgument {
    // tanpa variable argument
    public static void main(String[] args) {
        int[] values = {30,80,75,85,50};
        sayCongrats("Eko", values);

    }

    static void sayCongrats(String name, int[] values){  // int[] artinya kumpulan integer number in array;
        // void karena gak ada "return" di bawah ??
        var total = 0;
        for(var value:values){
            total+=value;
        }
        var finalValue = total / values.length; // ini untuk merata-rata (values in average)

        if (finalValue >= 70){
            System.out.println("Selamat " + name + ", Anda Lulus");
        } else {
            System.out.println("Maaf " + name + ", Anda Tidak Lulus");
        }




    }
}
