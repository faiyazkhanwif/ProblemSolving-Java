/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LeetCode;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author faiya
 */
public class ArrayPartition1WithQuickSort {

    static class QuickSort {

        /* This function takes last element as pivot, 
       places the pivot element at its correct 
       position in sorted array, and places all 
       smaller (smaller than pivot) to left of 
       pivot and all greater elements to right 
       of pivot */
        int partition(int arr[], int low, int high) {
            int pivot = arr[high];
            int i = (low - 1); // index of smaller element 
            for (int j = low; j < high; j++) {
                // If current element is smaller than the pivot 
                if (arr[j] < pivot) {
                    i++;

                    // swap arr[i] and arr[j] 
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }

            // swap arr[i+1] and arr[high] (or pivot) 
            int temp = arr[i + 1];
            arr[i + 1] = arr[high];
            arr[high] = temp;

            return i + 1;
        }

        /* The main function that implements QuickSort() 
      arr[] --> Array to be sorted, 
      low  --> Starting index, 
      high  --> Ending index */
        void sort(int arr[], int low, int high) {
            if (low < high) {
                /* pi is partitioning index, arr[pi] is  
              now at right place */
                int pi = partition(arr, low, high);

                // Recursively sort elements before 
                // partition and after partition 
                sort(arr, low, pi - 1);
                sort(arr, pi + 1, high);
            }
        }
    }

    static int arrayPairSum(int[] nums) {
        QuickSort qs = new QuickSort();
        qs.sort(nums, 0, nums.length - 1);

        ArrayList al = new ArrayList();
        for (int i = 0; i < nums.length - 1; i += 2) {
            if (nums[i] < nums[i + 1]) {
                al.add(nums[i]);
            } else {
                al.add(nums[i + 1]);
            }
        }
        int ans = 0;
        for (int i = 0; i < al.size(); i++) {
            ans += (int) al.get(i);
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] nums = {1, 4, 3, 2};
        System.out.println(arrayPairSum(nums));
    }
}
