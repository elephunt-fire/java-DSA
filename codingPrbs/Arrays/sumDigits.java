package Array;

import java.util.Scanner;

public class sumDigits {
    static int sumofD(int n){
        int sum = 0 ;
        while (n >0) {
            int last = n%10 ;
            sum = sum + last;
            n = n / 10 ;
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println("Enter the Number: ");
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(sumofD(n));
    }
}
