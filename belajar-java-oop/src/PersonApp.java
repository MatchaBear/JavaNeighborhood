public class PersonApp {
    public static void main(String[] args) {
        // cara 1:
        var person1 = new Person();
        person1.name = "Berry";
        person1.address = "BSD City";
        // person1.country = "Australia" -- tidak bisa diubah.

        System.out.println(person1.name);
        System.out.println(person1.address);
        System.out.println(person1.country);

        person1.sayHello("Budi");

        // cara 2:
        Person person2 = new Person();

        // cara 3:
        Person person3;
        person3 = new Person();
        person3.sayHello("Budi");
    }
}
