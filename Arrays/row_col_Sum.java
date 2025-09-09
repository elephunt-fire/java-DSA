package Array;
public class row_col_Sum {
    public static int row_Sum(int[] [] arr) {
        int max = Integer.MIN_VALUE;
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = 0;
            for (int j = 0; j < arr[0].length; j++) {
                sum += arr[i][j];
            }
            max = Math.max(max,sum);
        }
        return max;
    }
    public static int col_Sum(int[] [] arr){
        int max = Integer.MIN_VALUE;
        for(int col = 0 ; col<arr[0].length;col++){
            int sum = 0 ;
            for (int row = 0 ; row<arr.length;row++){
                sum += arr[row][col];
            }
            max = Math.max(max,sum);
        }
        return max;
    }
    public static int max_row_col(int[][] arr){
        int maxi = Integer.MIN_VALUE;
        int maxj = Integer.MIN_VALUE;
         // Row SUM
        for(int i = 0 ; i<arr.length;i++){
            int sum = 0;
            for(int j =0 ; j<arr[0].length;j++){
                sum+= arr[i][j];
            }
            maxi = Math.max(maxi,sum);
        }
        for(int i = 0 ; i<arr[0].length;i++){
            int sum = 0;
            for(int j = 0 ; j<arr.length;j++){
                sum += arr[j][i];
            }
            maxj = Math.max(maxj,sum);
        }
        return Math.max(maxi,maxj);
    }
    public static void main(String[] args) {
        int [] [] matrix = {
                {3,3,4},
                {1 ,2 ,3},
                {4 ,5 ,6},
                {7 ,8 ,9}
        };
        int result = row_Sum(matrix);
        System.out.println("max sum of row is : "+ result);

        int result1 = col_Sum(matrix);
        System.out.println("max of col sum is : "+ result1);

        int result2 = max_row_col(matrix);
        System.out.println("the max sum of row OR col is : " + result2);
    }
}
