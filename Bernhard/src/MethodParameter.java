public class MethodParameter {
    public static void main(String[] args) {
        sayHello("Budi","Kurniawan");
        sayHello("Berry","Budiarto");
        sayHello("Mega","Dewi");
    }

    static void sayHello(String firstName, String lastName){ // method parameternya ini
        System.out.println("Hello "+firstName+" "+lastName);

    }

}
