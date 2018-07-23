package solution;

/**
 * Created by mr.lin on 2018/7/15.
 * <p>
 * Find Smallest Letter Greater Than Target
 * <p>
 * https://leetcode.com/explore/learn/card/binary-search/137/conclusion/977/
 */
public class NextGreatestLetterSolution {

    public String solution(String input) {
        String[] strings = input.split("!");

        char[] letters = strings[0].toCharArray();

        char target = strings[1].charAt(0);

        return Character.toString(nextGreatestLetter(letters, target));
    }

    private char nextGreatestLetter(char[] letters, char target) {
        int left = 0;
        int right = letters.length-1;
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (target >= letters[mid]) {//查找target的后一项
                left = mid+1;
            } else {
                right = mid;
            }
        }

        if (target >= letters[left]) {
            int pos = left + 1;
            if (pos > letters.length - 1) {//如果target是最后一项
                pos = 0;
            }
            return letters[pos];
        } else {
            return letters[left];
        }

    }
}
