public class MethodOverloading {
    public static void main(String[] args) {

        sayHello();
        sayHello("Mega");
        sayHello("Antonia", "Mega");

    }

    static void sayHello() {
        System.out.println("Hello" + "!");
    }

    static void sayHello(String firstName) {
        System.out.println("Hello " + firstName + "!");
    }

    static void sayHello(String firstName, String lastName) {
        System.out.println("Hello " + firstName + " " + lastName + "!");
    }

}
