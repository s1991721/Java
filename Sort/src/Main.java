import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import sort.BubbleSort;
import util.Utils;

public class Main {

    public static void main(String[] args) {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String line = null;
        try {
            line = in.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }

        int[] numbers = Utils.stringToInts(line);

        System.out.println(new BubbleSort().sort(numbers));
    }


}
