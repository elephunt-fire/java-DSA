package Array;

import java.util.Arrays;

public class zeros_Ending {
    public static int[] reverse(int[] arr) {
        int n = arr.length;;
        int j = 0;

        for(int i = 0 ; i<n ; i++){
            if (arr[i] != 0 ){
                swap(arr ,i,j);
                j++;
            }
        }
        return arr;
    }

    public static void swap(int[] arr , int i , int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static void main(String[] args) {
        int[] array = {0,1,0,3,12};

        int[] a = reverse(array);
        System.out.println(Arrays.toString(a));
    }
}
