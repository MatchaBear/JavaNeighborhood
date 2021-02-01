public class MethodOverloading {
    public static void main(String[] args) {
        sayHello();
        sayHello("Amigo");
        sayHello("Amigos ","Para Siempre");
        System.out.println(angka(100,200));
        System.out.println(angka("Kalah",100));
    }
    static void sayHello(){
        System.out.println("Hello");
    }
    static void sayHello(String name){
        System.out.println("Hello "+ name);
    }
    static void sayHello(String firstName, String lastName){
        System.out.println("Hello "+firstName+lastName);
    }
    static int angka(int a, int b){
        var jumlah = a + b;
        return jumlah;
    }
    static int angka(String MenangSeriKalah,int a){
        switch(MenangSeriKalah){
            case "Menang":
                return a+3;
            case "Seri":
                return a+1;
            default:
                return a;
        }
    }
}
