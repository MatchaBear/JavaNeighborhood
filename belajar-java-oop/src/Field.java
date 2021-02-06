class Field {
    int panjang;
    int lebar;
    String namaStadion;
    final String city = "Jakarta";

    Field(int panjang, int lebar, String namaStadion) {
        this.panjang = panjang;
        this.lebar = lebar;
        this.namaStadion = namaStadion;
    }

    Field(int panjang, int lebar) {
        this(panjang, lebar, "Standar lapangan bola");
    }

    Field() {
        this(0, 0, null);
    }

    void description(String name) {
        System.out.println("Hi " + name + ", " + namaStadion + " di " + city + " memiliki panjang " + panjang + " m dan lebar " + lebar + " m.");
    }

    public static void main(String[] args) {
        Field field1 = new Field(100, 90, "Gelora Bung Karno");
        field1.description("Berry");
        Field field2 = new Field();
        field2.description("Berry2");
        Field field3 = new Field(110, 95);
        field3.description("Berry3");

    }
}
