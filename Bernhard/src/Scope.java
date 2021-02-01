public class Scope {
    public static void main(String[] args) {
    sayHello("Berry");
    }

    static void sayHello(String name){
        String hello = "Hello " + name;
        if(!name.isBlank()){ // kalo name gak dideclare (kosong), Hi + name nya gak keluar;
            String hi = "Hi "+name;
            System.out.println(hi);
        }
        System.out.println(hello);
    }
}
