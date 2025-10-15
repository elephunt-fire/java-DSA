package String;

import java.util.Arrays;

public class stringPrb2 {
    public static void reverseWords(String s){
        String[] sa = s.trim().split(" ");
        System.out.println(Arrays.toString(sa));
        String result = "";
        for(int i = sa.length-1 ; i>=0 ; i--){
            result += sa[i] + " ";
        }
        System.out.println(result);
    }
    public static  boolean CheckSubtring(String s1, String s2){
        int n = s1.length();
        int m = s2.length();

        for(int i = 0 ;i<= n-m ; i++){
            int j = 0;
            while (j<m && s1.charAt(i+j) == s2.charAt(j)){
                j++;
            }
            if(j==m){
                return true;
            }
        }
        return  false;
    }

    public static void main(String[] args) {

        String s = " the sky is blue    ";
        reverseWords(s);

        String s1 = "abcde";
        String s2 = "cde";
        System.out.println (CheckSubtring(s1,s2));
    }
}
