package SortingAlgo;

import java.util.*;

public class merge {

    public static void merge(int[] arr, int low, int mid, int high) {
        ArrayList<Integer> temp = new ArrayList<>();

        int left = low;
        int right = mid + 1;

        while (left <= mid && right <= high) {
            if (arr[left] < arr[right]) {
                temp.add(arr[left]);
                left++;
            } else {
                temp.add(arr[right]);
                right++;
            }
        }

        while (left <= mid) {
            temp.add(arr[left]);
            left++;
        }
        while (right <= high) {
            temp.add(arr[right]);
            right++;
        }

        for (int i = low; i <= high; i++) {
            arr[i] = temp.get(i - low);
        }

        System.out.println("Merged: " + Arrays.toString(Arrays.copyOfRange(arr, low, high + 1)));
    }

    public static void mergeSort(int arr[], int low, int high) {
        if (low >= high) return;

        int mid = (low + high) / 2;

        System.out.println("Dividing: " + Arrays.toString(Arrays.copyOfRange(arr, low, high + 1)));

        mergeSort(arr, low, mid);
        mergeSort(arr, mid + 1, high);

        merge(arr, low, mid, high);
    }

    public static void main(String[] args) {
        int[] array = {4,2,1,6,7};
        int n = array.length;

        System.out.println("Original Array: " + Arrays.toString(array));
        mergeSort(array, 0, n - 1);
        System.out.println("Sorted Array:   " + Arrays.toString(array));
    }
}
