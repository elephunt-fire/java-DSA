package SortingAlgo;
import java.util.*;
public class selection {
    public static void sorting(int [] arr){
        int n = arr.length;
        for(int i = 0 ; i<n-1 ; i++){
            int targetPos = i;
            for (int j = i+1; j< n ; j++){
                if(arr[j]<arr[targetPos]){
                    targetPos = j;
                }
            }
        swap(arr,targetPos,i);
        }
    }
    public static void swap(int[] arr , int i , int j ){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        int[] array= {23,6,7,0,12,52,3,24};
        sorting(array);
        System.out.println(Arrays.toString(array));
    }
}
