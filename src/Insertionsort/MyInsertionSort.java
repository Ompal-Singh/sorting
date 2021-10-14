/*   Created by IntelliJ IDEA.
 *   Author: Ompal Singh (Ompal-Singh)
 *   Date: 10/14/2021
 *   Time: 11:04 AM
 *   File: MyInsertionSort.java
 */

package Insertionsort;

import javax.swing.*;
import java.util.Arrays;

public class MyInsertionSort {
    public static void main(String[] args) {
        int[] arr = {14, 3, 8, 4, 6};
        System.out.println("unsorted --> " + Arrays.toString(arr));
        MyInsertionSort object = new MyInsertionSort();
        object.insertionSort(arr);
        System.out.println("sorted -- >" + Arrays.toString(arr));
    }

    public void insertionSort(int[] arr) {
        int sortedIndex = 0;
        for (int unsortedIndex = 1; unsortedIndex < arr.length; unsortedIndex++) {
            int nextElement = arr[unsortedIndex];
            System.out.println("next element --> " + nextElement);
            for (int j = unsortedIndex; j < 0; j--) {
                if (arr[j] < arr[j - 1]) {
                    System.out.println("swapping --> " + arr[j] + "with --> " + arr[j - 1]);
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                } else {
                    System.out.println("breaking because -->" + "is greater than or eqaul to-- >" +arr[j - 1]);
                    break;
                }
                System.out.println(Arrays.toString(arr));

            }

        }
    }
}
