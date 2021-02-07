class Manager2021 extends Employee2021 {
    //String name;
    Manager2021(String name) {
        super(name);
    }

    /*
        Manager2021() {
        }
    */
    void sayHello(String name) {
        System.out.println("Hai " + name + ", nama saya Manager " + this.name + ".");
    }
/*
    public static void main(String[] args) {
        Manager2021 manager1 = new Manager2021();
        manager1.name = "Budi";
        manager1.sayHello("Berry");
    } */
}

class VP2021 extends Manager2021 {
    //String name;
    VP2021(String name) {
        super(name);
    }

    void sayHello(String name) {
        System.out.println("Hai " + name + ", nama saya VP " + this.name + ".");
    }
/*
    public static void main(String[] args) {
        VP2021 vp1 = new VP2021("Adi");
        vp1.sayHello("Berry2");
    }
    */
}
