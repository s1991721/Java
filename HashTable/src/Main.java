import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import solution.AnagramsSolution;
import solution.DuplicateSolution;
import solution.DuplicateSubtrees;
import solution.HappyNumberSolution;
import solution.IntersectionSolution;
import solution.IsomorphicStringSolution;
import solution.JewelsandStonesSolution;
import solution.MinimumIndexSumSolution;
import solution.SingleNumberSolution;
import solution.SubstringWithoutRepeatingSolution;
import solution.SudokuSolution;
import solution.TwoSumSolution;
import solution.UniqueCharacterSolution;

public class Main {

    public static void main(String[] args) {

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String line = null;
        try {
            line = in.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }

//        System.out.println(new HappyNumberSolution().solution(line));

//        System.out.println(new SingleNumberSolution().solution(line));

//        System.out.println(new TwoSumSolution().solution(line));

//        System.out.println(new IsomorphicStringSolution().solution(line));

//        System.out.println(new MinimumIndexSumSolution().solution(line));

//        System.out.println(new UniqueCharacterSolution().solution(line));

//        System.out.println(new IntersectionSolution().solution(line));

//        System.out.println(new DuplicateSolution().solution(line));

//        System.out.println(new AnagramsSolution().solution(line));

//        System.out.println(new SudokuSolution().solution(line));

//        System.out.println(new DuplicateSubtrees().solution(line));

//        System.out.println(new JewelsandStonesSolution().solution(line));

        System.out.println(new SubstringWithoutRepeatingSolution().solution(line));
    }
}
