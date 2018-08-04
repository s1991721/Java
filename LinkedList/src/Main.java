import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import solution.CycleSolution;
import solution.IntersectionSolution;
import solution.MyLinkedListSolution;
import solution.RemoveNthFromEndSolution;

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

        System.out.println(new RemoveNthFromEndSolution().solution(line));

    }
}
