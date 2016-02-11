import java.util.ArrayList;
import java.util.HashMap;
import java.lang.Character;

/**
 * Created by MacLap on 2/11/16.
 */
public class Exercise01 {
    public static void main(String[] args) {
        String[] names = {"Alice", "Bob", "Charlie", "Alfred", "Beth"};
        HashMap<Character, ArrayList<String>> nameMap = new HashMap<>();

        for (String name : names){
            Character firstLetter = new Character(name.charAt(0));
            nameMap.put(firstLetter, new ArrayList<String>());
        }

        for (String name: names){
            char firstLetter = name.charAt(0);

        }
    }
}
