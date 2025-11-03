package Array;

public class Binary_search_Roated {
    public static int search(int[] arr, int target){
        int l = 0 ;
        int r = arr.length - 1 ;
        while (l<=r){
            int mid = l  + (r-l) /2 ;
            if (arr[mid] == target){
                return mid;
            }
            if (arr[l] <= arr[mid]){
                if (arr[l] <= target && target < arr[mid]) {
                    r = mid - 1;
                }
                else {
                    l = mid+1;
                }
            }
            else {
                if (arr[mid] < target && target <= arr[r]){
                    l = mid+1;
                }
                else {
                    r = mid-1;
                }
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] array = {4, 5, 6, 7, 0, 1, 2};
        int target = 0;
        System.out.println(search(array, target));
    }
}
