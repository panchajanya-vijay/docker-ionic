public class LengthOfLastWord {
    public static void main(String[] args) {
        int o1 = new LengthOfLastWord().lengthOfLastWord("Hello World");
        System.out.println(o1);

        int o2 = new LengthOfLastWord().lengthOfLastWord("   fly me   to   the moon  ");
        System.out.println(o2);

        int o3 = new LengthOfLastWord().lengthOfLastWord("luffy is still joyboy");
        System.out.println(o3);
    }

    public int lengthOfLastWord(String s) {
        String[] strings = s.split(" ");
        System.out.println(strings[strings.length-1]);
        return strings[strings.length-1].length();
    }
}
