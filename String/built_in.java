package String;

import java.util.Arrays;

public class built_in {
    public static void main(String[] args) {
        String s = "Hello";
        System.out.println(s);
        System.out.println(s.substring(0,4));
        System.out.println(s.contains("Hell"));
        System.out.println(s.replace("l","r"));
        System.out.println(s.equals("hell"));
        System.out.println(s.toLowerCase());
        System.out.println(s.toUpperCase());

        // Ambiguity
        String s1 = "Hello";
        System.out.println("the comparison of s,s1 in .equals() is: "+s.equals(s1));

        // ==,it checks the address of the literals.
        if (s == s1){
            System.out.println("the s ==s1 is : "+"true");
        }
        else System.out.println("the s == s1 is : "+"Fasle");

        String s2 = new String("Hello");

        System.out.println("Comarison of s,s2 in .equals() is: "+s.equals(s2));

        if(s == s2){
            System.out.println("the comparison of s == s2  is: "+"true");
        }
        else System.out.println("the comparison of s == s2  is: "+"false");

        String st = "  aab";
        System.out.println("trimming the white spaces from "+st.trim());

        String str = "Xcer";
        System.out.println(str.isEmpty());

        String strin = "ASDF";
        char [] arrayS = strin.toCharArray();
        System.out.println(Arrays.toString(arrayS));

        // making Aayush -> AayuXsh
        String s0 = "Aayush";
        int indexInsert = 4;
        String addingSting = "XCX";
        String s01 = s0.substring(0,indexInsert) +addingSting + s0.substring(indexInsert);
        System.out.println("Adding the 'XCX' in Aayush : " +s01);

        System.out.println("----".repeat(12));
            String s11 = "My is Aayush";
            int addWordAt = 2;
            String addingWord = " name";
            String ans = "";

            ans+= s11.substring(0,addWordAt);
            ans+= addingWord;
            ans+= s11.substring(addWordAt);

        System.out.println(ans);


    }
}
