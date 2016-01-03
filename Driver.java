/**
 * @author vkarunakaran
 */
public class Driver {
    public static void main(String[] args) {
        NumberOfWaysToReachNumberDP n = new NumberOfWaysToReachNumberDP();
        System.out.println(n.numberofWays(0, 4, null, 0, new long[100]));
    }

    private static void numberofWaysToReachGoal() {
        NumberOfWaysToReachNumber n = new NumberOfWaysToReachNumber();
        System.out.println(n.numberofWays(0, 10, null, 0));
    }

    private static void treeReconstruction() {
        TreeReconstructionInorderPreorder reconstructionInorderPreorder = new TreeReconstructionInorderPreorder();
        reconstructionInorderPreorder.buildTree(new int[]{1, 0, 2, 4, 3}, new int[]{2, 1, 0, 3, 4}, 0, 4);
    }

    private static void stringPermutationChecker() {
        Permutations p = new Permutations();
        p.getPerm("abc").forEach(w -> {
            System.out.println(w);
        });
    }

    private static void combinationChecker() {
        Combination c = new Combination();
        c.getCombinations(new int[]{1, 2, 3, 4, 5}, 2).stream().forEach(com -> {
            for (int i : com) {
                System.out.print(i);
            }
            System.out.println();
        });
    }

    private static void mergeSortChecker() {
        int[] array = new int[]{7, -1, 9, 2, 8, 1, 0};
        MergeSort mergeSort = new MergeSort();
        for (int b : mergeSort.mergeSort(array, 0, array.length - 1)) {
            System.out.println(b);
        }
    }


}
