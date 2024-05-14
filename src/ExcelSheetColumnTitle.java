public class ExcelSheetColumnTitle {
    public static void main(String[] args) {
        // String o1 = new ExcelSheetColumnTitle().convertToTitle(1);
        // System.out.println(o1);//A

        // String o2 = new ExcelSheetColumnTitle().convertToTitle(27);
        // System.out.println(o2);//AA

        // String o3 = new ExcelSheetColumnTitle().convertToTitle(701);
        // System.out.println(o3);//ZY

        // String o4 = new ExcelSheetColumnTitle().convertToTitle(47);
        // System.out.println(o4);//AT

        // String o5 = new ExcelSheetColumnTitle().convertToTitle(28);
        // System.out.println(o5);//AB
        
        String o6 = new ExcelSheetColumnTitle().convertToTitle(2147483647);
        System.out.println(o6);
    }

    public String convertToTitle(int columnNumber) {
        StringBuffer sb = new StringBuffer();
        while (columnNumber > 0) {
            char howNamyTimes = (char)((columnNumber-1)%26+'A');
            columnNumber = (columnNumber-1)/26;
            sb.append(howNamyTimes);
            System.out.println(howNamyTimes+":"+columnNumber);
        }
        return sb.reverse().toString();
    }
}
