package util;

/**
 * Created by mr.lin on 2018/4/6.
 */
public class Utils {

    public static int[] stringToInts(String input) {
        String[] strings = input.split(",");
        int[] numbers = new int[strings.length];

        for (int i = 0; i < strings.length; i++) {
            numbers[i] = Integer.parseInt(strings[i]);
        }
        return numbers;
    }

    public static String intsToString(int[] ints) {
        StringBuffer stringBuffer = new StringBuffer();
        for (int i = 0; i < ints.length - 1; i++) {
            stringBuffer.append(ints[i]).append(",");
        }
        stringBuffer.append(ints[ints.length - 1]);
        return stringBuffer.toString();
    }

}
