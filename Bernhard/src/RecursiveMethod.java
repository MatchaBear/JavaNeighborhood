public class RecursiveMethod {
    public static void main(String[] args) {
        System.out.println(factorialLoop(9));
        System.out.println(factorialRecursive(9));
        loopStackOverflow(1000); // gak bisa sout karna ini void ? atau karna udah ada sout di dalem method voidnya ??
    }
    // tanpa Recursive Method
    static int factorialLoop(int value){
        var result = 1;
        for(var counter=2;counter<=value;++counter){ // kalo counter=1 berarti 1*1*2*3*4*5*6;
            System.out.println(counter);
            result *= counter; // = 1*2*3*4*5*6;

        }
        return result;

    }

    // dengan Recursive Method
    static int factorialRecursive(int value){
        if(value ==1){
            return 1; // return 1 karna faktorial 1 udah pasti 1;
        } else {
            return value * factorialRecursive(value -1); // return dgn value -1. kalo value udah ampe 1, setop, karna return valuenya = 1;
        }
    }

    static void loopStackOverflow(int value){
        if(value==0){
            System.out.println("Selesai");
        } else{
            System.out.println("Loop Ke-" + value);
            loopStackOverflow(value-1);
        }
    }
}
