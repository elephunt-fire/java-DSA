package Array;

public class arrayRefeernce {
    static void changeArray(int [] arr){
        arr[0] = 100 ;
    }
    static int[] printArray(int[] arr){
        for(int i : arr){
            System.out.println(i);
        }
    return arr;
    }

    static int[] methodArray(){
        return new int[] {9,8,7};
    }

    public static void main(String[] args) {
        int [] array = {1,2,3,4,5};
        int [] array1 = array;
        array1[0] = 0 ;
        System.out.println(array[0]);

        System.out.println("Elements in array1 ");
        printArray(array1);

        System.out.println("=================");
        int [] ar= {10,20,30};
        changeArray(ar);
        printArray(ar);

        System.out.println("=================");
        System.out.println("printing the method array()");
        printArray(methodArray());
    }
}
