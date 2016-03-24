import java.util.HashSet;
import java.util.Set;

/**
 * Created by VineshRoshan on 3/24/2016.
 */
public class EliminateDuplicateCharacters {
    public char[] getUniqueCharacterString(char[] str) {
        Set<Character> hset = new HashSet();
        int tail = 1, head = 1;
        //scan the character to hset
        for (int i = 1; i < str.length; i++) {
            if (!hset.contains(str[i])) {
                hset.add(str[i]);
                head++;
                tail++;
            } else {
                head++;
                if (head < str.length) {
                    str[tail] = str[head];
                } else {
                    /*str[tail+1] = '\0'; c version
                    return str;*/
                    return new String(str).substring(0, tail).toCharArray();
                }
            }
        }
        return str;
    }
}
