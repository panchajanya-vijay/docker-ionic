public class FindTheIndexOfTheFirstOccurrenceInAString {
    public static void main(String[] args) {
        int o1 = new FindTheIndexOfTheFirstOccurrenceInAString().strStr("sadbutsad", "sad");
        System.out.println(o1);

        int o2 = new FindTheIndexOfTheFirstOccurrenceInAString().strStr("leetcode", "leeto");
        System.out.println(o2);

        int o3 = new FindTheIndexOfTheFirstOccurrenceInAString().strStr("aaa", "aaaa");
        System.out.println(o3);

        int o4 = new FindTheIndexOfTheFirstOccurrenceInAString().strStr("a", "a");
        System.out.println(o4);

        int o5 = new FindTheIndexOfTheFirstOccurrenceInAString().strStr("abc", "c");
        System.out.println(o5);
    }

    public int strStr(String haystack, String needle) {
        for(int i=0; i<haystack.length(); i++) {
            if(haystack.equals(needle)) {
                return 0;
            }
            if(haystack.length() - i < needle.length()) {
                return -1;
            }
            if(haystack.charAt(i) == needle.charAt(0) && haystack.subSequence(i, i+needle.length()).equals(needle)) {
                return i;
            }
        }
        return -1;
    }
}
