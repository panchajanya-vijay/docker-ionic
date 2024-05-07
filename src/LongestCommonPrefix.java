import java.util.Arrays;
import java.util.Comparator;

public class LongestCommonPrefix {
    public static void main(String[] args) {
        String o1 = longestCommonPrefix(new String[]{"flower","flow","flight"});
        System.out.println(o1);
        String o2 = longestCommonPrefix(new String[]{"dog","racecar","car"});
        System.out.println(o2);
        String o3 = longestCommonPrefix(new String[]{"dog","racecar","race"});
        System.out.println(o3);
        String o4 = longestCommonPrefix(new String[]{"interspecies","interstellar","interstate"});
        System.out.println(o4);
        String o5 = longestCommonPrefix(new String[]{""});
        System.out.println(o5);
        String o6 = longestCommonPrefix(new String[]{"a"});
        System.out.println(o6);
        String o7 = longestCommonPrefix(new String[]{"ab", "a"});
        System.out.println(o7);
        // Wrong example -> longestCommonPrefix(new String[]{"dog", "flower","flow","flight", "interspecies","interstellar","interstate"});
    }

    public static String longestCommonPrefix(String[] strs) {
        if(strs.length <= 1 && strs.length >=200) {
            return "";
        }
        for (String str : strs) {
            if(str.isEmpty()) {
                return "";
            }
        }
        if(strs.length == 1) {
            return strs[0];
        }
        int count = 0;
        boolean exists = true;
        Arrays.sort(strs, Comparator.comparing(String::length));
        while (exists) {
            if(strs[0].toCharArray().length == count) {
                break;
            }
            char c = strs[0].toCharArray()[count];
            for(int i=1; i<strs.length; i++) {
                if(!(c == strs[i].toCharArray()[count])) {
                    exists = false;
                }
            }
            if(exists) {
                count+=1;
            }
        }
        return strs[0].substring(0, count);
    }

}
