public class Sqrt {
    public static void main(String[] args) {
        // int o1 = new Sqrt().mySqrt(4);
        // System.out.println(o1);

        // int o2 = new Sqrt().mySqrt(8);
        // System.out.println(o2);

        // int o3 = new Sqrt().mySqrt(1);
        // System.out.println(o3);

        // int o4 = new Sqrt().mySqrt(2);
        // System.out.println(o4);

        // int o5 = new Sqrt().mySqrt(2);
        // System.out.println(o5);

        // int o6 = new Sqrt().mySqrt(51);
        // System.out.println(o6);
        
        int o7 = new Sqrt().mySqrt(2147483647);
        System.out.println(o7);

        // int o8 = new Sqrt().mySqrt(50625);
        // System.out.println(o8);
    }

    public int mySqrt(int x) {
        long from = 1;
        long till = (x/2)+1;
        long mid = 0;
        boolean loopThrough = true;
        while (loopThrough && x>0) {
            mid = (till + from)/2;
            long square = mid * mid;
            // System.out.println(from + " " + till + " " + mid + " => " + square + " is " + x + " **** " + (from == mid));
            if (from == mid) {
                loopThrough = false;
                return (int) mid;
            }
            if (square > x) {
                till = mid;
            } else if(square < x) {
                from = mid;
            } else {
                loopThrough = false;
                return (int) mid;
            }
            // if (from == mid) {
            //     loopThrough = false;
            //     return (int) mid;
            // }
        }
        return 0;
    }
}
