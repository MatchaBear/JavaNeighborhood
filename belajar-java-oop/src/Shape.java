class Shape {
    int jumlahSudut() {
        return 0;
    }

    int defaultSudut() {
        return 1;
    }
}


class Rectangle extends Shape {
    int jumlahSudut() {                  // method overriding.
        return 4;
    }

    int jumlahSudutDariParent() {
        return super.jumlahSudut();     // keyword "super". ambil method dari class Parent-nya.
    }
}

// public class ShapeApp {              -> gak bisa dibuat karna class yg sifatnya public harus dibikin di file .java baru.
// }