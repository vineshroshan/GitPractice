/**
 * Created by vkarunakaran on 1/2/16.
 * <p>
 * Description: number of ways to sum up to goal using numbers 1,2,3.
 */
public class NumberOfWaysToReachNumberDP {

    public long numberofWays(int current, int goalNumber, int path[], int pathIndex, long[] dpMap) {
        if (path == null) path = new int[100];
        path[pathIndex] = current;
        if (current < dpMap.length && dpMap[current] > 0) return dpMap[current];
        if (current == goalNumber) {

            for (int i1 = 0; i1 < path.length; i1++) {
                System.out.print(path[i1]);
            }
            System.out.println();
            return 1;

        }
        if (current > goalNumber) {
            return 0;
        }
        dpMap[current] = numberofWays(current + 1, goalNumber, copy(path, new int[100]), pathIndex + 1, dpMap) + numberofWays(current + 2, goalNumber, copy(path, new int[100]), pathIndex + 1, dpMap) + numberofWays(current + 3, goalNumber, copy(path, new int[100]), pathIndex + 1, dpMap);
        return dpMap[current];
    }

    public int[] copy(int[] source, int[] destination) {
        for (int j = 0; j < source.length; j++) {
            destination[j] = source[j];

        }
        return destination;
    }
}
