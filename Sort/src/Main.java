import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import sort.BubbleSort;
import sort.BucketSort;
import sort.InsertionSort;
import sort.RadixSort;
import sort.ShellSort;
import sort.StringSort;
import util.Utils;

public class Main {

    public static void main(String[] args) {

//        System.out.println(new StringSort().sort());

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String line = null;
        try {
            line = in.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }

        int[] numbers = Utils.stringToInts(line);

//        System.out.println(new BubbleSort().sort(numbers));

//        System.out.println(new SelectionSort().sort(numbers));

//        System.out.println(new InsertionSort().sort(numbers));

        System.out.println(new ShellSort().sort(numbers));

//        System.out.println(new MergeSort().sort(numbers));

//        System.out.println(new QuickSort().sort(numbers));

//        System.out.println(new HeapSort().sort(numbers));

//        System.out.println(new CountingSort().sort(numbers));

//        System.out.println(new BucketSort().sort(numbers));

//        System.out.println(new RadixSort().sort(numbers));
    }


}
