class Person {
    String name;
    String address;
    final String country = "Indonesia";

    void sayHello(String paramName) {                                           // bikin method, dalam Class.
        System.out.println("Hello " + paramName + ", my name is " + name);      // paramName value = input; name value = Object's name di PersonApp.java
    }
}