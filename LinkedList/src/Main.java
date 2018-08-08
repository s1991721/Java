import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import solution.AddTwoNumbersSolution;
import solution.CycleSolution;
import solution.IntersectionSolution;
import solution.MergeSolution;
import solution.MyDoublyLinkedListSolution;
import solution.MyLinkedListSolution;
import solution.OddEvenSolution;
import solution.PalindromeSolution;
import solution.RemoveNthFromEndSolution;
import solution.RemoveSolution;
import solution.ReverseSolution;

public class Main {

    public static void main(String[] args) {

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String line = null;
        try {
            line = in.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }

//        System.out.println(new MyLinkedListSolution().solution(""));

//        System.out.println(new CycleSolution().solution(line));

//        System.out.println(new IntersectionSolution().solution(line));

//        System.out.println(new RemoveNthFromEndSolution().solution(line));

//        System.out.println(new ReverseSolution().solution(line));

//        System.out.println(new RemoveSolution().solution(line));

//        System.out.println(new OddEvenSolution().solution(line));

//        System.out.println(new PalindromeSolution().solution(line));

//        System.out.println(new MyDoublyLinkedListSolution().solution(line));

//        System.out.println(new MergeSolution().solution(line));

        System.out.println(new AddTwoNumbersSolution().solution(line));

    }
}
