/**
 * Roman numerals are represented by seven different symbols: I, V, X, L, C, D and M.

    Symbol       Value
    I             1
    V             5
    X             10
    L             50
    C             100
    D             500
    M             1000
    For example, 2 is written as II in Roman numeral, just two ones added together. 12 is written as XII, which is simply X + II. The number 27 is written as XXVII, which is XX + V + II.

    Roman numerals are usually written largest to smallest from left to right. However, the numeral for four is not IIII. Instead, the number four is written as IV. Because the one is before the five we subtract it making four. The same principle applies to the number nine, which is written as IX. There are six instances where subtraction is used:

    I can be placed before V (5) and X (10) to make 4 and 9. 
    X can be placed before L (50) and C (100) to make 40 and 90. 
    C can be placed before D (500) and M (1000) to make 400 and 900.
    Given a roman numeral, convert it to an integer.

    Example 1:

    Input: s = "III"
    Output: 3
    Explanation: III = 3.
    Example 2:

    Input: s = "LVIII"
    Output: 58
    Explanation: L = 50, V= 5, III = 3.
    Example 3:

    Input: s = "MCMXCIV"
    Output: 1994
    Explanation: M = 1000, CM = 900, XC = 90 and IV = 4.
    

    Constraints:

    1 <= s.length <= 15
    s contains only the characters ('I', 'V', 'X', 'L', 'C', 'D', 'M').
    It is guaranteed that s is a valid roman numeral in the range [1, 3999].
 */

 public class RomanToInteger {
    
    public int romanToInt(String s) {
        char[] charArray = s.toCharArray();
        int total = 0;
        for(int index=0; index<charArray.length; index++) {
            // System.out.println(index+"-"+(charArray.length));
            if(charArray.length >= index+2) {
                int firstValue = this.getValue(charArray[index]);
                int secondValue = this.getValue(charArray[index + 1]);
                // System.out.print(charArray[index]+""+charArray[index + 1]+"\t"+index);
                if (firstValue > secondValue) {
                    total += firstValue;
                } else if (firstValue < secondValue) {
                    total += secondValue - firstValue;
                    index++;
                } else {
                    total += firstValue;
                }
                // System.out.println(" :" + total);
            } else {
                total += this.getValue(charArray[index]);
            }
        }
        return total;
    }

    public int getValue(Character romanCharacter) {
        switch (romanCharacter) {
            case 'M':
                return 1000;
            case 'D':
                return 500;
            case 'C':
                return  100;
            case 'L':
                return  50;
            case 'X':
                return  10;
            case 'V':
                return  5;
            case 'I':
                return  1;
        }
        return 0;
    }

    public static void main(String[] args) {
        System.out.println("total: " +  new RomanToInteger().romanToInt("MCMXCIV")); //1994
        System.out.println("total: " +  new RomanToInteger().romanToInt("III")); //3
        System.out.println("total: " +  new RomanToInteger().romanToInt("LVIII")); //58
        System.out.println("total: " +  new RomanToInteger().romanToInt("MMMDCCXXIV")); // 3724
        System.out.println("total: " +  new RomanToInteger().romanToInt("MMMDCCXXVI")); // 3726
        System.out.println("total: " +  new RomanToInteger().romanToInt("MMMDCCXXXI")); // 3731
        System.out.println("total: " +  new RomanToInteger().romanToInt("MMM")); //3000
    }
}
