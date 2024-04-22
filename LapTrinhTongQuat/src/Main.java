import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();
        people.add(new Person("Nguyen A", 22, "Address 1"));
        people.add(new Person("Nguyen A", 20, "Address 2"));
        people.add(new Person("Le B", 20, "Address 3"));

        Week11.sortGeneric(people);

        for (Person person : people) {
            System.out.println(person);
        }
    }
}
