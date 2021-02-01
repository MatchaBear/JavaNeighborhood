public class ShapeApp {
    public static void main(String[] args) {
        Shape shape1 = new Shape();
        System.out.println(shape1.jumlahSudut());                           // return dari method bisa diprint dgn cara begini.

        Rectangle rectangle1 = new Rectangle();
        System.out.println(rectangle1.jumlahSudut());                       // return dari method bisa diprint dgn cara begini.
        System.out.println(rectangle1.jumlahSudutDariParent());             // return dari method bisa diprint dgn cara begini.

        Triangle triangle1 = new Triangle();
        System.out.println(triangle1.getCorner());
        System.out.println(triangle1.getParentCorner());
    }
}
