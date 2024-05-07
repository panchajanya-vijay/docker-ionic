import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class RegularExpressionMatchingCopy {
    public static void main(String[] args) {
        // boolean output1 = new RegularExpressionMatchingCopy().isMatch("aa", "a");
        // System.out.println((output1 == false)? "Test case Passed": "Test case Failed");

        // boolean output2 = new RegularExpressionMatchingCopy().isMatch("aa", "a*");
        // System.out.println((output2 == true)? "Test case Passed": "Test case Failed");

        // boolean output6 = new RegularExpressionMatchingCopy().isMatch("aab", "a*");
        // System.out.println((output6 == false)? "Test case Passed": "Test case Failed");

        // // boolean output8 = new RegularExpressionMatchingCopy().isMatch("", "a*");
        // // System.out.println((output8 == false)? "Test case Passed": "Test case Failed");

        // boolean output7 = new RegularExpressionMatchingCopy().isMatch("b", "a*");
        // System.out.println((output7 == false)? "Test case Passed": "Test case Failed");

        // boolean output3 = new RegularExpressionMatchingCopy().isMatch("ab", ".*");
        // System.out.println((output3 == true)? "Test case Passed": "Test case Failed");

        // boolean output4 = new RegularExpressionMatchingCopy().isMatch("aaaabbbcccdddd", "a*b*c*d*");
        // System.out.println((output4 == true)? "Test case Passed": "Test case Failed");

        // boolean output9 = new RegularExpressionMatchingCopy().isMatch("aaaabbbcccdddd", "a*b*c*d*e");
        // System.out.println((output9 == false)? "Test case Passed": "Test case Failed");
        
        // boolean output5 = new RegularExpressionMatchingCopy().isMatch("abbbcccdddd", "a*b*c*d");
        // System.out.println((output5 == false)? "Test case Passed": "Test case Failed");

        // boolean output10 = new RegularExpressionMatchingCopy().isMatch("aabbccdd", "a.b.c.d.");
        // System.out.println((output10 == true)? "Test case Passed": "Test case Failed");

        // boolean output11 = new RegularExpressionMatchingCopy().isMatch("aabbccdd", "a.b.c.d");
        // System.out.println((output11 == false)? "Test case Passed": "Test case Failed");

        // boolean output12 = new RegularExpressionMatchingCopy().isMatch("aabbccdd", "a.b*c.d.");
        // System.out.println((output12 == true)? "Test case Passed": "Test case Failed");

        // boolean output13 = new RegularExpressionMatchingCopy().isMatch("abcd", "abcd.");
        // System.out.println((output13 == false)? "Test case Passed": "Test case Failed");

        // boolean output14 = new RegularExpressionMatchingCopy().isMatch("aab", "c*a*b");
        // System.out.println((output14 == true)? "Test case Passed": "Test case Failed");

        // boolean output15 = new RegularExpressionMatchingCopy().isMatch("mississippi", "mis*is*p*.");
        // System.out.println((output15 == false)? "Test case Passed": "Test case Failed");

        // boolean output16 = new RegularExpressionMatchingCopy().isMatch("mississippi", "mis*is*ip*.");
        // System.out.println((output16 == true)? "Test case Passed": "Test case Failed");

        // boolean output17 = new RegularExpressionMatchingCopy().isMatch("aa", "aa");
        // System.out.println((output17 == true)? "Test case Passed": "Test case Failed");

        // boolean output18 = new RegularExpressionMatchingCopy().isMatch("aa", ".*");
        // System.out.println((output18 == true)? "Test case Passed": "Test case Failed");

        // boolean output19 = new RegularExpressionMatchingCopy().isMatch("aaa", "a.a");
        // System.out.println((output19 == true)? "Test case Passed": "Test case Failed");

        // boolean output20 = new RegularExpressionMatchingCopy().isMatch("aaa", "a*a");
        // System.out.println((output20 == true)? "Test case Passed": "Test case Failed");

        boolean output21 = new RegularExpressionMatchingCopy().isMatch("baaaaaab", "ba*aaaab");
        System.out.println((output21 == true)? "Test case Passed": "Test case Failed");

        // // boolean output22 = new RegularExpressionMatchingCopy().isMatch("aaa", "*a");
        // // System.out.println((output22 == true)? "Test case Passed": "Test case Failed");

        // // boolean output24 = new RegularExpressionMatchingCopy().isMatch("aaab", "*ab");
        // // System.out.println((output24 == true)? "Test case Passed": "Test case Failed");

        // boolean output23 = new RegularExpressionMatchingCopy().isMatch("baaaaaab", "ba*ab");
        // System.out.println((output23 == true)? "Test case Passed": "Test case Failed");
    }


    public boolean isMatch(String s, String p) {
        // char[] chars = p.toCharArray();
        String p1 = "";
        for(int i=0; i<p.length(); i++) {
            if(p.charAt(i) == '*') {
                // p1 = p.substring(0, i-1);
                for(int j=i+1; j<p.length(); j++) {
                    if(p.charAt(i-1) == p.charAt(j)) {
                        
                    } else {
                        
                    }
                }
            }

        }
        System.out.println(p);
        return true;
    }
}
