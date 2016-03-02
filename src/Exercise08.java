import java.util.ArrayList;

/**
 * Created by MacLap on 3/2/16.
 */
public class Exercise08 {
    public static void main(String[] args) {
        String[] names = {"Charlie", "David", "Alice", "Bob"};
        ArrayList<String> sortedNames = new ArrayList<>();

//        ArrayList<String> sorterList = new ArrayList<>();
//        sorterList.add(names[0]);
//
//
//        int i = 0;
//        while (sortedNames.size() > names.length) {
//            for (String name : names) {
//                if (name.compareTo(sorterList.get(i))>0);
//                sorterList.set(i, name);
//            }
//            sortedNames.add(sorterList.get(i));
//            i++;
//        }
        for (String name : names) {
            int index = 0;

            for (String sortedName : sortedNames){
                if(name.compareTo(sortedName) > 0) {
                    index++;
                }
                else{
                    break;
                }
            }
            sortedNames.add(index, name);
        }
        System.out.println(sortedNames);
    }
}
