public class MethodReturnValue4 {
    public static void main(String[] args) {

        System.out.println(hitunglah(1,"/",3));
    }

    static double hitunglah(double value1, String operasiMat, double value2){
        switch(operasiMat){
            case "+" :
                return value1 + value2;
            case "-" :
                return value1 - value2;
            case "*" :
                return value1 * value2;
            case "/" :
                return value1 / value2;
            default:
                return 0;
        }
    }

}
