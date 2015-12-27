/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author vkarunakaran
 */
public class Driver {
    public static void main(String[] args) {
        int[] array = new int[]{7,-1,9,2,8,1,0};
        MergeSort mergeSort = new MergeSort();
        for (int b : mergeSort.mergeSort(array, 0, array.length-1)) {
            System.out.println(b);
        }
        
        
        
    }

    
}
