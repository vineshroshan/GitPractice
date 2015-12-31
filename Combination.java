import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author vkarunakaran
 */
public class Combination {

    public List<int[]> getCombinations(int[] arr, int r) {
        return getCombinations(arr, null, 0, 0, r);
    }

    public List<int[]> getCombinations(int[] arr, int[] comb, int start, int index, int r) {
        if (comb == null) {
            comb = new int[r];
        }
        if (index == r) {
            final int[] finalComb = comb;
            return new ArrayList<int[]>() {{
                add(finalComb);
            }};
        }
        List<int[]> finalCombinations = new ArrayList<int[]>();
        for (int i = start; i < arr.length; i++) {
            comb[index] = arr[i];
            finalCombinations.addAll(getCombinations(arr, Arrays.copyOf(comb, r), i + 1, index + 1, r));
        }
        return finalCombinations;
    }

}
