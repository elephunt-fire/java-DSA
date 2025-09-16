package SortingAlgo;
import java.util.*;

public class bubble {
    public static void sorting_desc(int[] arr) {
        int N = arr.length;
        for (int i = 0; i < N-1; i++) {
            for (int j = 0; j < N-i-1; j++) {
                if (arr[j] < arr[j + 1]) {
                    swap(arr, j, j+1);
                }
            }
        }
    }


    public static  void sorting_asc(int[] arr1) {
        int n = arr1.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr1[j] > arr1[j + 1]) {
                    swap(arr1, j, j + 1);
                }
            }
        }
    }
    public static void swap(int[] arr , int i , int j ){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static  void recursiveSort(int[] arr , int n ){
        if(n==1) return;

        for(int i = 0 ; i < n-1 ; i++){
            if(arr[i] > arr[i+1]){
                swap(arr,i ,i+1);
            }
        }
        recursiveSort(arr,n-1);
    }
    public static void main(String[] args) {
        int[] ar = {2,5,6,1,7};
        System.out.println("Asc");
        sorting_asc(ar);
        System.out.println(Arrays.toString(ar));

        System.out.println("Desc");
        sorting_desc(ar);
        System.out.println(Arrays.toString(ar));

        System.out.println("recursive sorting");
        recursiveSort(ar,ar.length);
        System.out.println(Arrays.toString(ar));
    }
}