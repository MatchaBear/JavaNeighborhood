public class PrePostIncrement {
    public static void main(String[] args) {
        // prefix vs postfix

        // ++x = increment (++) first then return the value of x.
        // x++ = return the value of x, then increment (++) after.

        int x = 5, y = 5;
        System.out.println(++x); // outputs 6
        System.out.println(x);   // outputs 6

        System.out.println(y++); // outputs 5
        System.out.println(y);   // outputs 6

        System.out.println();

        int z = 0;
        int a, b;
        a = ++z; // e=e+1 => e=1
        b = z++; // e=e+1 => e=1
        System.out.println(a); // outputs 1
        System.out.println(z); // outputs 2
        System.out.println(b); // outputs 1
        System.out.println(z); // outputs 2
        System.out.println();

        int e = 0;
        int g, h;
        g = ++e; // e=e+1 => e=1
        h = e++; // e=e+1 => e=1
        System.out.println(h); // outputs 1
        System.out.println(e); // outputs 2
        System.out.println(g); // outputs 1
        System.out.println(e); // outputs 2

    }
}
