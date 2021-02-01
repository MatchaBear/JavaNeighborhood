public class PersonApp {
    public static void main(String[] args) {
        var person1= new Person("Andi","Bandung");

        // kalo mau tambahin Field, Field ini harus dideclare dulu di class file nya.

        // person1.name="Eko";
        // person1.address="Subang";
        // person1.country = "Amerika"; // ERROR

        System.out.println(person1.name);
        System.out.println(person1.address);
        System.out.println(person1.country);
        person1.sayHello("Bambang");
        person1.dataDiri(person1.name, person1.address);

        Person person2=new Person("Berry"); // kenapa ini diawali dengan "Person" ya?
        // person2.name="Berry";
        // person2.address="Jakarta";

        System.out.println(person2.name);
        System.out.println(person2.address);
        System.out.println(person2.country);
        person2.saySomething("Timmy");

        var person3 = new Person("Zul","TangSel");
        // person3.name="Zul";
        // person3.address="Tangerang Selatan";

        System.out.println(person3.name);
        System.out.println(person3.address);
        System.out.println(person3.country);
        person3.saySomething("Viktor");

var person4=new Person("Agus","Bangka");
        person4.dataDiri(person4.name, person4.address);

var person5= new Person("Bernadette","Lampung");
        person5.dataDiri(person5.name, person5.address);

Person person6;
person6 = new Person();
person6.address="DKI Jaya";
        person6.dataDiri(person6.name, person6.address);

        System.out.println(person1); // ini print out object tok
        System.out.println(person2); // ini print out object tok
        System.out.println(person3); // ini print out object tok
        System.out.println(person4); // ini print out object tok
        System.out.println(person5); // ini print out object tok
        System.out.println(person6); // ini print out object tok

        // kalo mau tambahin Field, Field ini harus dideclare dulu di class file nya.

    }
}