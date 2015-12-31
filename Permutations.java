import java.util.ArrayList;
import java.util.List;

/**
 * Created by vkarunakaran on 12/30/15.
 */
public class Permutations {
    public List<String> getPerm(String str) {
        if (str == null) {
            return null;
        }
        List<String> permutations = new ArrayList<String>();
        if (str.length() == 0) {
            return new ArrayList<String>() {{
                add("");
            }};
        }
        char first = str.charAt(0);
        String rem = str.substring(1);
        List<String> words = getPerm(rem);
        for (String word : words) {
            for (int i = 0; i <= word.length(); i++)
                permutations.add(insertCharAt(word, first, i));
        }
        return permutations;
    }

    public String insertCharAt(String word, char first, int position) {
        String firstPart = word.substring(0, position);
        String secondPart = word.substring(position);
        return firstPart + first + secondPart;
    }

}
