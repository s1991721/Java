package solution;

/**
 * https://leetcode.com/explore/learn/card/queue-stack/231/practical-application-queue/1371/
 */
public class PerfectSquaresSolution {

    public static int numSquares(int n) {

        int[] dp = new int[n + 1];
        dp[0] = 0;

        for (int i = 1; i < dp.length; i++) {

            int j = 1;
            int min = 5;
            while (i - j * j >= 0) {
                min = Math.min(min, dp[i - j * j] + 1);
                j++;
            }
            dp[i] = min;

        }

        return dp[n];
    }

    public static void main(String[] args) {
        System.out.println(numSquares(13) + "");
    }

}
