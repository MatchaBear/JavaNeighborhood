class Person {
    // class Person butuh object, objectnya itu dibuat di PersonApp class.
    // menambahkan Field:
    String name;
    String address;
    final String country = "Indonesia";

    Person(String name, String address){
        // constructor adalah method yg dipanggil pertama kali oleh objek ?
        this.name = name; // si "name" kita set datanya dari si "paramName"
        this.address = address; // si "address" kita set datanya dari si "paramAddress"
    }
    Person(String paramName){
        this(paramName,null);
    }
    Person(){
        this(null);
    }

    // class Person ini memiliki method2x di bawah:

void sayHello(String paramName) {
    System.out.println("Hello " + paramName + ", my name is " + this.name + ".");
}
void saySomething (String paramName){
    System.out.println("Hello " + paramName + ", nama saya "+ this.name + ".");
    }
void dataDiri (String a, String b){
    System.out.println("Nama: "+a);
    System.out.println("Tempat / Tgl Lahir: "+b);
}
}

