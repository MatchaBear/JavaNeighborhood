public class Method2 {
    public static void main(String[] args) {

        sayHello("Alex", "Albon");                      // di sini masukin nilai dari parameternya
        sayHello("Max", "Verstappen");                  // di sini masukin nilai dari parameternya
        sayHello("Lewis", "Hamilton");                  // di sini masukin nilai dari parameternya

    }

    static void sayHello(String firstName, String lastName) { // = parameter dari method SayHello adalah firstName & lastName
        System.out.println("Hello " + firstName + " " + lastName);
    }
}
