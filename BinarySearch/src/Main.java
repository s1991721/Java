import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import solution.BinarySearchSolution;
import solution.ClosestElementsSolution;
import solution.DuplicateNumberSolution;
import solution.MinimumRotatedSolution;
import solution.NextGreatestLetterSolution;
import solution.PeakElementSolution;
import solution.PerfectSquareSolution;
import solution.PowSolution;
import solution.RotatedSortedArraySolution;
import solution.SearchRangeSolution;
import solution.SqrtSolution;
import solution.TwoSumSolution;

public class Main {

    public static void main(String[] args) {

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String line = null;
        try {
            line = in.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }

//        System.out.println(new BinarySearchSolution().solution(line));

//        System.out.println(new SqrtSolution().solution(line));

//        System.out.println(new RotatedSortedArraySolution().solution(line));

//        System.out.println(new PeakElementSolution().solution(line));

//        System.out.println(new SearchRangeSolution().solution(line));

//        System.out.println(new ClosestElementsSolution().solution(line));

//        System.out.println(new PowSolution().solution(line));

//        System.out.println(new PerfectSquareSolution().solution(line));

//        System.out.println(new NextGreatestLetterSolution().solution(line));

//        System.out.println(new MinimumRotatedSolution().solution(line));

//        System.out.println(new TwoSumSolution().solution(line));

        System.out.println(new DuplicateNumberSolution().solution(line));
    }
}
