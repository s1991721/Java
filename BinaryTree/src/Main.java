import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import solution.LCASolution;

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


        String[] inputs = line.split("!");
        System.out.println(new LCASolution().solution(inputs[0], inputs[1], inputs[2]));

    }
}
