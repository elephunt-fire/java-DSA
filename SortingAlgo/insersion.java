package SortingAlgo;

import java.util.*;

//Time Complexity :  O(n^2)

public class insersion {
     public static void sort(int[] arr){
         int n = arr.length;
        int min = -1;
         for(int i = 1 ; i<n; i++){
             int key = arr[i];
             int j = i-1 ;
             int swap = 0;
             while (j>=0 && arr[j]> key){
                 arr[j+1] = arr[j];
                 j--;
                 swap++;
             }
             arr[j+1] = key;
             System.out.println("Iteration " + i + ": Swaps = " + swap + " | Array: " + Arrays.toString(arr));
         }
     }

     public static void even_insersion(int[] arr){
         int n = arr.length;
         for (int i = 0 ; i<n ; i++) {
         if(arr[i] % 2==0 ) {
             int key = arr[i];
             int j = i - 1;
             int swap = 0;
             while (j >= 0 && arr[j] > key && arr[j] % 2 == 0) {
                 arr[j + 1] = arr[j];
                 j--;
                 swap++;
             }
            arr[j+1] = key;
             System.out.println("Iteration " + i + ": Swaps = " + swap + " | Array: " + Arrays.toString(arr));

         }
         }
     }

    public static void main(String[] args) {
         int array[] = { 9,5,1,4,3,6,8,7,2,0};
        //sort(array);
        //System.out.println(Arrays.toString(array)+'\n');

        even_insersion(array);
        System.out.println(Arrays.toString(array));
    }
}
