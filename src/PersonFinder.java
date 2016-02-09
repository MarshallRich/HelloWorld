import java.util.ArrayList;

/**
 * Created by MacLap on 2/9/16.
 */
public class PersonFinder {
    public static void main(String[] args) {
        ArrayList<Person> people = new ArrayList<>();
        people.add(new Person("Alice Smith", 30));
        people.add(new Person("Bob Doe", 35));
        people.add(new Person("Charlie Johnson", 40));

        ArrayList<Person> peopleUnderFourty = new ArrayList<>();

        for (Person p : people){
            if (p.getAge() < 40) {
                peopleUnderFourty.add(p);
            }
        }

        System.out.println(peopleUnderFourty);

        Person firstMatch = null;

        for (Person p : people){
            if (!p.getName().startsWith("A")) {
                firstMatch = p;
                break;
            }
        }

        System.out.println(firstMatch);
    }
}
