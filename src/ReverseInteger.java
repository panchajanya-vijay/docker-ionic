public class ReverseInteger {
    public static void main(String[] args) {
        int output1 = new ReverseInteger().reverse(120);
        System.out.println(output1);
        
    }

    public int reverse(int x) {
        boolean negative = false;
        if(x<0) {
            x=-x;
            negative = true;
        }
        int rem = x%10;
        String output = "";
        int actualOutput = 0;
        while(rem >= 0) {
            output=output+rem;
            x=x/10;
            rem=x%10;
            System.out.println(output);
        }
        try {
            actualOutput = Integer.parseInt(output);
            if(actualOutput > Integer.MAX_VALUE) {
                return actualOutput;
            }
        } catch(NumberFormatException e) {
            return actualOutput;
        }
        
        return (negative?-actualOutput:actualOutput);
    }
}
//2147483647
//964632435