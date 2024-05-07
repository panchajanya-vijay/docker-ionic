import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class RegularExpressionMatching {
    public static void main(String[] args) {
        // boolean output1 = new RegularExpressionMatching().isMatch("aa", "a");
        // System.out.println((output1 == false)? "Test case Passed": "Test case Failed");

        // boolean output2 = new RegularExpressionMatching().isMatch("aa", "a*");
        // System.out.println((output2 == true)? "Test case Passed": "Test case Failed");

        // boolean output6 = new RegularExpressionMatching().isMatch("aab", "a*");
        // System.out.println((output6 == false)? "Test case Passed": "Test case Failed");

        // boolean output8 = new RegularExpressionMatching().isMatch("", "a*");
        // System.out.println((output8 == false)? "Test case Passed": "Test case Failed");

        // boolean output7 = new RegularExpressionMatching().isMatch("b", "a*");
        // System.out.println((output7 == false)? "Test case Passed": "Test case Failed");

        // boolean output3 = new RegularExpressionMatching().isMatch("ab", ".*");
        // System.out.println((output3 == true)? "Test case Passed": "Test case Failed");

        // boolean output4 = new RegularExpressionMatching().isMatch("aaaabbbcccdddd", "a*b*c*d*");
        // System.out.println((output4 == true)? "Test case Passed": "Test case Failed");

        // boolean output9 = new RegularExpressionMatching().isMatch("aaaabbbcccdddd", "a*b*c*d*e");
        // System.out.println((output9 == false)? "Test case Passed": "Test case Failed");
        
        // boolean output5 = new RegularExpressionMatching().isMatch("abbbcccdddd", "a*b*c*d");
        // System.out.println((output5 == false)? "Test case Passed": "Test case Failed");

        // boolean output10 = new RegularExpressionMatching().isMatch("aabbccdd", "a.b.c.d.");
        // System.out.println((output10 == true)? "Test case Passed": "Test case Failed");

        // boolean output11 = new RegularExpressionMatching().isMatch("aabbccdd", "a.b.c.d");
        // System.out.println((output11 == false)? "Test case Passed": "Test case Failed");

        // boolean output12 = new RegularExpressionMatching().isMatch("aabbccdd", "a.b*c.d.");
        // System.out.println((output12 == true)? "Test case Passed": "Test case Failed");

        // boolean output13 = new RegularExpressionMatching().isMatch("abcd", "abcd.");
        // System.out.println((output13 == false)? "Test case Passed": "Test case Failed");

        // boolean output14 = new RegularExpressionMatching().isMatch("aab", "c*a*b");
        // System.out.println((output14 == true)? "Test case Passed": "Test case Failed");

        // boolean output15 = new RegularExpressionMatching().isMatch("mississippi", "mis*is*p*.");
        // System.out.println((output15 == false)? "Test case Passed": "Test case Failed");

        // boolean output16 = new RegularExpressionMatching().isMatch("mississippi", "mis*is*ip*.");
        // System.out.println((output16 == true)? "Test case Passed": "Test case Failed");

        // boolean output17 = new RegularExpressionMatching().isMatch("aa", "aa");
        // System.out.println((output17 == true)? "Test case Passed": "Test case Failed");

        // boolean output18 = new RegularExpressionMatching().isMatch("aa", ".*");
        // System.out.println((output18 == true)? "Test case Passed": "Test case Failed");

        // boolean output19 = new RegularExpressionMatching().isMatch("aaa", "a.a");
        // System.out.println((output19 == true)? "Test case Passed": "Test case Failed");

        // boolean output20 = new RegularExpressionMatching().isMatch("aaa", "a*a");
        // System.out.println((output20 == true)? "Test case Passed": "Test case Failed");

        boolean output21 = new RegularExpressionMatching().isMatch("baaaaaab", "ba*aaaab");
        System.out.println((output21 == true)? "Test case Passed": "Test case Failed");

        // boolean output22 = new RegularExpressionMatching().isMatch("aaa", "*a");
        // System.out.println((output22 == true)? "Test case Passed": "Test case Failed");

        // boolean output22 = new RegularExpressionMatching().isMatch("aaab", "*ab");
        // System.out.println((output22 == true)? "Test case Passed": "Test case Failed");

        // boolean output21 = new RegularExpressionMatching().isMatch("baaaaaab", "ba*ab");
        // System.out.println((output21 == true)? "Test case Passed": "Test case Failed");
    }

    public boolean isMatch(String s, String p) {
        boolean output = true;
        if(s.length() == 0 || s.length() >20) {
            return false;
        }
        if(s.equals(p)) {
            return true;
        }
        // char previousCharacter = '-';
        char[] patternsCharArray = p.toCharArray();
        for(int i=0; i<patternsCharArray.length; i++) {
            // if(i>0 && previousCharacter != '-' && patternsCharArray[i-1] == previousCharacter) {
            //     i++;
            // }
            // previousCharacter = patternsCharArray[i];
            if(s == "") {
                output = false;
                break;
            }
            if(Character.isAlphabetic(patternsCharArray[i])) {
                if(i+1<patternsCharArray.length) {
                    if(patternsCharArray[i+1] == '*') {
                        Object[] recur = isValidStarOrDot(s, patternsCharArray[i], patternsCharArray[i+1], (i+2<patternsCharArray.length?patternsCharArray[i+2]: '-'));
                        s = (String)recur[0];
                        // if(i+2 <= patternsCharArray.length) {

                        // }
                        if(!(boolean)recur[1]) {
                            output = false;
                            break;
                        }
                        i++;
                    } else if(patternsCharArray[i+1] == '.') {
                        Object[] recur = isValidStarOrDot(s, patternsCharArray[i], patternsCharArray[i+1], (i+2<patternsCharArray.length?patternsCharArray[i+2]: '-'));
                        s = (String)recur[0];
                        if(!(boolean)recur[1]) {
                            output = false;
                            break;
                        }
                        i++;
                    } else { // next is an alphabet
                        Object[] recur = isValidStarOrDot(s, patternsCharArray[i], patternsCharArray[i+1], (i+2<patternsCharArray.length?patternsCharArray[i+2]: '-'));
                        s = (String)recur[0];
                        if(!(boolean)recur[1]) {
                            output = false;
                            break;
                        }
                    }
                } else { // single character
                    if(s.equals(patternsCharArray[i]+"")) {
                        s = "";
                        output = true;
                        break;
                    } else {
                        output = false;
                        break;
                    }
                }
                
            } else if(patternsCharArray[i] == '*') {
                if(i+1<patternsCharArray.length) {
                    // Object[] recur = isValidStarOrDot(s, patternsCharArray[i], patternsCharArray[i+1]);
                    // s = (String)recur[0];
                    // if(!(boolean)recur[1]) {
                    //     output = false;
                    //     break;
                    // }
                    char[] stringCharArray = s.toCharArray();
                    Set<Character> list = new HashSet<Character>();
                    int count = 0;
                    for(int j=0; j<stringCharArray.length; j++) {
                        list.add(stringCharArray[j]);
                        count++;
                    }
                    System.out.println(list);
                    if((char) list.toArray()[0] == patternsCharArray[i+1]) {
                        System.out.println("same!!!");
                        s = s.substring(count-1, s.length());
                    }
                } else {
                    s = s.substring(i, s.length());
                    output = true;
                    break;
                }
            } else if(patternsCharArray[i] == '.') {
                if (s.length()>=1) {
                    s = s.substring(1, s.length());
                    output = true;
                }
            }
        }
        if(s.length()>0) {
            output = false;
        }
        return output;
    }

    // if * or . is leading with an alphabet
    private Object[] isValidStarOrDot(String s, char str, char pattern, char next) {
        int count = 0, k = 0;
        char[] stringCharArray = s.toCharArray();
        Object[] alpha = new Object[2];
        if(str == '*') {

        } else if(str == '.') {

        } else {
            for(int i=0; i<stringCharArray.length; i++) {
                if(stringCharArray[i] == str) {
                    count++;
                } else {
                    break;
                }
                k=i;
            }
        }
        if(pattern == '*') {
            if(count == 0) {
                alpha[0] = s.substring(k, s.length());
                alpha[1] = true;
            }
            if(count > 0) {
                // char[] stringCharArray = s.toCharArray();
                Set<Character> list = new HashSet<Character>();
                int c = 0;
                for(int j=0; j<stringCharArray.length; j++) {
                    list.add(stringCharArray[j]);
                    c++;
                }
                System.out.println(list);
                if(list.size() == 1 && next != '-' && (char) list.toArray()[0] == next) {
                    System.out.println("same!!!");
                    alpha[0] =  s.substring(c-1, s.length());
                    alpha[1] = true;
                } else {
                    alpha[0] = s.substring(k+1, s.length());
                    alpha[1] = true;
                }
            }
        } else if(pattern == '.') {
            if(count >= 2) {
                alpha[0] = s.substring(2, s.length());
                alpha[1] = true;
            } else {
                alpha[0] = "";
                alpha[1] = false;
            }
        } else {
            if(count == 1) {
                alpha[0] = s.substring(k+1, s.length());
                alpha[1] = true;
            } else {
                alpha[0] = "";
                alpha[1] = false;
            }
        }
        return alpha;
    }
    

    // public boolean isMatch(String s, String p) {
    //     boolean output = true;
    //     if(s.length() == 0 || s.length() >20) {
    //         return false;
    //     }
    //     if(s.equals(p)) {
    //         return true;
    //     }
    //     char[] patternsCharArray = p.toCharArray();
    //     for(int i=0; i<patternsCharArray.length; i++) {
    //         if(Character.isAlphabetic(patternsCharArray[i])) {
    //             if(i+1<patternsCharArray.length) {
    //                 if(patternsCharArray[i+1] == '*') {
    //                     Object[] recur = isValidStarOrDot(s, patternsCharArray[i], patternsCharArray[i+1]);
    //                     s = (String)recur[0];
    //                     if(!(boolean)recur[1]) {
    //                         output = false;
    //                         break;
    //                     }
    //                     i++;
    //                 } else if(patternsCharArray[i+1] == '.') {
    //                     Object[] recur = isValidStarOrDot(s, patternsCharArray[i], patternsCharArray[i+1]);
    //                     s = (String)recur[0];
    //                     if(!(boolean)recur[1]) {
    //                         output = false;
    //                         break;
    //                     }
    //                     i++;
    //                 } else { // next is an alphabet
    //                     Object[] recur = isValidStarOrDot(s, patternsCharArray[i], patternsCharArray[i+1]);
    //                     s = (String)recur[0];
    //                     if(!(boolean)recur[1]) {
    //                         output = false;
    //                         break;
    //                     }
    //                 }
    //             } else { // single character
    //                 if(s.equals(patternsCharArray[i]+"")) {
    //                     s = "";
    //                     output = true;
    //                     break;
    //                 } else {
    //                     output = false;
    //                     break;
    //                 }
    //             }
                
    //         } else if(patternsCharArray[i] == '*') {
    //             if(i+1<patternsCharArray.length) {
    //                 Object[] recur = isValidStarOrDot(s, patternsCharArray[i], patternsCharArray[i+1]);
    //                 s = (String)recur[0];
    //                 if(!(boolean)recur[1]) {
    //                     output = false;
    //                     break;
    //                 }
    //             } else {
    //                 output = true;
    //                 s = s.substring(i, s.length());
    //                 break;
    //             }
    //         } else if(patternsCharArray[i] == '.') {
    //             char[] stringCharArray = s.toCharArray();
    //             if (s.length()>1) {
    //                 // if(stringCharArray[0] == stringCharArray[1]) {
    //                 //     output = false;
    //                 //     break;
    //                 // } else {
    //                     output = true;
    //                     s = s.substring(1, s.length());
    //                 // }
    //             } else if(s.length() == 1) {
    //                 s = s.substring(1, s.length());
    //             }
    //         }
    //     }
    //     if(s.length()>0) {
    //         output = false;
    //     }
    //     return output;
    // }

    // // if * or . is leading with an alphabet
    // private Object[] isValidStarOrDot(String s, char str, char pattern) {
    //     int count = 0, k = 0;
    //     char[] stringCharArray = s.toCharArray();
    //     Object[] alpha = new Object[2];
    //     for(int i=0; i<stringCharArray.length; i++) {
    //         // if(i==0 && stringCharArray[i] != str) {
    //         //     alpha[0] = s.substring(i, s.length());
    //         //     alpha[1] = false;
    //         //     return alpha;
    //         // }
    //         if(stringCharArray[i] == str) {
    //             count++;
    //         } else {
    //             break;
    //         }
    //         k=i;
    //     }
    //     if(pattern == '*') {
    //         // System.out.println(k + ":" + s.length() + ":" + s.substring(k, s.length()));
    //         if(count > 0) {
    //             alpha[0] = s.substring(k+1, s.length());
    //             alpha[1] = true;
    //         } else if(count == 0) {
    //             alpha[0] = s.substring(k, s.length());
    //             alpha[1] = true;
    //         } else {
    //             alpha[0] = "";
    //             alpha[1] = false;
    //         }
    //     } else if(pattern == '.') {
    //         if(count == 2) {
    //             alpha[0] = s.substring(k+1, s.length());
    //             alpha[1] = true;
    //         } else if(count <2 || count > 2) {
    //             alpha[0] = "";
    //             alpha[1] = false;
    //         }
    //     } else {
    //         if(count == 1) {
    //             alpha[0] = s.substring(k+1, s.length());
    //             alpha[1] = true;
    //         } else {
    //             alpha[0] = "";
    //             alpha[1] = false;
    //         }
    //     }
    //     return alpha;
    // }
    
}
