class Mobil {
    String brand;
    String name;
    String color;
    String seater;

    Mobil(String paramBrand, String paramName, String paramColor) {             // 3 parameter
        brand = paramBrand;
        name = paramName;
        color = paramColor;
    }

    Mobil(String paramBrand, String paramName) {                                // 2 parameter
        this(paramBrand, paramName, null);                          // Constructor overloading
    }

    Mobil(String paramBrand) {                                                  // 1 parameter
        this(paramBrand, null);                                     // Constructor overloading
    }

    Mobil() {                                                                   // 0 parameter (default parameter)
        this(null);                                                 // Constructor overloading
    }

    void lotereMingguan(int nomorUndian) {
        switch (nomorUndian) {
            case 1:
                System.out.println("Pemenang minggu ini mendapatkan mobil " + brand + " " + name + " " + color + ".");
                break;
            default:
                System.out.println("Minggu ini tidak ada pemenang.");
        }
    }
}
