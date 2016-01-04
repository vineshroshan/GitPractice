/**
 * Created by vkarunakaran on 1/4/16.
 */
public class RobotPath {
    public int getRobotPaths(int x, int y, int goalX, int goalY, int[][] cache) {
        if (x == goalX && y == goalY) {
            return 1;
        } else if (x > goalX || y > goalY) {
            return 0;
        } else if (cache[x][y] > 0) {
            return cache[x][y];
        }
        cache[x][y] = getRobotPaths(x + 1, y, goalX, goalY, cache) + getRobotPaths(x, y + 1, goalX, goalY, cache);
        return cache[x][y];
    }
}