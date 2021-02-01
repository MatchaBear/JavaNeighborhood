public class SwapVariable {
    public static void main(String[] args) {
        int a, b, f;
        a = 1;
        f = a;


        var c = "Hello World";
        var g = c;
        System.out.println("c = " + c);
        System.out.println("f = " + f);
        a = 2;
        System.out.println("a = " + a);
        System.out.println("f = " + f);
        System.out.println(g);

        int v1, v2, temp1, temp2;

        v1 = 1;
        v2 = 2;
        temp1 = v1;
        temp2 = v2;

        v1 = temp2;
        v2 = temp1;

        System.out.println(v1);
        System.out.println(v2);

        int v3, v4, temp;
        v3 = 3;
        v4 = 4;
        temp = v3;
        v3 = v4;
        v4 = temp;
        System.out.println(v3);
        System.out.println(v4);
    }
}
