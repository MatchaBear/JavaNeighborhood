class Manager2020 {
    String name; // ini adalah reference (=properties dari si object yang akan dibuat)

    void sayHello(String name) { // kalo mau dijabarkan, ini adalah "sayHelloDariAnakBuahKetikaBerkenalanPertamaKali"
        System.out.println("Hello " + name + ", my name is Manager " + this.name + ".");
    }
}

class VicePresident2020 extends Manager2020 {
    void sayHello(String name) { // kalo mau dijabarkan, ini adalah "sayHelloDariAnakBuahKetikaBerkenalanPertamaKali"
        System.out.println("Hello " + name + ", my name is VP " + this.name + ".");
    }
}