import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

public class LongestPalindromicSubstring {
    public static void main(String[] args) {
        // System.out.println(new Date(System.currentTimeMillis()));
        // String output1 = new LongestPalindromicSubstring().longestPalindrome("abaxyzzyx");
        // System.out.println(output1);

        // String output2 = new LongestPalindromicSubstring().longestPalindrome("abcda");
        // System.out.println(output2);

        // String output3 = new LongestPalindromicSubstring().longestPalindrome("racecar");
        // System.out.println(output3);

        // String output4 = new LongestPalindromicSubstring().longestPalindrome("aabb");
        // System.out.println(output4);

        // String output5 = new LongestPalindromicSubstring().longestPalindrome("abcda");
        // System.out.println(output5);

        // String output6 = new LongestPalindromicSubstring().longestPalindrome("ccc");
        // System.out.println(output6);

        // String output7 = new LongestPalindromicSubstring().longestPalindrome("ababa");
        // System.out.println(output7);

        // String output8 = new LongestPalindromicSubstring().longestPalindrome("a");
        // System.out.println(output8);

        // String output9 = new LongestPalindromicSubstring().longestPalindrome("ac");
        // System.out.println(output9);

        // String output10 = new LongestPalindromicSubstring().longestPalindrome("aa");
        // System.out.println(output10);

        // String output11 = new LongestPalindromicSubstring().longestPalindrome("aacabdkacaa");
        // System.out.println(output11);

        // String output12 = new LongestPalindromicSubstring().longestPalindrome("xaabacxcabaaxcabaax");
        // System.out.println(output12);

        // String output13 = new LongestPalindromicSubstring().longestPalindrome("abababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababa");
        // System.out.println(output13);
        // System.out.println(new Date(System.currentTimeMillis()));
        // String output12 = new LongestPalindromicSubstring().longestPalindrome("abcda");
        // System.out.println(output12);
        // abaxyzzyx
        // System.out.println(new LongestPalindromicSubstring().longestPalindrome("cd"));
    }

    public boolean palindrome(String value) {
        boolean output = true;
        // abaxyzzyx
        int i=0;
        int j=value.length()-1;
        while(i<=j) {
            if (value.charAt(i) != value.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return output;
    }

    public String longestPalindrome(String s) {
       char[] chars = s.toCharArray();
        if(s.length() == 1) {
            return chars[0]+"";
        } else if(s.length() == 2) {
            if(chars[0] == chars[1]) {
                return s;
            } else {
                return chars[0]+"";
            }
        }
        String longestString = s.substring(0, 1);
        for(int i=0; i<chars.length; i++) {
            for(int j=i+1; j<chars.length; j++) {
                if (chars[i] == chars[j]) {
                    System.out.println(i+ "-"+j);
                    if(palindrome(s.substring(i, j+1))) {
                        System.out.println("palindrome: " + s.substring(i, j+1));
                        if(longestString.length() < s.substring(i, j+1).length()) {
                            longestString = s.substring(i, j+1);
                        }
                        i=j;
                    }
                }
            }
        }
        return longestString;
    }
    
}
