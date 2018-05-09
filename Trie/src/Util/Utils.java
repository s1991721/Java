package Util;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by mr.lin on 2018/4/22.
 */
public class Utils {

    public static List<Integer> stringToIntList(String input) {
        String trie = input.substring(1, input.length() - 1);
        List<String> dict = Arrays.asList(trie.split(","));
        List<Integer> list = new ArrayList<Integer>();
        for (String string : dict) {
            list.add(Integer.parseInt(string.trim()));
        }

        return list;
    }

    public static List<String> stringToStringList(String input) {
        String trie = input.substring(1, input.length() - 1);
        List<String> dict = Arrays.asList(trie.split(","));
        List<String> list = new ArrayList<String>();
        for (String string : dict) {
            list.add(string.trim());
        }

        return list;
    }

}
