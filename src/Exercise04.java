import java.util.LinkedHashMap;
import java.util.Set;

/**
 * Created by MacLap on 2/22/16.
 */
public class Exercise04 {
    public static void main(String[] args) {
        String sentence = "To be or not to be, that is the question.";
        //to be or not that is the question

        sentence = sentence.toLowerCase();
        sentence = sentence.replaceAll("\\p{Punct}", "");
        String[] words = sentence.split(" ");
        LinkedHashMap<String, Integer> frequencies = new LinkedHashMap<>();

        for (String word: words) {
            Integer count = frequencies.get(word);
            if (count == null) {
                frequencies.put(word, 1);
            }
        }

        String sentenceFinal = "";
        sentenceFinal = String.valueOf(frequencies.keySet());
        sentenceFinal = sentenceFinal.replaceAll("\\p{Punct}", "");

        System.out.println(sentenceFinal);
    }
}
