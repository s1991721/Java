package solution;

import java.util.HashMap;

import utils.Util;

/**
 * Created by mr.lin on 2018/5/23.
 * <p>
 * 4Sum II
 * <p>
 * https://leetcode.com/explore/learn/card/hash-table/187/conclusion-hash-table/1134/
 */
public class FourSumSolution {

    public String solution(String input) {
        String[] strings = input.split("!");
        int[][] ints = new int[strings.length][];
        for (int i = 0; i < strings.length; i++) {
            ints[i] = Util.stringToIntegerArray(strings[i]);
        }

        return fourSumCount(ints[0], ints[1], ints[2], ints[3]) + "";
    }

    private int fourSumCount(int[] A, int[] B, int[] C, int[] D) {

        HashMap<Integer, Integer> hashMap = new HashMap<>();

        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < B.length; j++) {
                hashMap.put(A[i] + B[j], hashMap.getOrDefault(A[i] + B[j], 0) + 1);
            }
        }

        int res = 0;
        for (int i = 0; i < C.length; i++) {
            for (int j = 0; j < D.length; j++) {
                if (hashMap.containsKey(-(C[i] + D[j]))) {
                    res += hashMap.get(-(C[i] + D[j]));
                }
            }
        }

        return res;
    }

}
