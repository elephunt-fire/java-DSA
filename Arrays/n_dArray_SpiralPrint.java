package Array;
public class n_dArray_SpiralPrint {
    public static void spiralPrint(int [] [] arr){
        int row = arr.length , col= arr[0].length;
        int top = 0 , bottom = row-1 , left = 0 , right = col-1;

        while(top<=bottom && left<=right){
            for(int i = left; i<=right ;i++){
                System.out.print(arr[top][i] +  ",");
            }
            top++;

            for(int i = top ; i<=bottom;i++){
                System.out.print(arr[i][right] + ",");
            }
            right--;

            if (top <= bottom){
                for(int i = right;i>= left;i--){
                    System.out.print(arr[bottom][i]+ ",");
                }
                bottom--;
            }

            if (left<=right){
                for(int i = bottom ; i>=top ; i--){
                    System.out.print(arr[i][left]+ ",");
                }
                left++;
            }
        }
    }
    public static void wavePoint(int [] [] arr){
        int row = arr.length , col = arr[0].length;
        for(int j = 0 ; j <col ; j++){
            if(j%2==0){
                for (int i = 0; i < row; i++) {
                    System.out.print(arr[i][j] + " ");
                }
            }
            else {
                for (int i = row-1 ; i>=0;i--){
                    System.out.print(arr[i][j] + " ");

                }
            }
        }
    }
    public static void main(String[] args) {
        int [] [] matrix = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12}
        };
        spiralPrint(matrix);
        System.out.println();
        System.out.println();
        wavePoint(matrix);
    }
}
