/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * @author vkarunakaran
 */
public class Driver {
    public static void main(String[] args) {
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
