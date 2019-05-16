/**
 * Created by mr.lin on 2019/5/16
 * <p>
 * Add Binary
 * <p>
 * https://leetcode.com/explore/learn/card/array-and-string/203/introduction-to-string/1160/
 */
public class AddBinarySolution {

    public static String addBinary(String a, String b) {

        int i = a.length() - 1;
        int j = b.length() - 1;

        StringBuffer stringBuffer = new StringBuffer();

        int carry = 0;
        while (i >= 0 || j >= 0) {
            int sum = carry;

            if (i >= 0) {
                sum += a.charAt(i) - '0';
                i--;
            }
            if (j >= 0) {
                sum += b.charAt(j) - '0';
                j--;
            }

            carry = sum / 2;
            sum = sum % 2;

            stringBuffer.insert(0, sum);

        }
        if (carry != 0) {
            stringBuffer.insert(0, carry);
        }


        return stringBuffer.toString();
    }

    public static void main(String[] args) {

        System.out.println(addBinary("1010", "1011"));

    }

}
