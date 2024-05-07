import java.util.Arrays;

public class PlusOne {
    public static void main(String[] args) {
        int[] o1 = new PlusOne().plusOne(new int[]{1,2,3});
        System.out.println(o1);

        int[] o2 = new PlusOne().plusOne(new int[]{4,3,2,1});
        System.out.println(o2);

        int[] o3 = new PlusOne().plusOne(new int[]{9});
        System.out.println(o3);

        int[] o4 = new PlusOne().plusOne(new int[]{2,9,9,9,9});
        System.out.println(o4);

        int[] o5 = new PlusOne().plusOne(new int[]{9,9,9,9});
        System.out.println(o5);
    }

    public int[] plusOne(int[] digits) {
        int toAdd = 1;
        for (int i=digits.length-1; i>=0; i--) {
            digits[i] = digits[i]+toAdd;
            if (digits[i] > 9) {
                if(i == 0) {
                    int[] newArray = new int[digits.length + 1];
                    digits[0] = 0;
                    System.arraycopy(digits, 0, newArray, 1, digits.length);
                    newArray[0] = toAdd;
                    digits = newArray;
                } else {
                    toAdd = 1;
                    digits[i] = 0;
                }
            } else {
                toAdd = 0;
            }
        }
        return digits;
    }
}
