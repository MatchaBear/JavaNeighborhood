public class ManagerApp {
    public static void main(String[] args) {
        Manager anakBuah1 = new Manager("Berry");
        var anakBuah2 = new Manager("Agus");
        Manager anakBuah3;
        anakBuah3 = new Manager("Mega");

        // ceritanya relasi || salam kenal antara anak buah dengan manajernya.

        anakBuah1.sayHello("Tony");
        anakBuah1.sayHello("Chris");
        anakBuah2.sayHello("Bruce");
        anakBuah3.sayHello("Wanda");


    }
}
