import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.stream.Collectors;

import static java.util.Arrays.copyOf;

/**
 * Created by MacLap on 2/24/16.
 */
public class Exercise05 {
    public static void main(String[] args) {
        String[] names = {"alice", "bob", "charlie", "andrew", "edward", "alex"};
        //grab the first 5
        //make all names uppercase
        //extract all the ones starting with "a" to an ArrayList

        ArrayList<String> newNames = new ArrayList(Arrays.asList(names));
        newNames = new ArrayList<>(newNames.subList(0,5));

        solveViaStream(newNames);
        solveViaTempList(newNames);
        solveViaDirectModification(newNames);
    }

    static void solveViaDirectModification(ArrayList<String> names) {
        //make all upper case
        for (int i = 0; i < names.size(); i++) {
            names.set(i, names.get(i).toUpperCase());
        }

        //filter out names that don't start with A
        Iterator<String> iter = names.iterator();
        while (iter.hasNext()) {
            String name = iter.next();
            if (!name.startsWith("A")) {
                iter.remove();
            }
        }

        System.out.println(names);
    }

    static void solveViaTempList(ArrayList<String> names) {
        ArrayList<String> temp = new ArrayList<>();
        for(String name : names) {
            temp.add(name.toUpperCase());
        }
        names = temp;

        //filter out ones that dont start with A
        ArrayList<String> aNames = new ArrayList<>();
        for(String name : names) {
            if (name.startsWith("A")) {
                aNames.add(name);
            }
        }
        names = aNames;

        System.out.println(names);

    }

    static void solveViaStream(ArrayList<String> names) {
        names = names.stream()
                .map((name) -> {
                    return name.toUpperCase();
                })
                .filter((name) -> {
                    return name.startsWith("A");
                })
                .collect(Collectors.toCollection(ArrayList<String>::new));

        System.out.println(names);
    }
}
