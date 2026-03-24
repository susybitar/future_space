package exercises.ejercicio02;

public class Human {
    private String name;
    private String age;
    private Address address;

    public String getFullAddress() {
        return address.getFullAddress();
    }
}
