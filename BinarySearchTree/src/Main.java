import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import solution.IsBalanceSolution;
import solution.ToBSTSolution;

public class Main {

    public static void main(String[] args) {

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String line = null;
        try {
            line = in.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }

//        System.out.println(new ValidBSTSolution().solution(line));

//        System.out.println(new IteratorSolution().solution(line));

//        System.out.println(new SearchSolution().solution(line));

//        System.out.println(new InsertSolution().solution(line));

//        System.out.println(new DeleteSolution().solution(line));

//        System.out.println(new KThSolution().solution(line));

//        System.out.println(new ContainsDuplicate3Solution().solution(line));

//        System.out.println(new IsBalanceSolution().solution(line));

        System.out.println(new ToBSTSolution().solution(line));
    }
}
