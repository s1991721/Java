import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import solution.DepthSolution;
import solution.InOrderSolution;
import solution.LCASolution;
import solution.LevelOrderSolution;
import solution.PathSumSolution;
import solution.PostOrderSolution;
import solution.PreOrderSolution;
import solution.SymmetricSolution;

public class Main {

    public static void main(String[] args) {

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String line = null;
        try {
            line = in.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }

//        System.out.println(new NextTreeNodeSolution().solution(line));

//        String[] inputs = line.split("!");
//        System.out.println(new LCASolution().solution(inputs[0], inputs[1], inputs[2]));

//        System.out.println(new PreOrderSolution().solution(line));

//        System.out.println(new InOrderSolution().solution(line));

//        System.out.println(new PostOrderSolution().solution(line));

//        System.out.println(new LevelOrderSolution().solution(line));

//        System.out.println(new DepthSolution().solution(line));

//        System.out.println(new SymmetricSolution().solution(line));

        System.out.println(new PathSumSolution().solution(line));
    }
}
