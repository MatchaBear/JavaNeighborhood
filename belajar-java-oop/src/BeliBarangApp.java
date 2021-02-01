public class BeliBarangApp {
    public static void main(String[] args) {
        BeliBarang customer1 = new BeliBarang("Edo", "Cirebon");
        BeliBarang customer2 = new BeliBarang("Lola", "Jakarta");
        BeliBarang customer3 = new BeliBarang("Anwar", "Medan");
        BeliBarang customer4 = new BeliBarang("Anwar");

        BeliBarang customer5 = new BeliBarang();
        customer5.name = "Umar";

        System.out.println(customer1.name + " dari " + customer1.address);
        System.out.println(customer2.name + " dari " + customer2.address);
        System.out.println(customer3.name + " dari " + customer3.address);

        customer1.kasiHadiah("David");
        customer5.kasiHadiah("Tukidi");
    }
}
