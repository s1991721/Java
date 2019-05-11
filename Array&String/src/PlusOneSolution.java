/**
 * Created by mr.lin on 2019-05-11.
 * <p>
 * Plus One
 * <p>
 * https://leetcode.com/explore/learn/card/array-and-string/201/introduction-to-array/1148/
 */
public class PlusOneSolution {

    public int[] plusOne(int[] digits) {

        int carry = 1;

        for (int i = digits.length - 1; i >= 0; i--) {

            int sum = digits[i] + carry;
            digits[i] = sum % 10;
            carry = sum / 10;

        }

        if (carry == 1) {
            digits = new int[digits.length + 1];
            digits[0] = 1;
        }

        return digits;

    }

}
