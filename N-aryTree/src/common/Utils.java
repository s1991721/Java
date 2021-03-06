package common;

import com.google.gson.Gson;

import java.util.ArrayList;
import java.util.List;

import model.Node;

/**
 * Created by mr.lin on 2018/4/17.
 */
public class Utils {

    public static Node stringToNode(String input) {
        Gson gson = new Gson();
        return gson.fromJson(input, Node.class);
    }

    public static String listToString(List<Integer> list) {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("[");
        for (Integer integer : list) {
            stringBuffer.append(String.valueOf(integer)).append(",");
        }
        stringBuffer.deleteCharAt(stringBuffer.length() - 1);
        stringBuffer.append("]");
        return stringBuffer.toString();
    }

    public static String list2ToString(List<ArrayList<Integer>> list) {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("[").append("\n");
        for (List<Integer> l : list) {
            stringBuffer.append(listToString(l)).append("\n");
        }
        stringBuffer.append("]");
        return stringBuffer.toString();
    }

}
