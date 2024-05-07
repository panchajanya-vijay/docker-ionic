public class ZigzagConversion {
    public static void main(String[] args) {
        String output1 = new ZigzagConversion().convert("PAYPALISHIRING",2);
        System.out.println(output1);
        // P   A   H   N
        // A P L S I I G
        // Y   I   R    

        // P     I    N
        // A   L S  I G
        // Y A   H R
        // P     I

        // P     H
        // A   S I
        // Y  I  R
        // P L   I G
        // A     N
        // System.out.println("PAYPALISHIRING".charAt(13)+"");
    }

    public String convert(String s, int numRows) {
        int beforeIteration = (numRows-2)*2;
        StringBuilder sb = new StringBuilder();
        if (s.length() == 1 || numRows == 1) {
            return s;
        }
        for(int i=0; i<s.length(); i++) {
            boolean isDone = true;
            int iteration = i;
            while (isDone && i<numRows) {
                // System.out.print((i>0 && i<numRows-1 && (beforeIteration+iteration)<=s.length() && j>0) ? beforeIteration: "");
                sb.append(s.charAt(iteration));
                sb.append((i>0 && i<numRows-1 && beforeIteration+iteration<s.length() ? s.charAt(beforeIteration+iteration): ""));
                iteration+=(numRows+(numRows-2));
                
                if(iteration>=s.length()) {
                    isDone = false;
                }
            }
            if(i>0) {
                beforeIteration=beforeIteration-2;
            }
            if(i>numRows) {
                break;
            }
        }
        return sb.toString();
    }
}
