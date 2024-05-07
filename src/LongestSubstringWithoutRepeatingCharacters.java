import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class LongestSubstringWithoutRepeatingCharacters {
    public static void main(String[] args) {
        // int case1 = new LongestSubstringWithoutRepeatingCharacters().lengthOfLongestSubstring("javaconceptoftheday");
        // System.out.println("javaconceptoftheday: " + case1);
        /*
             * jav
             * av
             * vacon
             * acon
             * con
             * on
             * ncept
             * ceptof
             * eptof
             * ptof
             * tof
             * oftheday
             * 
             */

        int case2 = new LongestSubstringWithoutRepeatingCharacters().lengthOfLongestSubstring("Experiment");
        System.out.println("javaconceptoftheday: " + case2);

        // int case3 = new LongestSubstringWithoutRepeatingCharacters().lengthOfLongestSubstring("hijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789hijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789hijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789hijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789hijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789hijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789");
        // System.out.println(case3);
    }

    public int lengthOfLongestSubstring(String s) {
        int output = 0;
        char[] chars = s.toCharArray();
        for(int i=0; i<chars.length; i++) {
            char s1[] = s.substring(i, chars.length).toCharArray();
            String str = "";
            if (output < s1.length) {
                for(int j=0; j<s1.length; j++) {
                    if (!str.contains((s1[j]+""))) {
                        str+=s1[j];
                    } else {
                        break;
                    }
                    System.out.print(""+s1[j]);
                }
            } else {
                break;
            }
            output = (output < str.length() ? str.length(): output);
            System.out.println("-->" + str.length());
        }
        return output;
    }
}