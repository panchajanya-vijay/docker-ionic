public class StringToInteger {
    public static void main(String[] args) {
        int output1 = new StringToInteger().myAtoi("4193 with words");
        System.out.println(output1);

        int output2 = new StringToInteger().myAtoi("41");
        System.out.println(output2);

        int output3 = new StringToInteger().myAtoi("  -41");
        System.out.println(output3);

        int output4 = new StringToInteger().myAtoi("words and 987");
        System.out.println(output4);

        int output5 = new StringToInteger().myAtoi("-91283472332");
        System.out.println(output5);

        int output6 = new StringToInteger().myAtoi("91283472332");
        System.out.println(output6);
        
        int output7 = new StringToInteger().myAtoi("3.14159");
        System.out.println(output7);

        int output8 = new StringToInteger().myAtoi(".1");
        System.out.println(output8);

        int output9 = new StringToInteger().myAtoi("+-12");
        System.out.println(output9);

        int output10 = new StringToInteger().myAtoi("+");
        System.out.println(output10);
        
        int output11 = new StringToInteger().myAtoi("00000-42a1234");
        System.out.println(output11);

        int output12 = new StringToInteger().myAtoi("-0012a42");
        System.out.println(output12);
        
        int output13 = new StringToInteger().myAtoi("   +0 123");
        System.out.println(output13);

        int output15 = new StringToInteger().myAtoi("20000000000000000000");
        System.out.println(output15);
        
        int output14 = new StringToInteger().myAtoi("21474836460");
        System.out.println(output14);

        int output16 = new StringToInteger().myAtoi("-5-");
        System.out.println(output16);
    }

    public int myAtoi(String s) {
        char[] chars = s.toCharArray();
        StringBuilder sb = new StringBuilder();
        int numIndex = 1;
        int l;
        try {
            for (int i=0; i<chars.length; i++) {
                if(Character.isAlphabetic(chars[i]) && numIndex == 1) {
                    return 0;
                }
                if((Character.isAlphabetic(chars[i]) && numIndex > 1) 
                    || (chars[i] == ' ' && numIndex>1) 
                    || (!Character.isAlphabetic(chars[i]) && !Character.isDigit(chars[i]) && numIndex > 1)) {
                    break;
                }
                if(Character.isDigit(chars[i]) || chars[i] == '-' || chars[i] == '+') {
                    numIndex++;
                    sb.append(chars[i]);
                }
                if (chars[i] == '.') {
                    break;
                }
            }
            if(sb.toString().equals("")
                || (sb.toString().contains("-") && sb.toString().contains("+"))
                || (sb.toString().length()==1 && (sb.toString().contains("+")))
                || (sb.toString().length()==1 && sb.toString().contains("-"))
                || (sb.toString().contains("-") && sb.toString().toCharArray()[0] != '-')
                || (sb.toString().contains("+") && sb.toString().toCharArray()[0] != '+')) {
                return 0;
            }
            l = Integer.parseInt(sb.toString());
        } catch (NumberFormatException e) {
            if (sb.toString().contains("+")) {
                return Integer.MAX_VALUE;
            } else if(sb.toString().contains("-")) {
                return Integer.MIN_VALUE;
            } else {
                return Integer.MAX_VALUE;
            }
        }
        
        return l;
    }
}
