package Array;
public class search_ndArray {
    public static void search(int [] [] arr, int target) {
        int row = arr.length, col = arr[0].length;
        int i = 0, j = col - 1;

        while (i < row && j >= 0) {
            if(arr[i][j] == target){
                System.out.println("\nfound at " + i + " " + j);
                return;
            } else if (arr[i][j] >target) {
                System.out.print(arr[i][j] + " ");
                j--;
            }
            else {
                System.out.print(arr[i][j] + " ");
                i++;
            }
        }
    }
    public static void main(String[] args) {
        int [] [] matrix = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12}
        };
        search(matrix, 6);
    }
}
