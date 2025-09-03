package Array;

import java.util.Random;
import java.util.Scanner;

public class arrayGame {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[3];
        for (int i =0 ; i<arr.length;i++){
            arr[i] = random.nextInt(10);
        }
        System.out.println("Guess the number :");
        for(int i = 0 ; i<arr.length;i++){
            System.out.println(i + " : " + arr[i]);
        }
    }
}
