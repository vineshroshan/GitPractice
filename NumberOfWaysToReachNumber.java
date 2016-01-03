/**
 * Created by vkarunakaran on 1/2/16.
 *
 * Description: number of ways to sum up to goal using numbers 1,2,3.
 */
public class NumberOfWaysToReachNumber {

    public int numberofWays(int current, int goalNumber, int path[], int pathIndex) {
        if (path == null) path = new int[100];
        path[pathIndex] = current;
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
        return numberofWays(current + 1, goalNumber, copy(path, new int[100]), pathIndex + 1) + numberofWays(current + 2, goalNumber, copy(path, new int[100]), pathIndex + 1) + numberofWays(current + 3, goalNumber, copy(path, new int[100]), pathIndex + 1);
    }

    public int[] copy(int[] source, int[] destination) {
        for (int j = 0; j < source.length; j++) {
            destination[j] = source[j];

        }
        return destination;
    }

}
