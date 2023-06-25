package admission.utils;

/**
 *
 * @author Yougeshwar
 */
public class ListNumberToWord {

    public static String convert(int i) {
        if (i == 1) {
            return "FIRST";
        } else if (i == 2) {
            return "SECOND";
        } else if (i == 3) {
            return "THIRD";
        } else if (i == 4) {
            return "LEFT OVER SEATS - ";
        } else {
            return "LEFT OVER SEATS - ";
        }
    }
}
