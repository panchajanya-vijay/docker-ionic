public class AddBinary {
    public static void main(String[] args) {
        // String o1 = new AddBinary().addBinary("11", "1");
        // System.out.println(o1);

        // String o2 = new AddBinary().addBinary("1010", "1011");
        // System.out.println(o2);

        // String o3 = new AddBinary().addBinary("0", "0");
        // System.out.println(o3);

        String o4 = new AddBinary()
        .addBinary("10100000100100110110010000010101111011011001101110111111111101000000101111001110001111100001101", 
                    "110101001011101110001111100110001010100001101011101010000011011011001011101111001100000011011110011");
        System.out.println(o4);

        // String o5 = new AddBinary().addBinary("1111", "1111");
        // System.out.println(o5);

        // String o6 = new AddBinary().addBinary("10100000", "11010100");
        // System.out.println(o6);

        // System.out.println((int)'1'+(int)'0');
    }

    public String addBinary(String a, String b) {
        StringBuilder sb = new StringBuilder();
        int i=a.length()-1;
        int j=b.length()-1;
        int carry = 0;
        while (i>=0 || j>=0) {
            int current = (i>=0 ? Character.getNumericValue(a.toCharArray()[i]) : 0) +
            (j>=0 ? Character.getNumericValue(b.toCharArray()[j]) : 0);
            current += carry;
            if(current == 1) {
                carry = 0;
                current = 1;
            } else if(current == 2) {
                carry = 1;
                current = 0;
            } else if(current == 3) {
                carry = 1;
                current = 1;
            } else {
                carry = 0;
                current = 0;
            }
            sb.append(current);
            // System.out.println(a.toCharArray()[i]+" + "+b.toCharArray()[j]+" next=>("+carry+") = "+current);
            i--;
            j--;
        }
        if (carry == 1) {
            sb.append(carry);
        }
        return sb.reverse().toString();
    }

    /* Implementation 1 {worst}
    public String addBinary(String a, String b) {
        return convertDecimalToBinary(convertBinaryToDecimal(a) + convertBinaryToDecimal(b));
    }

    private long convertBinaryToDecimal(String a) {
        char[] aI = a.toCharArray();
        long sum = 0;
        for(int i=aI.length-1; i>=0;i--) {
            sum = sum + (Long.parseLong(aI[i]+"")*((long) Math.pow(2, (a.length()-1)-i)));
        }
        System.out.println(sum);
        return sum;
    }

    private String convertDecimalToBinary(long afterAddition) {
        System.out.println(afterAddition);
        StringBuilder sb = new StringBuilder();
        if(afterAddition == 0) {
            return "0";
        }
        while(afterAddition > 0) {
            sb.append(afterAddition%2);
            afterAddition = afterAddition/2;
        }
        return sb.reverse().toString();
    } */
}