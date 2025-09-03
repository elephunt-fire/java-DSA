package Array;

public class arrayLinearSearch {
    static int search(int[] arr, int target){
        for(int i = 0; i<arr.length ; i++) {
            if (arr[i] == target) {
                return  i ;
                }
            }
        return -1;
        }

    public static void main(String[] args) {
        int[] array = {1,2,3,4,5};
        System.out.println(search(array, 0));

        System.out.println("Alternative method of printing the linear search");
        int[] arr = {10,20,30,40};
        int res  = search(arr , 40);
        if (res != -1) {
            System.out.println("Element found at index: " + res);
        }
        else {
            System.out.println("Enter element not found");
        }
    }
}
