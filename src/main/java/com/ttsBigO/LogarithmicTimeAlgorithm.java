package com.ttsBigO;

public class LogarithmicTimeAlgorithm {

    /**
     *
     * O(log n) - binary search a sorted array. it compares the key value with the
     * middle element of the array; if they are unequal, the half in which the key
     * cannot be part of is eliminated
     */
    public int binarySearchItem(int[] sortedArray, int value) {
        int index = -1;
        int low = 0;
        int high = sortedArray.length;

        while (low <= high) {
            int mid = (low + high) / 2;
            if (sortedArray[mid] < value) {
                low = mid + 1;
            } else if (sortedArray[mid] > value) {
                high = mid - 1;
            } else if (sortedArray[mid] == value) {
                index = mid;
                break;
            }
        }
        return index;
    }

}