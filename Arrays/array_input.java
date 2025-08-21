package Array;
import java.util.Scanner;
public class array_input {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int[] myarray =  new int[5];

        // adding values
        for(int i=0;i<myarray.length;i++){
            myarray[i] = sc.nextInt();
        }

        System.out.println("Length of array is: " +myarray.length);

        // printing values
        for(int i = 0; i<myarray.length;i++){
            System.out.println("Value at index "+i+" is: "+myarray[i]);
        }
    }
}
