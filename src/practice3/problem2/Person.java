package src.practice3.problem2;

public class Person {
    private final String name;
    private String address;
    public Person(String name, String address) {
        this.name = name;
        this.address = address;
    }
    public String getName() {
        return this.name;
    }
    public String getAddress() {
        return this.address;
    }
    public void setAddress(String address) {
        this.address=address;
    }
    @Override
    public String toString() {
        return "Person[name: " + this.name + ", address: " + this.address + "]";
    }
}
