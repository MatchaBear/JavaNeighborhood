class TemanLama {
    String name;

    TemanLama(String name) {
        this.name = name;
    }

    void sayHello(String name) {
        System.out.println("Hai " + this.name + ", nama gue " + name + " inget gak?");
    }

    public static void main(String[] args) {
        TemanLama teman1 = new TemanLama("Felix");
        teman1.sayHello("Berry");
    }
}
