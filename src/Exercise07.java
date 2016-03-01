import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.stream.Collectors;

/**
 * Created by MacLap on 3/1/16.
 */
public class Exercise07 {

    public static void main(String[] args) throws FileNotFoundException {
        ArrayList<String> names = new ArrayList<>();
        //read names into the array list
        //new array list called results to contain a string
        String searchTerm = "ali";

        names = readFile();
        ArrayList<String> results= new ArrayList<>();

        for (String name: names){
            if (name.toLowerCase().contains(searchTerm)){
                results.add(name);
            }
        }

        System.out.println(results);

        //use streams
        results = names.stream()
                .filter((name) -> {
                    return name.toLowerCase().contains(searchTerm);
                })
                .collect(Collectors.toCollection(ArrayList<String>::new));
    }

    public static ArrayList<String> readFile() throws FileNotFoundException {
        ArrayList<String> people = new ArrayList<>();
        File f = new File("people.csv");
        Scanner fileScanner = new Scanner(f);


        int i = 0;
        while (fileScanner.hasNext()) {
            String line = fileScanner.nextLine();
            if (i != 0) {
                String[] column = line.split(",");
                String p =  column[1] + " " + column[2];
                people.add(p);
            }
            i ++;
        }
        return people;
    }
}

