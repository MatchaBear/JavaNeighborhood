public class MethodReturnValue2 {
    public static void main(String[] args) {

        System.out.println(hitung(100,"+",200));
        System.out.println(hitung(100,"-",200));
        System.out.println(hitung(100,"/",200));


    }

    static int hitung(int value1, String operasi, int value2){
         // SALAH var total = value1
        switch(operasi){
            case "+":
                return value1 + value2;
            case "-":
                return value1 - value2;
            default:
                return 0;
        }

    }


}
