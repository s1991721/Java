import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import solution.DepthSolution;
import solution.LevelorderSolution;
import solution.PostorderSolution;
import solution.PreorderSolution;

public class Main {

    public static void main(String[] args) {

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String line = null;
        try {
            line = in.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }

//        System.out.println(new PreorderSolution().solution(line));

//        System.out.println(new PostorderSolution().solution(line));

//        System.out.println(new LevelorderSolution().solution(line));

        System.out.println(new DepthSolution().solution(line));

    }
}
