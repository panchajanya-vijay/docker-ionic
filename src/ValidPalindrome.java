public class ValidPalindrome {

    public static void main(String[] args) {
        boolean o1 = new ValidPalindrome().isPalindrome("A man, a plan, a canal: Panama");
        System.out.println(o1);

        boolean o2 = new ValidPalindrome().isPalindrome("race a car");
        System.out.println(o2);

        boolean o3 = new ValidPalindrome().isPalindrome(" ");
        System.out.println(o3);

        boolean o6 = new ValidPalindrome().isPalindrome(".");
        System.out.println(o6);

        boolean o4 = new ValidPalindrome().isPalindrome("a");
        System.out.println(o4);

        boolean o5 = new ValidPalindrome().isPalindrome("a.");
        System.out.println(o5);
        
        boolean o7 = new ValidPalindrome().isPalindrome("0P");
        System.out.println(o7);
        
    }

    // public boolean isPalindrome(String s) {
    //     s = s.replaceAll(" ", "");
    //     int j=s.length()-1;
    //     for(int i=0; i<s.length()/2; i++) {
    //         Character c1, c2;
    //         if(Character.isAlphabetic(s.charAt(i))) {
    //             c1 =  s.charAt(i);
    //         } else {
    //             i = i+1>=s.length()?i:i+1;
    //             c1 =s.charAt(i);
    //         }
    //         if(Character.isAlphabetic(s.charAt(j))) {
    //             c2 =  s.charAt(j);
    //         } else {
    //             j = j-1<s.length()/2?0:j-1;
    //             c2 = s.charAt(j);
    //         }
    //         j--;
    //         System.out.println("c1: " + c1 + " - c2: " + c2);
    //         if(Character.toUpperCase(c1) != Character.toUpperCase(c2)) {
    //             return false;
    //         }
    //     }
    //     return true;
    // }
    public boolean isPalindrome(String s) {
        for (char c : s.toCharArray()) {
            if (!Character.isAlphabetic(c) && !Character.isDigit(c)) {
                s = s.replace(c+"", "");
            }
        }
        s = s.replace(" ", "");
        System.out.println(s);
        for(int i=0; i<s.length()/2; i++) {
            if(Character.toUpperCase(s.charAt(i)) != Character.toUpperCase(s.charAt((s.length()-1)-i))) {
                return false;
            }
        }
        return true;
    }
}