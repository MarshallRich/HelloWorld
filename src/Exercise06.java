import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;

/**
 * Created by MacLap on 2/25/16.
 */
public class Exercise06 {
    public static void main(String[] args) {
        String[] names = {"Alice", "Smith", "Bob", "Hope", "Charlie", "Brown"};
        //reverse the list
        //turn it into a HashMap
        //{{ "Smith": "Alice", "Hope" : "Bob", "Brown": "Charlie"};

//        ArrayList<String> reverseNames = new ArrayList<>();
//        for (int i = names.length - 1; i >= 0; i--) {
//           reverseNames.add(names[i]); }
        ArrayList<String> reversedNames = new ArrayList<>(Arrays.asList(names));
        Collections.reverse(reversedNames);

        HashMap<String, String> nameMap= new HashMap<>();
        for(int i = 0; i < reversedNames.size(); i+=2) {
            nameMap.put(reversedNames.get(i), reversedNames.get(i+1));
        }
        System.out.println();
    }
}
