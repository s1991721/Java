import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import solution.HappyNumberSolution;
import solution.SingleNumberSolution;

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

        System.out.println(new SingleNumberSolution().solution(line));
    }
}
