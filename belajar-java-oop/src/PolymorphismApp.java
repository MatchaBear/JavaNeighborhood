class PolymorphismApp {
    public static void main(String[] args) {

        Employee2021 employee = new Employee2021("Berry");
        employee.sayHello("Budi");

        employee = new Manager2021("Berry");
        employee.sayHello("Budi");

        employee = new VP2021("Berry");
        employee.sayHello("Budi");

        sayHello(new Employee2021("Berry"));
        sayHello(new Manager2021("Edi"));
        sayHello(new VP2021("Joko"));
    }

    static void sayHello(Employee2021 employee) {
        System.out.println("Halo " + employee.name);

    }
}
