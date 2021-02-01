class BeliBarang {
    String name;
    String address;

    BeliBarang(String paramName, String paramAddress) {    // constructor
        name = paramName;                                  // nilai name diambil dari paramName yg dimasukkan di App.
        address = paramAddress;                            // nilai address juga dari App ??
    }

    BeliBarang(String paramName) {
        name = paramName;
    }

    BeliBarang() {

    }

    void kasiHadiah(String paramName) {
        System.out.println(paramName + ", " + "Anda telah memberikan hadiah kepada " + name + " yang berada di " + address);
    }
}
