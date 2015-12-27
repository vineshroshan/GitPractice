
/**
 *
 * @author vkarunakaran
 */
public class MergeSort {

    int[] mergeSort(int[] arr, int left, int right) {
        if (left == right) {
            return new int[]{arr[left]};
        }
        int[] leftArray = mergeSort(arr, left, (left + right) / 2);
        int[] rightArray = mergeSort(arr, (left + right) / 2 + 1, right);
        return sortedArray(leftArray, rightArray);
    }

    int[] sortedArray(int[] leftArray, int[] rightArray) {
        int[] newArray = new int[leftArray.length + rightArray.length];
        int newIndexPointer = 0, leftPointer = 0, rightPointer = 0;
        while (newIndexPointer < newArray.length) {
            if (leftPointer == leftArray.length && rightPointer < rightArray.length) {
                newArray[newIndexPointer] = rightArray[rightPointer++];
            } else if (rightPointer == rightArray.length && leftPointer < leftArray.length) {
                newArray[newIndexPointer] = leftArray[leftPointer++];
            } else if (leftArray[leftPointer] < rightArray[rightPointer]) {
                newArray[newIndexPointer] = leftArray[leftPointer++];
            } else {
                newArray[newIndexPointer] = rightArray[rightPointer++];
            }
            newIndexPointer++;
        }
        return newArray;
    }

}
