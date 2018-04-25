import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import solution.MapSumSolution;
import solution.MaxXORSolution;
import solution.ReplaceSolution;
import solution.SearchSolution;
import solution.TrieSolution;

public class Main {

    public static void main(String[] args) {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String line = null;
        try {
            line = in.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }

//        System.out.println(new ReplaceSolution().solution(line));
//
        System.out.println(new MaxXORSolution().solution(line));
//
//        System.out.println(new TrieSolution().solution(line));
//
//        System.out.println(new MapSumSolution().solution(line));

//        System.out.println(new SearchSolution().solution(line));
    }
}
