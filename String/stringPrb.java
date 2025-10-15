package String;

import java.util.HashMap;

public class stringPrb {
    public static  String reverse(String s){
        String r ="";
        for(int i = s.length()-1;i>=0;i--){
            r= r+s.charAt(i);
        }
        return  r;
    }
    public static boolean palindrome(String s){
        int i = 0 , j = s.length()-1;
        while (i<=j){
            if(s.charAt(i)!=s.charAt(j)){
                System.out.println("not a palindrome");
                return false;
            }
            i++;
            j--;
        }
        System.out.println("palindrome");
        return true;
    }

    public static int countVowels(String s){
        int count = 0;
        for (int i = 0 ; i<s.length();i++){
            String lower_S = s.toLowerCase();
            char ch = lower_S.charAt(i);
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
                count++;
            }
        }
        return count;
    }

    public static void firstNonrepeating_Char(String s){
        HashMap<Character,Integer> d = new HashMap<>();
        for(char ch : s.toCharArray()){
            d.put(ch,d.getOrDefault(ch,0)+1);
        }
        for(char i : d.keySet()){
            if(d.get(i)==1){
                System.out.println("the char repeating once is : "+i);
                break;
            }
        }

    }
    public static void main(String[] args) {
        String s= "Helllo";
        System.out.println(reverse(s));

        String s1 = "racecar";
        palindrome(s1);

        String s2 = "asdfgupnvkpwe";
        System.out.println(countVowels(s2));

        String s3 = "swiss";
        firstNonrepeating_Char(s3);
    }
}
