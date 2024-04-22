public class Person implements Comparable<Person> {
    /**
     * The Name.
     */
    protected String name;
    /**
     * The Age.
     */
    protected int age;
    /**
     * The Address.
     */
    protected String address;

    /**
     * Instantiates a new Person.
     */
    public Person() {
        this.name = "";
        this.age = 0;
        this.address = "";
    }

    /**
     * Instantiates a new Person.
     *
     * @param name    the name
     * @param age     the age
     * @param address the address
     */
    public Person(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    /**
     * Sets name.
     *
     * @param name the name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Sets age.
     *
     * @param age the age
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     * Sets address.
     *
     * @param address the address
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * Gets name.
     *
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * Gets age.
     *
     * @return the age
     */
    public int getAge() {
        return age;
    }

    /**
     * Gets address.
     *
     * @return the address
     */
    public String getAddress() {
        return address;
    }

    @Override
    public int compareTo(Person other) {
        int nameComparison = this.name.compareTo(other.getName());
        if (nameComparison != 0) {
            return nameComparison;
        }
        return Integer.compare(this.age, other.getAge());
    }

    @Override
    public String toString() {
        return String.format("Person (name='%s', age=%s,address=%s)",
                name, age, address);
    }
}
