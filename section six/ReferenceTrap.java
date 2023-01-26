import java.util.Arrays;

public class ReferenceTrap {
    public static void main(String[] args) {
        String[] staffLastYear = { "Tommy", "Joel", "Ellie" };
        String[] staffThisYear = Arrays.copyOf(staffLastYear, staffLastYear.length);
        /*
         * String[] staffThisYear = staffLastYear;
         * staffThisYear[1] = "Abby"; // changing data in this variable changes value in
         * // the previous variable that's a reference trap
         */

        staffThisYear[1] = "Abby";

        System.out.println(Arrays.toString(staffLastYear));
        System.out.println(Arrays.toString(staffThisYear));
    }
}
