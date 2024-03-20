import java.util.Objects;

public class Person {
    private String name;
    private String address;

    /**
     * person constructor.
     *
     * @param name    name
     * @param address address
     */
    public Person(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * toString.
     *
     * @return toString.
     */
    @Override
    public String toString() {
        return "Person[" + "name='" + name + '\'' +
                ", address='" + address + '\'' + ']';
    }

    public static void main(String[] args) {
        Person p = new Person("Phuong", "hung yen");
        System.out.println(p);
    }
}